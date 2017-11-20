package practice;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import practice.controll.Controller;
import practice.controll.Request;
import practice.controll.Response;
import practice.controll.ScoreController;

public class My {
    Scanner keyScan = new Scanner(System.in);
    
    HashMap<String, Controller> controllerMap = 
            new HashMap<>();

    void init() {
        controllerMap.put("/score", new ScoreController("./data/score.csv"));
//        controllerMap.put("/member", new MemberController("./data/member.csv"));
//        controllerMap.put("/board", new BoardController("./data/board.csv"));
//        controllerMap.put("/room", new RoomController("./data/room.csv"));
    }
    
    void service() throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 실행!");

        loop:
        while (true) {

            try (
                    Socket socket = ss.accept();
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(
                            new BufferedOutputStream(socket.getOutputStream()));
                    ) {
                while (true) {
                    String command = in.readLine();
                    
                    if (command.equals("/")) {
                        hello(command, out);
                    } else if (command.equals("quit")) {
                        break;
                    } else if (command.equals("server stop")) {
                        break loop;
                    } else {
                        request(command, out);
                    }
                    out.println();
                    out.flush();
                } 
            } catch (Exception e) {}
        }
        
        Collection<Controller> controllers = controllerMap.values();
        for (Controller contorller : controllers) {
            contorller.destroy();
        }
        ss.close();
    }    
    
    private void request(String command, PrintWriter out) {
        
        String menuName = command;
        
        int i = command.indexOf("/", 1);
        if (i != -1) {
            menuName = command.substring(0, i);
        }
        
        Controller controller = controllerMap.get(menuName);
        
        if (controller == null) {
            out.println("해당 명령을 지원하지 않습니다.");
            return;
        }
        
        Request request = new Request(command);
        
        Response response = new Response();
        response.setWriter(out);
        
        controller.execute(request, response);
    }

    private void hello(String command, PrintWriter out) {
        out.println("안녕하세요. 성적관리 시스템입니다.");
    }

    public static void main(String[] args) throws Exception {
        My my = new My();
        my.init();
        my.service();
    }
}
