package bitcamp.java100.ch06.ex2.test2;

import java.io.Console;

public class ScoreView {
    
    static void input(Score score) {
        Console console = System.console();
        
        score.name = console.readLine("이름? ");
        score.kor = Integer.parseInt(console.readLine("국어점수? "));
        score.eng = Integer.parseInt(console.readLine("영어점수? "));
        score.math = Integer.parseInt(console.readLine("수학점수? "));
        
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
    }
    
    static void print(Score score) {
        System.out.printf("%10s, %3d, %3d, %3d, %3d, %5.2f\n", 
                score.name,
                score.kor,
                score.eng,
                score.math,
                score.sum,
                score.aver);
    }
}
