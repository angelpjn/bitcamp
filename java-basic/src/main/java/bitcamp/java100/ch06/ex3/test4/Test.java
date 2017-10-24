package bitcamp.java100.ch06.ex3.test4;

public class Test {

    public static void main(String[] args) {

//        ※  클래스 로딩 시점

//        1) 클래스 변수 사용
//        MyClass.v1 = 200;
         
//        2) 클래스 메소드 사용
        MyClass.m1();
//        3) new 연산자 사용
        new MyClass();
        
        MyClass obj1 = null;
        MyClass obj2 = null;
        
        System.out.println(obj1.v1); // 이렇게 쓰지 마라. => 코드 혼란 가중
    }
}
