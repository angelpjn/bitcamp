package bitcamp.java100.practice.test;

public class MessageBox {
    
    ConsoleObject consoleobj = new ConsoleObject();
    
    boolean confirm(String message) {
        String response = consoleobj.console.readLine(message).toLowerCase();
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }
    
}
