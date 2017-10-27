package bitcamp.java100.ch08.ex1;

class Score3 {
    String name;
    private int kor, eng, math;

    private int sum;
    private float average;

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getKor() {
        return kor;
    }
    
    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getEng() {
        return eng;
    }
    
    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public int getMath() {
        return math;
    }

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

public class Test8_3 {

    public static void main(String[] args) {
        Score3 s = new Score3();
        s.name = "홍길동";
        
        s.setKor(100);
        s.setEng(90);
        s.setMath(80);

        System.out.printf("%s, %d, %d, %d, %d, %5.2f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
        
        s.setEng(50);

        System.out.printf("%s, %d, %d, %d, %d, %5.2f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
    }
}
