// 생성자 활용 : 여러 파라 호출

package bitcamp.java100.ch06.ex1.test6;

public class Test6 {

    public static void main(String[] args) {
        Score5 score; 
        
        score = new Score5(); // 파라 없는 생성자 호출 
        
        score = new Score5("임꺽정", 100, 80, 70); // String int int int 파라 받는 생성자 호출
        
        score = new Score5("임꺽정"); // String 파라 받는 생성자 호출
        
//        score = new Score5(100, 100, 100); => 컴파일 오류! int int int 파라 받는 생성자 없음
       
    }
}


















