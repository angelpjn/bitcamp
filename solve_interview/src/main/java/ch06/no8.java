/*
6.8 계란 떨어뜨리기 문제 : 100층짜리 건물이 있다. N층 혹은 그 위 어딘가에서 계란이 떨어지면 그 계란은 부서진다.
하지만 N층 아래 어딘가에서 떨어지면 깨지지 않는다. 계란 두 개가 주어졌을 때, 최소 횟수로 계란을 떨어뜨려서
N을 찾으라.
*/

package ch06;

import java.util.Scanner;

public class No8 {

    static Scanner scan = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {

        int answer = 100;
        int check = 1;
        int gap = 0;

        while (true) {
            if (check == answer) {
                break;
            } else if (check < answer) {
                goDown(check, answer);
            } else {
                goUp(check, answer);
            }
        }
        System.out.printf("계란은 %d 층 이하에서 깨지지 않는다.\n찾은 횟 수는 %d 회이다.\n", check, count);
    }

    static void goUp(int check, int answer) {
        int gap = check - answer;
        if (gap % 2 != 0)
            check++;
        check -= gap / 2;
        count++;
    }

    static void goDown(int check, int answer) {
        int gap = answer - check;
        if (gap % 2 != 0) 
            gap++;
        check += gap / 2;
        count++;
    }
}
