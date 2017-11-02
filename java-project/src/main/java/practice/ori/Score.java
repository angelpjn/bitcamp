package practice.ori;

import java.util.Scanner;

public class Score {

    protected String name;
    protected int[] subjects;
    protected int sum;
    protected float aver;

    public Score() {
        this.subjects = new int[3];
    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] { kor, eng, math };

        this.compute();
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름? ");
        this.name = scan.nextLine();

        System.out.print("국어? ");
        this.subjects[0] = scan.nextInt();

        System.out.print("영어? ");
        this.subjects[1] = scan.nextInt();

        System.out.print("수학? ");
        this.subjects[2] = scan.nextInt();

        this.compute();
    }

    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
                this.name,
                this.subjects[0],
                this.subjects[1],
                this.subjects[2],
                this.sum,
                this.aver);
    }

    private void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = this.sum / 3f;
    }
}
