
package bitcamp.java100.test21;

import java.util.Scanner;

public class Test21_1 {

    public static void main(String[] args) {
    	Scanner keyScan = new Scanner(System.in);

    	System.out.print("입력하세요! : ");
    	String line = keyScan.nextLine();
    	
    	System.out.println(line);
    	
    	keyScan.close(); // 종료되지 않는 실행 프로그램에서 문제가 된다.(server-side program의 경우)
    }
}





































