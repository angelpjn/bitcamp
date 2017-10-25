
package bitcamp.java100.ch06.ex1.test3;

public class Score2 {
    
    // 메모리 설계 명령 : 필드 정의
    String name;
    int kor, eng, math, sum;
    float aver;
    
    // 메서드 정의 = 연산자 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
