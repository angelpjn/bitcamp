/* 
[5-12] 아래와 같은 결과가 나오도록 하시오.

[실행결과]
Q1. chair의 뜻은? dmlwk
틀렸습니다. 정답은 의자입니다
Q2. computer의 뜻은? 컴퓨터
정답입니다.
Q3. integer의 뜻은? 정수
정답입니다.
전체 3문제 중 2문제 맞추셨습니다.
*/

package ch5;

import java.util.Scanner;

public class no12 {
    public static void main(String[] args) {
        String[] questions = {"chair", "computer", "integer"};
        String[] answers = {"의자", "컴퓨터", "정수"};
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + "의 뜻은? ");
            String response = scan.nextLine();
            if (response.equals(answers[i])) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다. 정답은 " + answers[i] + "입니다.");
            }
        }
    }
}

