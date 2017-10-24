// 인스턴스 초기화 블록 사용

package bitcamp.java100.ch06.ex1.test11;

public class Test11 {

    public static void main(String[] args) {
        Score10 score; 
        
        score = new Score10();
        
        System.out.printf("이름 = %s 학생\n", score.name);
        System.out.printf("총 점 = %d 점\n", score.sum);
        System.out.printf("평균 = %.2f 점\n", score.aver);
        
    }
}


















