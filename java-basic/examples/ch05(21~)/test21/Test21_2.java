
package bitcamp.java100.test21;

import java.io.Console;

public class Test21_2 {

    public static void main(String[] args) {
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.out.println("콘솔을 지원하지 않습니다."); // out은 색이 하양
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}
    	
    	String line = console.readLine("입력하세요 : ");
    	System.out.println(line);
    }
}


















