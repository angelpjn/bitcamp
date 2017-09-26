/* 

# 과제_3
- 변수를 이용하여 이름, 국어, 영어, 수학, 총점, 합계를 저장하라!
 그런 후 다음과 같이 출력하라!

 ex. 
  이름 : 홍길동
  국어 : 90
  영어 : 80
  수학 : 100
  총점 : 270
  평균 : 90.0

*/
public class Mission03 {
  
        public static void main(String[] args) {

            String name = "홍길동";
            int kor = 100;
            int eng = 97;
            int math = 98;
            int sum = kor + eng + math;
            float aver = sum / 3.0f;

            System.out.printf("이름 : %s\n", name);
            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);
            System.out.printf("총점 : %d\n", sum);
            System.out.printf("평균 : %.1f\n", aver);

        }
    }
    