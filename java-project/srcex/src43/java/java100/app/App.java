//:   
package java100.app;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import java100.app.beans.ApplicationContext;
import java100.app.control.BoardController;
import java100.app.control.Controller;
import java100.app.control.MemberController;
import java100.app.control.Request;
import java100.app.control.Response;
import java100.app.control.RoomController;
import java100.app.control.ScoreController;
import java100.app.dao.BoardDao;
import java100.app.dao.MemberDao;
import java100.app.dao.RoomDao;
import java100.app.dao.ScoreDao;
import java100.app.util.DataSource;

public class App {

    ServerSocket ss;
    Scanner keyScan = new Scanner(System.in);

    void init() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUserName("study");
        ds.setPassword("1111");
        
        ScoreDao scoreDao = new ScoreDao();
        scoreDao.setDataSource(ds);
        
        MemberDao memberDao = new MemberDao();
        memberDao.setDataSource(ds);
        
        BoardDao boardDao = new BoardDao();
        boardDao.setDataSource(ds);
        
        RoomDao roomDao = new RoomDao();
        roomDao.setDataSource(ds);
        
        ScoreController scoreController = new ScoreController();
        scoreController.setScoreDao(scoreDao);
        scoreController.init();
        ApplicationContext.addBean("/score", scoreController);
        
        MemberController memberController = new MemberController();
        memberController.setMemberDao(memberDao);
        memberController.init();
        ApplicationContext.addBean("/member", memberController);
        
        BoardController boardController = new BoardController();
        boardController.setBoardDao(boardDao);
        boardController.init();
        ApplicationContext.addBean("/board", boardController);
        
        RoomController roomController = new RoomController();
        roomController.setRoomDao(roomDao);
        roomController.init();
        ApplicationContext.addBean("/room", roomController); 

    }

    void service() throws Exception {
        ss = new ServerSocket(9999);
        System.out.println("서버 실행!");
        
        while (true) {
            new HttpAgent(ss.accept()).start();
        }
    }

    private void request(String command, PrintWriter out) {

        String menuName = command;

        int i = command.indexOf("/", 1);
        if (i != -1) {
            menuName = command.substring(0, i);
        }

        Object controller = ApplicationContext.getBean(menuName);

        if (controller == null && controller instanceof Controller) {
            out.println("해당 명령을 지원하지 않습니다.");
            return;
        }

        Request request = new Request(command);
        
        Response response = new Response();
        response.setWriter(out);
        
        ((Controller)controller).execute(request, response);
    }

    private void hello(String command, PrintWriter out) {
        out.println("안녕하세요. 성적관리 시스템입니다.");
        out.println("[성적관리 명령들]");
        out.println("목록보기: /score/list");
        out.println("상세보기: /score/view?name=이름");
        out.println("등록: /score/add?name=이름&kor=점수&eng=점수&math=점수");
        out.println("변경: /score/update?name=이름&kor=점수&eng=점수&math=점수");
        out.println("삭제: /score/delete?name=이름");
        out.println("[회원]");
        out.println("[게시판]");
        out.println("[강의실]");

    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.init();
        app.service();
    }
    
    class HttpAgent extends Thread {
        Socket socket;
        
        public HttpAgent(Socket socket) {
            this.socket = socket;
        }
        
        @Override
        public void run() {
            try (
                    Socket socket = this.socket; // 왜? 자동 close() 호출!
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(
                            new BufferedOutputStream(socket.getOutputStream()));
                    ) {
                String command = in.readLine().split(" ")[1];

                // => header 읽기
                String header = null;
                while (true) {
                    header = in.readLine();
                    if (header.equals("")) // 빈 줄을 만나면 요청 데이터의 끝!
                        break;
                }
                
                out.println("HTTP/1.1 200 OK");
                
                out.println("Content-Type:text/plain;charset=UTF-8");
                
                out.println();
                
                if (command.equals("/")) {
                    hello(command, out);
                } else {
                    request(command, out);
                }
                out.println(); // 응답을 완료를 표시하기 위해 빈줄 보냄.
                out.flush();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}















