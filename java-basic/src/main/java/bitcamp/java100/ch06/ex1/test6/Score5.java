// 한 클래스 내 여러개의 생성자 정의
// => 객체지향의 다형성(polymorphism) 규칙
// => 

package bitcamp.java100.ch06.ex1.test6;

public class Score5 {
    
    // 메모리 설계 명령 : 필드 정의
    String name;
    int kor, eng, math, sum;
    float aver;
    
    Score5() { // 파라 없는 생성자
        System.out.println("Score5() 호출됨!");
        
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
    }
        
    Score5(String name) { // String name만 있는 생성자
        System.out.println("Score5(String) 호출됨!");
        
        this.name = name;
    }
    
    Score5(String name, int kor, int eng, int math) { // String int int int 있는 생성자
        System.out.println("Score5(String, int, int, int) 호출됨!");
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    
    // 메서드 정의 = 연산자 정의
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
