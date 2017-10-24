// 파라미터가 있는 생성자
package bitcamp.java100.ch06.ex1.test5;

public class Score4 {
    
    // 메모리 설계 명령 : 필드 정의
    String name;
    int kor, eng, math, sum;
    float aver;
    
    //생성자 : 인스턴스 생성 시 자동 호출
    Score4(String name, int kor, int eng, int math) {
        System.out.println("Score4() 호출됨!");
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    
    // 메서드 정의 = 연산자 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
