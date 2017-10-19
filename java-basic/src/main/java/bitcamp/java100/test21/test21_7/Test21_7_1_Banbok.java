// 1단계 : 문제 해결
/*
## 키보드로부터 입력 받기 - 연습3
   - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
   - 실행 예) 
     문자열? (AB2CTT980)
     입력한 값: AB2CTT980
     꺼꾸로 바꾼 값: 089TTC2BA
     > 
 */
package bitcamp.java100.test21.test21_7;

import java.io.Console;
import java.util.ArrayList;

public class Test21_7_1_Banbok {

    public static void main(String[] args) {
    	
        class ReversePrint {
            String str;
            String[] arr;
        }
                
        Console console = System.console();
        
        if (console == null) {
        System.err.println("콘솔을 지원하지 않습니다."); 
        System.out.println("콘솔을 지원하지 않습니다.");
        System.exit(1);
        }
        
        ReversePrint rp = new ReversePrint();
        
        rp.str = console.readLine("문자열? (AB2CTT980) => ");
        int end = rp.str.length();
        rp.arr = new String[end];
        
        System.out.print("입력한 값: ");
        for (int i = 0; i < end; i++) {
            System.out.print(rp.arr[i] = rp.str.substring(i, i + 1));
        }
        System.out.println();
        System.out.print("거꾸로 바꾼 값: ");
        for (int i = 0; i < end; i++) {
            System.out.print(rp.arr[end - i - 1]);
        }
        System.out.println(); 
    }
}
