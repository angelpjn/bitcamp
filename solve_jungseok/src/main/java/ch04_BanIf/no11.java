/*
[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.

※ Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.

[실행결과]
1,1,2,3,5,8,13,21,34,55
*/

package ch04_BanIf;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.print("자리 수 입력 : ");
        int length = scan.nextInt();

        int[] num = new int[length];
        num[0] = 1;
        num[1] = 1;
        
        for (int i = 0 ; i < length ; i++ ) {
            if (i < 2) {
                continue;
            } else {
                num[i] = num[i - 2] + num[i - 1];
            }
        }

        System.out.print("출력 인덱스 선택 : ");
        int choice = scan.nextInt() - 1;
        
        System.out.println(num[choice]);
    }
}

/*
기존 코드
int num1 = 1;
int num2 = 1;
int num3 = 0; 
*/