package bitcamp.java100.ch07.ex5;

public class Test1 {

    public static void main(String[] args) {
        new B(); // B클래스 생성자부터 호출 -> A클래스 생성자 호출 -> Object 클래스 생성자 호출 -> A클래스  생성자의 문장 실행 -> B클래스 생성자의 문장 실행
                 // ch06.ex3.test7의 실행이 이 프로세스로 실행
    }

}
