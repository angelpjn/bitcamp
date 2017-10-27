package bitcamp.java100.ch08.ex1;

class Score2 {
    String name;
    int kor, eng, math;
    private int sum;
    private float average;

    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.average = this.sum / 3f;
    }

    // read only property
    public int getSum() {
        return this.sum;
    }

    public float getAver() {
        return this.average;
    }
}

public class Test8_2 {

    public static void main(String[] args) {
        Score2 s = new Score2();
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;

        // 접근 제한
        // s.sum = 280;
        // s.average = s.sum / 3f;

        s.compute();
        
        System.out.printf("%s, %d, %d, %d, %d, %5.2f\n",
                s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());
        
        s.eng = 50;
    }
}
