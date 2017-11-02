
package practice.ex1;

import java.util.Scanner;

class Score {
    String name;
    int[] subjects;
    int sum;
    float average;

    static Scanner scan = new Scanner(System.in);
    static Confirm confirm = new Confirm();

    public Score() {
        this.subjects = new int[3];
    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects[0] = kor;
        this.subjects[1] = eng;
        this.subjects[2] = math;

        this.compute();
    }

    private String prompt(String message) {
        System.out.print(message);
        return scan.nextLine();
    }

    public void initInput() {
        this.name = prompt("이름? ");
        this.subjects[0] = Integer.parseInt(prompt("국어? "));
        this.subjects[1] = Integer.parseInt(prompt("영어? "));
        this.subjects[2] = Integer.parseInt(prompt("수학? "));
        this.compute();
    }

    private void compute() {
        this.sum = 0;
        for (int sub : subjects) {
            this.sum += sub;
        }
        this.average = this.sum / 3f;
    }

    public void print() {
        System.out.printf("%-4s, %4d, %6.1f\n", this.name, this.sum, this.average);
    }

    public void printDetail() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", this.name, this.subjects[0], this.subjects[1],
                this.subjects[2], this.sum, this.average);
    }

    public void update() {
        int kor = this.subjects[0];
        try {
            kor = Integer.parseInt(prompt("국어? (" + subjects[0] + ")"));
        } catch (Exception e) {}
        
        int eng = this.subjects[1];
        try {
            eng = Integer.parseInt(prompt("영어? (" + subjects[1] + ")"));
        } catch (Exception e) {}
        
        int math = this.subjects[2];
        try {
            math = Integer.parseInt(prompt("수학? (" + subjects[2] + ")"));
        } catch (Exception e) {}
        
        if (!confirm.confirm2("변경하시겠습니까?(y/N) ")) {
            System.out.println("변경 취소하였습니다.");
        } else {
            this.subjects[0] = kor;
            this.subjects[1] = eng;
            this.subjects[2] = math;
            this.compute();
            System.out.println("변경하였습니다.");
        }
    }
}