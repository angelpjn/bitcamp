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
package bitcamp.java100.practice;

import java.io.Console;

public class Practice2 {

    public static void main(String[] args) {

        class InputNum {
            int[] arr = new int[10];
        }
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); 
            System.out.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        
        int i, j;
        
        InputNum inNum = new InputNum();
        
        i = Integer.parseInt(console.readLine("숫자 ? => "));
        
        while (i > 0) {
            inNum.arr[i % 10]++;
            i /= 10;
        }
        
        System.out.println("---결과출력---"); 

        for (j = 0; j < inNum.arr.length; j++) {
            System.out.printf("%d = %d\n", j, inNum.arr[j]);
        }
    }
}


















