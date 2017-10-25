package bitcamp.java100.ch06.ex5.test2;

import java.util.Scanner;

public class Test {

    static Scanner keyScan = new Scanner(System.in);

    static String name;
    static int kor, eng, math, sum;
    static float avg;
    
    static void inputScore() {
        System.out.print("이름? ");
        name = keyScan.nextLine();
        
        System.out.print("국어 점수? ");
        kor = keyScan.nextInt();
        
        System.out.print("영어 점수? ");
        eng = keyScan.nextInt();
        
        System.out.print("수학 점수? ");
        math = keyScan.nextInt();

        keyScan.close();
    }

    static void computeScore() {
        sum = kor + eng + math;
        avg = sum / 3f;
    }

    static void printScore() {
        System.out.printf("%5s, %3d, %3d, %3d, %3d, %5.2f\n", name, kor, eng, math, sum, avg);
    }
    
    public static void main(String[] args) {
        inputScore();
        computeScore();
        printScore();
    }
}
