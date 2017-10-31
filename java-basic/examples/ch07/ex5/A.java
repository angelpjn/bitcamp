package bitcamp.java100.ch07.ex5;

public class A {
    
/* 컴파일러의 기본 생성자
    A() {
        super(); // Object의 기본 생성자 호출
    }
*/
    
    A() {
//   super(); => 수퍼 클래스 기본 생성자 호출 문장 생략 시, 컴파일러가 자동으로 맨 앞에 추가. Object의 생성자 호출
//            => 반드시 수퍼 클래스의 생성자가 호출 되는 것.
        System.out.println("A() 생성자 실행!");
    }
    
    A(String str) {
        super(); // => 수퍼클래스 생성자 호출 문장 명시. 맨 윗 줄
        System.out.println("A(String) 생성자 실행!");
    }
    
    A(int i) {
        System.out.println("A(int) 생성자 실행!");
//      super(); // => 수퍼클래스 생성자 호출 문장 명시. 맨 윗 줄 아님 => 컴파일 오류. 생략 시 맨 위에 컴파일러가 추가.
    }
}
