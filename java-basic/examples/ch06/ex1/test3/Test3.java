// 메서드 문법 이용하여 클래스에 연산자 추가

package bitcamp.java100.ch06.ex1.test3;

public class Test3 {

    public static void main(String[] args) {
        Score2 score; 
        
        score = new Score2(); 
        
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
        
        score.compute();
    }
}


















