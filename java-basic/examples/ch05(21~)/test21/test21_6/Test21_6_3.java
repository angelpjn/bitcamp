// 1단계 : 입력 문자열을 그대로 이용하기

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
package bitcamp.java100.test21.test21_6;

import java.io.Console;

public class Test21_6_3 {
	
    public static void main(String[] args) {

    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}

    	long l = 0;
    	int [] arr = new int [10];
    	
    	StringBuffer buf = new StringBuffer(console.readLine("숫자? => "));
    	
    	for (int i = 0; i < buf.length(); i++) {
    		arr[buf.charAt(i) - '0']++; // '0'의 10진수 ASCII 코드 값 : 48
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		System.out.printf("%d = %d\n", i, arr[i]);
    	}
    }
}








