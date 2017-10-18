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
package bitcamp.java100.test21;

import java.io.Console;

public class Test21_6 {

    public static void main(String[] args) {

    	class Count { // non-static(method 밖에서 만들면 static 붙일 수 있음)
    		int[] arr;
    		int i, j;
    	}
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
    	}

    	Count count = new Count();

    	count.i = Integer.parseInt(console.readLine("숫자? => "));
    	count.arr = new int[10];
    	
    	while (count.i > 0) {
    		count.arr[count.i % 10]++;
    		count.i /= 10;
    		}
    	count.j = 0;
    	while (count.j < count.arr.length) {
    		System.out.printf("%d = %d\n", count.j, count.arr[count.j]);
    		count.j++;
    	}
    	System.out.println();
    }
}

















