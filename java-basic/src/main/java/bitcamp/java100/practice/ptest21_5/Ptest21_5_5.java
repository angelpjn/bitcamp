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

public class Ptest21_5_5 {
    
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            throw new RuntimeException("사용 불가 : 콘솔 레퍼런스 없음");
        }
    }
    
    static int initMultiple() {
        int i = Integer.parseInt(console.readLine("구구단? => "));
        
        if (i < 0 || i == 1 || i >= 10) {
            throw new RuntimeException("구구단 범위 초과");
        }
        
        return i;
    }
    
    static void computeMultiple(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
    }
    
    public static void main(String[] args) {
        
        try {
            prepareConsole();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
        while (true) {
            try {
            int i = initMultiple();
                if (i == 0) break;
                computeMultiple(i);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("그만해라");
    }
}















