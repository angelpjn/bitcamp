package bitcamp.java100.ch06.ex5.test4;

import java.util.Scanner;

public class Score {

    static String name;
    static int kor, eng, math, sum;
    static float avg;
    
    static void inputScore() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        name = keyScan.nextLine();
        
        System.out.print("국어 점수? ");
        kor = keyScan.nextInt();

        System.out.print("영어 점수? ");
        eng = keyScan.nextInt();
        
        System.out.print("수학 점수? ");
        math = keyScan.nextInt();
        
//        keyScan.close();
    }

    static void computeScore() {
        sum = kor + eng + math;
        avg = sum / 3f;
    }

    static void printScore() {
        System.out.printf("%s, %d, %d, %d, %d, %f\n", name, kor, eng, math, sum, avg);
    }
}
