// 5단계 : 예외처리 정교화

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

public class Test21_5_5 {

	static Console console;
    	
    static void prepareInput() {
    	console = System.console();

    	if (console == null) {
    		throw new RuntimeException("콘솔 생성 오류!");
    	}
    }

	static int promptGugudan() {
		int i = Integer.parseInt(console.readLine("구구단? => "));
		
		if (i >= 10 || i == 1 || i < 0) {
			throw new RuntimeException("구구단의 범위를 초과했습니다.");
			
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
		} catch (RuntimeException e) {
				System.err.println("콘솔 입력을 지원하지 않습니다.");
				System.exit(1);
		}
		
		while (true) {
			int i = 0;
			try {
				i = promptGugudan();
				if (i == 0) break;
				printGugudan(i);
			} catch (RuntimeException e) {
				System.err.println("구구단의 범위가 아닙니다.");
			}
		}
		System.out.println("다시 또 오세요!");
    }
}


















