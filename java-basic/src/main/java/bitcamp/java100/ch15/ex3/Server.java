package bitcamp.java100.ch15.ex3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999, 3);
        System.out.println("서버를 실행하였다!");

        Socket socket = ss.accept(); // 대기열의 클라이언트 정보 중 하나와 연결 가능하도록 소켓을 만들어 리턴

        Scanner in = new Scanner(socket.getInputStream());
        
        String line = in.nextLine();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        out.println(line);
        
        in.close();
        out.close();
        
        socket.close();

        ss.close();
        System.out.println("서버를 종료하였다!");
    }
}
