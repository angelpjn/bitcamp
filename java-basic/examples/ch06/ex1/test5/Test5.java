// 생성자 활용 : 파라미터 있는 생성자 호출

package bitcamp.java100.ch06.ex1.test5;

public class Test5 {

    public static void main(String[] args) {
        Score4 score; 
        
//        score = new Score4(); => 컴파일 오류! 생성자 호출 시 파라 타입, 개수, 순서 불일치
        score = new Score4("임꺽정", 100, 80, 70); // 생성자 호출 
        
        System.out.printf("이름 = %s 학생\n", score.name);
        System.out.printf("총 점 = %d 점\n", score.sum);
        System.out.printf("평균 = %.2f 점\n", score.aver);
        
    }
}


















