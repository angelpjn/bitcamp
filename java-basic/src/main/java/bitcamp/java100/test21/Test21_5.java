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
package bitcamp.java100.test21;

import java.io.Console;

public class Test21_5 {

    public static void main(String[] args) {

    	class MultiplecationTable { // non-static(method 밖에서 만들면 static 붙일 수 있음)
    		int i, j;
    	}
    	
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}

    	MultiplecationTable mt = new MultiplecationTable();

    	mt.i = Integer.parseInt(console.readLine("구구단? => "));
    	
    	if ((mt.i >= 10) | ((mt.i == 1))){
    		System.out.println("2에서 9단까지만 가능합니다!");
    	} else if (mt.i == 0) {
    		System.out.println("다음에 또 봐요!");
    	} else {
	    	for (mt.j = 1; mt.j <= 9; mt.j++) {
				System.out.println(mt.i + " * " + mt.j +" = " + mt.i * mt.j);
			}
    	}
    }
}


















