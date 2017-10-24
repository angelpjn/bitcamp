package bitcamp.java100.ch06.ex3.test1;

public class Test {

    public static void main(String[] args) {

        System.console().readLine("계속 실행하려면 엔터를 치세요!");
        // => System.console() 메소드가 리턴하는 객체인 Console 클래스에서 readLine() 메소드를 호출하라!
        // readLine() 같은 메소드를 블럭킹 메소드라고 함.(입력값 들어올 때까지 진행 불가)
        System.out.println(MyClass.v1); // => 이 떄 MyClass 클래스 파일이 Method Area에 로딩됨
        
        
        MyClass.v1 += 200;
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!");

        System.out.println(MyClass.v1);
        
    }
}
