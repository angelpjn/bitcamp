package bitcamp.java100.ch02.test14;
/* 

# 과제_4
- 여러 명의 성적을 저장하고 다음과 같이 출력하라!

 ex. 
  홍길동, 100, 90, 80, 270, 90.0
  임꺽정, 80, 80, 80, 240, 80.0
  유관순, 100, 100, 100, 300, 100.0
*/
public class Test14_1_1 {
  
    public static void main(String[] args) {

        String [] names = {"홍길동", "임꺽정", "유관순"};
        int [] kor = {100, 90, 80};           
        int [] eng = {90, 80, 100};
        int [] math = {80, 80, 100};

        for (int i = 0; i < names.length; i++){
            int sum = kor[i] + eng[i] + math[i];
            float avg = sum / names.length;
            System.out.printf("%s=>\n\n %s %d %s %d %s %d %s %d %s %.1f\n", names[i],
            "국어점수 : ", kor[i], "영어점수 : ", eng[i], "수학점수 : ", math[i],
            "총점 : ", sum, "평균 점수 : ", avg);
        }
        System.out.println();
    }
}
    