/*
    - 구구단 번호 입력 받아 출력!
    - 실행 예)
    
    구구단? 2
    2 * 1 = 2
    2 * 2 = 4
    2 * 3 = 6
    ...
    2 * 9 = 18
    -----------------
    구구단? 10
    2에서 9단까지만 가능합니다!
    구구단? 1
    2에서 9단까지만 가능합니다!
    구구단? 0                  // 0 이하의 수를 입력하면 종료하라!
    다음에 또 봐요!
    >
 */

package bitcamp.java100.practice;

import java.io.Console;

public class Test21_4 {

    public static void main(String[] args) {

        class Student {
            String name;
            int age;
            boolean working;
            float gpa;
        }
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다."); 
            System.out.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        
        Student s = new Student();
        
        s.name = console.readLine("이름? (예 : 홍길동) => ");
        s.age = Integer.parseInt(console.readLine("나이 ? (예 : 20) => "));
        s.working = Boolean.parseBoolean(console.readLine("재직여부 ? (예 : true 또는 false) => "));
        s.gpa = Float.parseFloat(console.readLine("학점 ? (예 : 4.15) => "));
        
        System.out.println("---결과출력---"); 
            
        System.out.printf("이름 : %s\n", s.name);
        System.out.printf("나이 : %d 세\n", s.age);
        System.out.printf("재직여부 : %b\n", s.working);
        System.out.printf("졸업학점 : %.2f 점\n", s.gpa);
        
    }
}


















