// 4단계 : 예외처리 추가

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

package bitcamp.java100.test21.test21_5;

import java.io.Console;

public class Test21_5_4 {

	static Console console;
    	
    static void prepareInput() {
    	console = System.console();

    	if (console == null) {
    		throw new RuntimeException("콘솔 생성 오류!");
    	}
    }

	static int promptGugudan() {
		int i = Integer.parseInt(console.readLine("구구단? => "));
		
		if (i >= 10 || i == 1) {
			throw new RuntimeException("구구단의 범위를 초과했습니다.");
			
		} else if (i == 0) {
			System.out.println("다음에 또 봐요!");
			System.exit(1);;

		}
		
		return i;
	}
	
	static void printGugudan(int i) {
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j +" = " + i * j);
		}
	}
    	
	public static void main(String[] args) {
	
		try {
			prepareInput();
			
			int i = promptGugudan();
			
			printGugudan(i);
			
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
    }
}


















