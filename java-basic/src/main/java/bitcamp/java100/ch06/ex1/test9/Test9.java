
package bitcamp.java100.ch06.ex1.test9;

public class Test9 {

    public static void main(String[] args) {
        Score8 score; 
        
        score = new Score8("홍길동");
        
        System.out.printf("이름 = %s 학생\n", score.name);
        System.out.printf("총 점 = %d 점\n", score.sum);
        System.out.printf("평균 = %.2f 점\n", score.aver);
    }
}


















