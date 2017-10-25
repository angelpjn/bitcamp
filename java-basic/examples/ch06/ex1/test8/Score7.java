// 생성자에서 다른 생성자 호출 : 인스턴스 생성 이외 생성자 호출은 한 생성자에서 다른 생성자 호출 시에만 가능

package bitcamp.java100.ch06.ex1.test8;

public class Score7 {
    
    String name;
    int kor, eng, math, sum;
    float aver;
    
    Score7() {
        this("홍길동"); // 아래 Score7(String name) 호출. 오직 생성자의 첫번째 문장에서만 호출 가능
        /*
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
         */
        this.compute();
    }

    Score7(String n) {
//        this(name, 50, 50, 50); // this()안에 로컬 파라 변수명 입력되어야 함
        this(n, 50, 50, 50);

        /*
        this.name = name;
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        */
        this.compute();
    }
    
    Score7(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    void compute() {
//        this(); => Constructor call must be the first statement in a constructor
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
