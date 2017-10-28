/*
[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
(1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.

[실행결과]
1과 100사이의 값을 입력하세요 :50
더 큰 수를 입력하세요.
1과 100사이의 값을 입력하세요 :75
더 큰 수를 입력하세요.
1과 100사이의 값을 입력하세요 :87
더 작은 수를 입력하세요.
1과 100사이의 값을 입력하세요 :80
더 작은 수를 입력하세요.
1과 100사이의 값을 입력하세요 :77
더 작은 수를 입력하세요.
1과 100사이의 값을 입력하세요 :76
맞췄습니다.
시도횟수는 6번입니다.
*/
package ch04_BanIf;

import java.util.Scanner;

public class no14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = (int)(Math.random() * (100 - 1) + 1);
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = scan.nextInt();
            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        } while (input != answer);
        System.out.println("맞췄습니다.");
        System.out.println("시도 횟수는 " + count + "번입니다.");
    }
} 



























