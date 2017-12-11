package step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Servlet05 {
    public static void main(String[] args) throws Exception {
        try (
             Socket socket = new Socket("localhost", 9999);
             PrintStream out = new PrintStream(socket.getOutputStream());
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));) {

             out.println("GET /java-web/step8/Servlet01_GET.html HTTP/1.1");
             out.println("Host: localhost");
             out.println();

             String str = null;
             while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        
        } catch (Exception e) {}

        System.out.println("----------------------------------------------------");
        
        try (
                Socket socket = new Socket("localhost", 9999);
                PrintStream out = new PrintStream(socket.getOutputStream());
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));) {
            
            out.println("HEAD /java-web/step8/Servlet01_GET.html HTTP/1.1");
            out.println("Host: localhost");
            out.println();
            
            String str = null;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            
        } catch (Exception e) {}
    }
}
