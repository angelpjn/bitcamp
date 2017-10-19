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
package bitcamp.java100.practice.ptest21_7;

import java.io.Console;
import java.util.ArrayList;

public class Ptest21_7_2 {
    
    static Console console;
    
    static void prepareConsole() {
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔 사용 불가");
            System.exit(1);
        }
    }

    static String initString() {
        String str = console.readLine("문자열 : ");
        return str;
    }
    
    static StringBuffer initStringBuffer(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        return sb;
    }
    
    static int countsbLength(StringBuffer sb) {
        int len = sb.length() / 2;
        return len;
    }
    
    static void printChar(String str, StringBuffer sb, int len) {
        for (int left = 0, right = sb.length() - 1; left < len; left++, right--) {
            char ch = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, ch);
        }
        System.out.printf("입력한 값 : %s\n", str);
        System.out.printf("출력한 값 : %s\n", sb);
        }
    
    public static void main(String[] args) {
        
        prepareConsole();
        
        String str = initString();
        
        StringBuffer sb = initStringBuffer(str);
        
        int len = countsbLength(sb);
        
        printChar(str, sb, len);
        
    }
}
