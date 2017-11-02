
//: ## 캡슐화 적용
//: - 모든 필드에 대해 외부 접근을 차단한다.
//:   단 자식 클래스에서는 직접 접근할 수 있게 허락한다.
//: 

import java.util.Scanner;

public class Score {
    static Scanner scan = new Scanner(System.in);

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

    private void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float) this.sum / this.subjects.length;
    }

    public void add() {
        Scanner keyScan = new Scanner(System.in);

        System.out.println("성적관리");

        System.out.print("이름? ");
        this.name = keyScan.nextLine();

        System.out.print("국어점수? ");
        this.subjects[0] = keyScan.nextInt();

        System.out.print("영어점수? ");
        this.subjects[1] = keyScan.nextInt();

        System.out.print("수학점수? ");
        this.subjects[2] = keyScan.nextInt();

        this.compute();
    }

    public void list() {
        System.out.printf("%-4s, %4d, %6.1f\n", this.name, this.sum, this.aver);
    }
}
