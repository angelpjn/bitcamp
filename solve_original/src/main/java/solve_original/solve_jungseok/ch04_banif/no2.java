/* 
[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
*/

package solve_original.solve_jungseok.ch04_banif;

import java.util.Scanner;

public class no2 {

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
