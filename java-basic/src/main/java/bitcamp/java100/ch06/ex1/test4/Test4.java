// 생성자 활용 : 인스턴스 메소드이나 인스턴스 생성 시 딱 1번만 호출. 특별한 메소드

package bitcamp.java100.ch06.ex1.test4;

public class Test4 {

    public static void main(String[] args) {
        Score3 score; 
        
        score = new Score3(); // 생성자 호출 
        
        System.out.printf("이름 = %s\n", score.name);
        System.out.printf("총 점 = %s\n", score.sum);
        System.out.printf("평균 = %s\n", score.aver);
        
//        score = new Score3("홍길동"); => 컴파일 오류! Score3에 문자열 1개 파라로 받는 생성자 미존재
        
//        score = new Score3; => 컴파일 오류! 생성자 호출 문법 오류
        
//        score.Score(); => 컴파일 오류! 생성자는 따로 호출 불가
    }
}


















