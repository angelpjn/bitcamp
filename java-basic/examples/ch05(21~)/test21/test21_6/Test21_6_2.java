// 2단계 : 기능에 따라 메서드 분기

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

public class Test21_6_2 {
	
	static Console console;
	
	static void prepareConsole() {
		console = System.console();
		
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
			System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
		}
	}

	static long inputNumber() {
		return Long.parseLong(console.readLine("숫자? => "));
	}
	
	static int[] countNumbers(long l) {
		int[] arr = new int [10];

		while (l > 0) {
			arr[(int)(l % 10)]++;  // 배열의 index는 int만 올 수 있으므로 결과를 int로 type casting
			l /= 10;
		}
		return arr;
	}
	
	static void printNumberCount(int[] arr) {
		int j = 0;
		while (j < arr.length) {
			System.out.printf("%d = %d\n", j, arr[j]);
			j++;
		}
	}
    public static void main(String[] args) {
    	
    	prepareConsole();
    	
    	long l = inputNumber();
    	
    	int[] arr = countNumbers(l);
    	
    	printNumberCount(arr);

    }
}








