// this 생략

package bitcamp.java100.ch06.ex1.test9;

public class Score8 {
    
    String name;
    int kor, eng, math, sum;
    float aver;

    Score8(String name) {
        
        // 변수 앞에 this 없을 시 로컬변수 찾음.
        this.name = name;
        
        // 로컬 변수에 해당 이름 가진 변수가 없으면 컴파일러가 this를 자동으로 붙임
        kor = 50;
        eng = 50;
        math = 50;
        
        compute();
    }
    
    void compute() {
//        this(); => Constructor call must be the first statement in a constructor
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
