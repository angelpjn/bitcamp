// 2단계 : 기능별 메서드 분리

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

public class Test21_7_2 {

	static Console console;
	
	static void prepareConsole() {
		console = System.console();
		
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다."); 
			System.out.println("콘솔을 지원하지 않습니다.");
			System.exit(1);
		}
	}
	
	static String inputString() {
		return console.readLine("문자열? => ");
	}

	static String reverseString(String str) {
		StringBuffer buf = new StringBuffer();
		buf.append(str);
		
		int len = buf.length() / 2;
		
		for (int left = 0, right = buf.length() -1; left < len; left++, right--) {
			char ch = buf.charAt(left); // 왼쪽 끝부터 하나씩 저장
			buf.setCharAt(left,  buf.charAt(right)); // 왼쪽 끝 자리에 오른쪽 끝 문자 저장
			buf.setCharAt(right, ch); // 오른쪽에 왼쪽 끝 문자 저장한 값을 저장
		}
		return buf.toString();
	}
    public static void main(String[] args) {
    	
    	prepareConsole();
    	
    	String str = inputString();
    	String str2 = reverseString(str);
    	
        System.out.printf("입력한 값 : %s\n", str);
        System.out.printf("거꾸로 바꾼 값 : %s\n", str2);
    }
}
    	
    	
/* 연습 중

    
    Console console = System.console();
    
    if (console == null) {
    	System.err.println("콘솔을 지원하지 않습니다."); 
    	System.out.println("콘솔을 지원하지 않습니다.");
    	System.exit(1);
    }
    
    String str = console.readLine("문자열? => ");
    
    StringBuffer buf = new StringBuffer();
    System.out.println(buf.append(str));
    
    int len = buf.length() / 2;
    
    for (int left = 0, right = buf.length() -1; left < len; left++, right--) {
    	char ch = buf.charAt(left); // 왼쪽 끝부터 하나씩 저장
    	buf.setCharAt(left,  buf.charAt(right)); // 왼쪽 끝 자리에 오른쪽 끝 문자 저장
    	buf.setCharAt(right, ch); // 오른쪽에 왼쪽 끝 문자 저장한 값을 저장
    }
    
    System.out.printf("입력한 값 : %s\n", str);
    System.out.printf("거꾸로 바꾼 값 : %s\n", buf);
}
*/
/* 반복문 사용
 
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
*/

/* StringBuffer 사용
    	
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}


    	String str = console.readLine("문자열?(AB2CTT980) => ");
    	
    	System.out.printf("입력한 값 : %s\n", str);
    	StringBuffer sb = new StringBuffer(str);
    	sb.reverse();
    	System.out.println("거꾸로 바꾼 값: " + sb.toString());
*/














