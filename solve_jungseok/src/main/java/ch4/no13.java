/*
[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
은 코드를 넣어서 프로그램을 완성하시오.

[실행결과]
12o34는 숫자가 아닙니다.
*/
package ch4;

import java.util.Scanner;

class no13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        String value = "12o34";
        System.out.print("숫자 판별기 : ");
        String value = scan.nextLine();
        char[] ch = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            ch[i] = value.charAt(i);
        }
        for (int i = 0; i < value.length(); i++) {
            if (0 <= (ch[i] - '0') && (ch[i] - '0') <= 10) {
                System.out.println(ch[i] + "는 숫자입니다.");
            } else {
                System.out.println(ch[i] + "는 숫자가 아닙니다.");
            }
        }
    }
}