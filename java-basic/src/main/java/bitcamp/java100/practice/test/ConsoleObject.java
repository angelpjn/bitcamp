package bitcamp.java100.practice.test;

import java.io.Console;

public class ConsoleObject {
    
    Console console = System.console();
    
    void prepareConsole() {
        if (console == null) {
            System.err.println("콘솔 지원 불가");
            System.exit(1);
        }
    }
}
