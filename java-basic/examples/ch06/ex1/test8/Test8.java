// 생성자 활용 : 여러 파라 호출

package bitcamp.java100.ch06.ex1.test8;

public class Test8 {

    public static void main(String[] args) {
        Score7 score; 
        
        score = new Score7(); // 파라 없는 default constructor 호출 
//        즉, 인스턴스를 만들때 했던 것들이 모두 생성자였던 것. 한 번 초기화 뒤 인스턴스를 생성한다.
        
        /*
        내부 처리
        Score7() -> this()를 이용하여 Score7(String) 생성자 호출
        Score7(String) -> this()를 이용하여 String(String,int,int,int) 생성자 호출
        */
        
        System.out.printf("이름 = %s 학생\n", score.name);
        System.out.printf("총 점 = %d 점\n", score.sum);
        System.out.printf("평균 = %.2f 점\n", score.aver);
    }
}


















