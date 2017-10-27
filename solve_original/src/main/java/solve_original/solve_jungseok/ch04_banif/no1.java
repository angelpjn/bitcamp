/* 
[4-1] 다음의 문장들을 조건식으로 표현하라.
1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
않을 때 true인 조건식
7. boolean형 변수 powerOn가 false일 때 true인 조건식
8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
 */

package solve_original.solve_jungseok.ch04_banif;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("정수 입력 : ");
        int x = scan.nextInt();
        if (10 < x && x < 20 ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
        System.out.print("문자 입력 : ");
        char ch = scan.next().charAt(0);
        if (ch != '\t' && ch != ' ') {
            System.out.println(true);
        }
    }
}
