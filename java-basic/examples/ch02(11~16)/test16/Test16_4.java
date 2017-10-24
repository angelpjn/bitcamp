
package bitcamp.java100.ch02.test16;

public class Test16_4 {
    public static void main(String[] args) {
    	System.out.println("· while 문법 : ");
    	
    	int i = 0;
    	while (i < 5) 
    		System.out.println(i++);
    	System.out.println();
    	
    	System.out.println("· {} 활용 여러 문장 실행 : ");
    	
    	i = 0;
    	while (i < 5) {
    		System.out.print("=> ");
    		System.out.println(i);
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 while문 : ");
    	
    	i = 1;
    	while (i <= 5) {
    		int count = 1;
    		while (count <= i) {
    		System.out.print("*");
    		count++;
    		}
    		System.out.println();
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 while문 연습 1 : ");
    	
    	i = 1;
    	while (i <= 5) {
    		int count = 5 - i;
    		while (count > 0) {
    			System.out.print(" ");
    			count--;
    		}
    		count = 1;
    		while (count <= i) {
    		System.out.print("*");
    		count++;
    		}
    		System.out.println();
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 while문 연습 2 : ");
    	
    	i = 1;
    	while (i <= 3) {
    		int count = 3 - i;
    		while (count > 0) {
    			System.out.print(" ");
    			count--;
    		}
    		count = 1;
    		while (count <= 2 * i - 1) {
    		System.out.print("*");
    		count++;
    		}
    		System.out.println();
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 while문 연습 2_강사님 : ");
    	
    	i = 1;
    	while (i <= 5) {
    		int count = (5 - i) / 2;
    		while (count > 0) {
    			System.out.print(" ");
    			count--;
    		}
    		count = 1;
    		while (count <= i) {
    		System.out.print("*");
    		count++;
    		}
    		System.out.println();
    		i += 2;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 while문 연습 3 : ");
    	
    	i = 1;
    	while (i <= 5) {
    		int count = 5;
    		while (count >= i) {
    		System.out.print("*");
    		count--;
    		}
    		count = i;
    		while (count > 0) {
    		System.out.print(" ");
    		count--;
    		}
    		System.out.println();
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 while문 연습 4 : ");
    	i = 5;
        while (i > 0) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i -= 2;
        }
    	System.out.println();
    	
    	System.out.println("· 반복문 빠져 나가기_break 활용 : ");
    	i = 0;
    	while (i < 5) {
    		if (i == 3) {
    			break;
    		}
    		System.out.println(i);
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· continue 활용 : ");
    	i = 0;
    	while (i < 5) {
    		if (i == 3) {
    			i++;
    			continue;
    		}
    		System.out.println(i);
    		i++;
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 반복문 전체 빠져나가기 1_label 활용 : ");
    	i = 1;
    	label1 : {
	    	while (i <= 10) {
	    		int count = 1;
	    		while (count <= i) {
	    			System.out.print("*");
	    			if (count == 5) {
//	    				break; // 현재 반복문 탈출
	    				break label1; // label1 블록을 탈출
	    			}
	    			count++;
	    		}
	    		System.out.println();
	    		i++;
	    	}
    	}
    	System.out.println();
    	
    	System.out.println("· 중첩 반복문 전체 빠져나가기 2_label 활용_{} 삭제 : ");
    	i = 1;
    	label1 :
    	while (i <= 10) {
    		int count = 1;
    		while (count <= i) {
    			System.out.print("*");
    			if (count == 5) {
//	    				break; // 현재 반복문 탈출
    				break label1; // label1 블록을 탈출
    			}
    			count++;
    		}
    		System.out.println();
    		i++;
    	}
    	System.out.println();
    	System.out.println();
    	
    	System.out.println("· while문 연습_구구단 출력 : ");
    	/*
    	 * 출력 예
    	 * 2 * 1 = 2
    	 * 2 * 2 = 4
    	 * .
    	 * .
    	 * .
    	 * 9 * 9 = 81
    	 */
    	int a = 2;
    	while (a <= 9) {
    		int b = 1;
    		while (b <= 9) {
    			System.out.println(a + " * " + b + " = " + a * b );
    			b++;
    		}
    		System.out.println();
    		a++;
    	}
    	System.out.println();

    	System.out.println("· while문 연습_주어진 숫자 역순 출력 : ");
    	/*
    	 * 주어진 값 => 987654321
    	 * 출력 => 1 2 3 4 5 6 7 8 9 
    	 */
    	int c = 987654321;
    	while (c > 0) {
    		System.out.print(c % 10 + "\t");
    		c /= 10;
    	}
    	System.out.println();
    	System.out.println();

    	System.out.println("· while문 연습_주어진 숫자 출력 : ");
    	/*
    	 * 주어진 값 => 4884325
    	 * 출력 =>
    	 * 0 = 0 
    	 * 1 = 0
    	 * 2 = 1
    	 * 3 = 2
    	 * 4 = 1
    	 * 5 = 1
    	 * 6 = 0
    	 * 7 = 0
    	 * 8 = 2
    	 * 9 = 0
    	 */
    	    	
    	i = 4885323;
    	int[] cnt = new int[10];
    	while (i > 0) {
    		cnt[i % 10]++;  // 해당 배열을 증가하여 대입
    		i /= 10;
    	}
    	
    	int x = 0;
    	while (x < cnt.length) {
    		System.out.printf("%d = %d\n", x, cnt[x]);
    		x++;
    	}
    	System.out.println();
    }
}




































