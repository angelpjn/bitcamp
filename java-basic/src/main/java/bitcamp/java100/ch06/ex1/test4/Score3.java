// 생성자
package bitcamp.java100.ch06.ex1.test4;

public class Score3 {
    
    // 메모리 설계 명령 : 필드 정의
    String name;
    int kor, eng, math, sum;
    float aver;
    
    //생성자 : 인스턴스 생성 시 자동 호출
    Score3() {
        System.out.println("Score3() 호출됨!");
        
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute(); // Score3 클래스의 compute() 메소드
    }
    
    
    // 메서드 정의 = 연산자 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
