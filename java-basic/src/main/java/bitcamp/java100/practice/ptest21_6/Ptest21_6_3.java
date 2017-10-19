// 1단계 : 프로그램 작성

/*
## 키보드로부터 입력 받기 - 연습2
 - 다음과 같이 사용자로부터 숫자를 입력 받아 각 숫자의 개수를 세시오.
 - 실행 예) 
   숫자? 23347651
   0 = 0
   1 = 1
   2 = 1
   3 = 2
   4 = 1
   5 = 1
   6 = 1
   7 = 1
   8 = 0
   9 = 0
   > 
 */
package bitcamp.java100.practice.ptest21_6;

import java.io.Console;

public class Ptest21_6_3 {

    public static void main(String[] args) {

        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔 지원 불가!");
            System.exit(1);
        }
        
        StringBuffer sb = new StringBuffer(console.readLine("숫자? => "));

        int[] arr = new int[10];
        
        for (int i = 0; i < sb.length(); i++) {
            arr[sb.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d = %d\n", i, arr[i]);
        }
    }
}








