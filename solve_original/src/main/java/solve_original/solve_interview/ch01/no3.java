/*
1.3 URL화 : 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔 주는 메서드를 작성하라.
최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있으며
문자열의 최종 길이가 함께 주어진다고 가정해도 된다.
자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열(char[])을 이용하길 바란다.

- 예제
· 입력 : "Mr John Smith", 13
· 출력 : "Mr%20John%20Smith"
*/
package solve_original.solve_interview.ch01;
import java.util.Scanner;

public class no3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
  
        System.out.print("문자 입력 : ");        
        String strTemp1 = scan.nextLine();
        
        char[] ch1 = new char[strTemp1.length()];
        
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = strTemp1.charAt(i);
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ' ') {
                System.out.print("%20");
                continue;
            }
            System.out.print(ch1[i]);
        }
        System.out.println();
    }
}
