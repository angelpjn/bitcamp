package bitcamp.java100.ch10.ex1;

public class Test2 {

    static class A {} // static(Top Level) nested class
    
    class B {} // non-static nested (inner) class => 인스턴스가 있어야만 사용 가능

    Object obj = new Object() { // 익명클래스
        String name;
        public void m1() {}
        // 이 놈의 생성자는 부모클래스의 생성자
    };
    
    public static void main(String[] args) {
    
        class C {} // local class => 메소드 안에서 선언
        
        Object obj2 = new Object() { // 익명클래스
            String name;
            public void m1() {}
            // 이 놈의 생성자는 부모클래스의 생성자
        };
        
    }
}
