//    인스턴스 초기화 블록 정의

package bitcamp.java100.ch06.ex1.test10;

public class Score9 {
    
    String name;
    int kor, eng, math, sum;
    float aver;

//    ## 인스턴스 초기화 블록 정의
//    => 생성자 호출 전 실행
//    => 익명 클래스 정의 시 사용 : 생성자 만들지 못함
//    => 위치 상관 없음
//    => 모든 인스턴스 블록 실행 후 생성자 호출
//    => 생성자가 여러개면 인스턴스 블록 모두 호출 후 생성자 1 호출
//       인스턴스 블록 모두 호출 후 생성자 2 호출
//       .....
//       모든 생성자 호출 될때까지 반복
//    => 가능한 유지보수 위해 1개만 생성
//    클래스 블록 안에는 변수 선언을 제외한 코드를 넣을 수 없음
/*    ex.
 *    int i = 10; => 인스턴스 변수(일반 변수 아님)
 *    int j; => 마찬가지(일반 변수 아님)
 *    { => 인스턴스 초기화 블록. 생성자 호출 전 실행되는 블록.
 *      j = 20;
 *      if (i < 10)
 *          System.out.println("Hello");
 *    
 *    }
 *      
 */
    
    {
        System.out.println("인스턴스 초기화 블록 실행!222");
    }
    
    {
        System.out.println("인스턴스 초기화 블록 실행!111");
    }
    
    Score9() {
        System.out.println("Score9() 호출됨!");
    }

    
    {
        System.out.println("인스턴스 초기화 블록 실행!333");
    }
    
    Score9(String name) {
        System.out.println("Score9(String) 호출됨!");
    }
    
    void compute() {
//        this(); => Constructor call must be the first statement in a constructor
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
