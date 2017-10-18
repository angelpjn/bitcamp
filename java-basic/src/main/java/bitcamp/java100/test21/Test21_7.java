/*
## 키보드로부터 입력 받기 - 연습3
   - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
   - 실행 예) 
     문자열? (AB2CTT980)
     입력한 값: AB2CTT980
     꺼꾸로 바꾼 값: 089TTC2BA
     > 
 */
package bitcamp.java100.test21;

import java.io.Console;

public class Test21_7 {

    public static void main(String[] args) {

    	class ReverseSort { // non-static(method 밖에서 만들면 static 붙일 수 있음)
    		String str;
    	}
    	
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}

    	ReverseSort rs = new ReverseSort();

    	rs.str = console.readLine("문자열?(AB2CTT980) => ");
    	
    	System.out.printf("입력한 값 : %s\n", rs.str);
    	StringBuffer sb = new StringBuffer(rs.str);
    	sb.reverse();
    	System.out.println(sb.toString());
    }
}


















