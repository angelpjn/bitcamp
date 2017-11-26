package bitcamp.java100.ch15.ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버를 실행하였다!");
        
        Socket socket = ss.accept(); // 대기열의 클라이언트 정보 중 하나와 연결 가능하도록 소켓을 만들어 리턴
        System.out.println("클라이언트와 연결되었음!");
        System.out.printf("서버 IP = %s\n", socket.getLocalAddress().getHostAddress());
        System.out.printf("서버 Port = %d\n", socket.getLocalPort());
        System.out.printf("클라이언트 IP = %s\n", socket.getInetAddress().getHostAddress());
        System.out.printf("클라이언트 Port = %d\n", socket.getPort());
        
        ss.close();
        System.out.println("서버를 종료하였다!");
    }
}