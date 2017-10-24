package bitcamp.java100.ch06.ex5.test5;

import java.util.Scanner;

public class Score {

    String name;
    int kor, eng, math, sum;
    float avg;
    
    void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("국어 점수? ");
        this.kor = keyScan.nextInt();

        System.out.print("영어 점수? ");
        this.eng = keyScan.nextInt();
        
        System.out.print("수학 점수? ");
        this.math = keyScan.nextInt();
        
        this.compute();

        //        keyScan.close();
    }

    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.avg = this.sum / 3f;

    }

    void print() {
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                this.name, this.kor, this.eng, this.math, this.sum, this.avg);
    }
}
