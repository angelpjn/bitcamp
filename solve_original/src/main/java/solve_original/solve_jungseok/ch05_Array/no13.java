/* 
[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와 같이 동작하도록 
예제의 빈 곳을 채우시오.

[실행결과]
Q1. lvtsieeoin의 정답을 입력하세요.>television
맞았습니다.
Q2. otepcumr의 정답을 입력하세요.>computer
맞았습니다.
Q3. usemo의 정답을 입력하세요.>asdf
틀렸습니다.
Q4. ohpne의 정답을 입력하세요.>phone
맞았습니다.
*/

package solve_original.solve_jungseok.ch05_Array;

import java.util.Scanner;

class no13 {
    public static void main(String args[]) {
        String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환
            /*
             * (1) 알맞은 코드를 넣어 완성하시오. char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
             */
            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
            String answer = scanner.nextLine();
            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    }
}
