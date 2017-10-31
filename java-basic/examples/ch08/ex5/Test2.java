package bitcamp.java100.ch08.ex5;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        ScoreEx2 s1 = new ScoreEx2(1, "홍길동", 100, 100, 100, 80, 80);
        ScoreEx2 s2 = new ScoreEx2(1, "홍길동", 100, 100, 100, 80, 80);
 
        System.out.printf("합계 = %d\n", s1.getSum());
        System.out.printf("평균 = %f\n", s1.getAver());

        s1.setKor(80);;
        System.out.printf("합계 = %d\n", s1.getSum());
        System.out.printf("평균 = %f\n", s1.getAver());
        
    }
}
