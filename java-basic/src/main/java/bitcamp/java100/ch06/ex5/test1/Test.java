package bitcamp.java100.ch06.ex5.test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        String name;
        int kor, eng, math, sum;
        float avg;
        
        System.out.print("이름? ");
        name = keyScan.nextLine();

        System.out.print("국어 점수? ");
        kor = keyScan.nextInt();

        System.out.print("영어 점수? ");
        eng = keyScan.nextInt();
        
        System.out.print("수학 점수? ");
        math = keyScan.nextInt();

        sum = kor + eng + math;
        avg = sum / 3f;
        
        System.out.printf("%5s, %3d, %3d, %3d, %3d, %5.2f\n", name, kor, eng, math, sum, avg);
    }
}
