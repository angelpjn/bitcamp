// 기본 생성자 컴파일러에 의한 자동 생성

package bitcamp.java100.ch06.ex1.test7;

public class Score6 {
    
    // 메모리 설계 명령 : 필드 정의
    String name;
    int kor, eng, math, sum;
    float aver;
    
//    Score6() { // 파라 없는 생성자 : default constructor 컴파일러가 자동 생성. 왜냐면 무조건 호출해야 하니까
//        System.out.println("기본 생성자 호출됨!");
//    }
        
    // 메서드 정의 = 연산자 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
