/*
[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
은 코드를 넣어서 프로그램을 완성하시오.

[실행결과]
12o34는 숫자가 아닙니다.
*/

package solve_original.solve_jungseok.ch04_banif;

public class no13 {

}

class Exercise4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;
        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
        // 하나씩 읽어서 검사한다.
        for (int i = 0; i < value.length(); i++) {
            /*
             * (1) 알맞은 코드를 넣어 완성하시오.
             */
        }
        if (isNumber) {
            System.out.println(value + "는 숫자입니다.");
        } else {
            System.out.println(value + "는 숫자가 아닙니다.");
        }
    } // end of main
} // end of class