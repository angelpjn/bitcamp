// 1단계 : if ~ else if ~ else

/*
 	- 구구단 번호 입력 받아 출력!
 	- 실행 예)
 	
 	구구단? 2
 	2 * 1 = 2
 	2 * 2 = 4
 	2 * 3 = 6
 	...
 	2 * 9 = 18
 	-----------------
 	구구단? 10
 	2에서 9단까지만 가능합니다!
 	구구단? 1
 	2에서 9단까지만 가능합니다!
 	구구단? 0 					// 0 이하의 수를 입력하면 종료하라!
 	다음에 또 봐요!
 	>
 */

package bitcamp.java100.practice.ptest21_5;

import java.io.Console;

public class Ptest21_5_3 {
    
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            System.out.println("콘솔 어쩌고");
            System.exit(1);
        }
    }
    
    static int initMultiple() {
        int i = Integer.parseInt(console.readLine("구구단? => "));
        
        
        if (i >= 10 || i == 1) {
            System.out.println("2에서 9단까지만 가능합니다!");
            System.exit(1);;
            
        } else if (i == 0) {
            System.out.println("다음에 또 봐요!");
            System.exit(1);;
        }
        return i;
    }
    
    static void computeMultiple(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
    }
    
    public static void main(String[] args) {

        prepareConsole();
        
        int i = initMultiple();

        computeMultiple(i);
    }
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
            System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
        }
    }
    
    static int planMultiple() {
        int i = Integer.parseInt(console.readLine("구구단? => "));
        if ((i >= 10) || ((i == 1))){
            System.out.println("2에서 9단까지만 가능합니다!");
            System.exit(1);
            
        } else if (i == 0) {
            System.out.println("다음에 또 봐요!");
            System.exit(1);
        }
        
        return i;
    }
    
    static void computeMultiple(int i) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " * " + j +" = " + i * j);
        }
    }
    
    
    public static void main(String[] args) {

        prepareConsole();

        int i = planMultiple();
    	
    	computeMultiple(i);
    }
}
*/

















