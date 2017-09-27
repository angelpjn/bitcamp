
package bitcamp.java100;

public class Test13_1 {

    public static void main(String[] args){
       
        // 국어, 영어 ,수학, 사회, 과학, 도덕, 중국어 점수 저장할 변수를 만들라!

        //  배열 사용 전 : 

        int kor, eng, math, soc, sci, eth, chi;
        kor = 100;
        eng = 100;
        math = 100;
        soc = 100;
        sci = 100;
        eth = 100;
        chi = 100;

        // 배열 사용 후 : 
        int [] scores = new int [7];
        scores[0] = 100;
        scores[1] = 80;
        scores[2] = 90;
        scores[3] = 55;
        scores[4] = 30;
        scores[5] = 40;
        scores[6] = 50;

    }
}