package bitcamp.java100.practice.test;

public class PrintInfo {
    void print(Score score) {
        System.out.printf("%5s %3d %3d %3d %3d %5.2f\n",
                score.name,
                score.kor,
                score.eng,
                score.math,
                score.sum,
                score.avg);
    }
}
