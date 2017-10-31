package bitcamp.java100.ch08.ex1;

class Score {
    String name;
    int kor, eng, math;
    int sum;
    float average;
}

public class Test8_1 {

    public static void main(String[] args) {
        Score s = new Score();
       s.name = "홍길동";
       s.kor = 100;
       s.eng = 90;
       s.math = 80;
       
       // sum 값을 직접 넣어 틀린 결과가 나온 케이스 그래서 sum에 직접 입력을 막아야 하고 이를 위해 캡슐화 사용
       s.sum = 280;
       s.average = s.sum / 3f;
        
        System.out.printf("%s, %d, %d, %d, %d, %5.2f\n", 
               s.name,s.kor,s.eng,s.math,s.sum,s.average);
    }
}
