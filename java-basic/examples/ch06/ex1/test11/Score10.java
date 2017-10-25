//    인스턴스 초기화 문장

package bitcamp.java100.ch06.ex1.test11;

public class Score10 {
    
    String name = "이름없음";
    int kor = 10, eng = 10, math, sum;
    float aver;
    
    // 인스턴스 블록
    {
        this.name = "홍길동";
        this.kor = 20;
    }
    
    // 생성자
    Score10() {
        this.name = "임꺽정";    
        
        compute();
    }
    
    // 메서드(=연산자)
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}

