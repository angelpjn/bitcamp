/* 

# 과제_5
- 사용자 정의 데이터 타입 만들기 Ⅲ

- 인풋값 
비트캠프의 수강생 정보를 저장할 데이터 타입
  
*/
public class Test14_3 {

    public static void main(String[] args) {

        // 이름, 성별, 연령, 주소, 학력, 전공 여부, 프로그래밍 지식
        class Students {
            String name;
            char gender;
            int age;
            String addr;
            String educationBackgradound;
            String experience;
            char level;

        }

        Students std;

        std = new Students();

        std.name = "박정남";
        std.gender = '남';
        std.age = 35;
        std.addr = "서울시 관악구";
        std.educationBackgradound = "4년졸";
        std.experience = "비전공자";
        std.level = '하';

        System.out.printf("성명 : %s\n성별 : %b\n연령 : %d\n주소 : %s\n학력 : %s\n전공 : %s\n프로그래밍 지식 : %c", std.name, std.gender, std.age, std.addr, std.educationBackgradound, std.experience, std.level);
        
    }
}
    