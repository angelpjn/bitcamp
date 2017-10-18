
package bitcamp.java100.test21;

import java.io.Console;

public class Test21_4 {

    public static void main(String[] args) {

    	class Student { // non-static(method 밖에서 만들면 static 붙일 수 있음. 객체 생성하여 접근)
    		String name;
    		int age;
    		boolean working;
    		float gpa;
    	}
    	
    	Console console = System.console();
    	
    	if (console == null) {
    		System.err.println("콘솔을 지원하지 않습니다."); // err는 색이 빨강
    		System.out.println("콘솔을 지원하지 않습니다."); // out은 색이 하양
    		System.exit(1); // JVM 종료 : 0 => 정상 / 그 외 => 비정상
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


















