// 클래스 로딩과 스태틱 블록 실행 순서 확인!

package bitcamp.java100.ch06.ex3.test6;

public class Test {

    class A {
        
    }
    
    static class B {
        
    }

    public static void main(String[] args) {
        A obj1;
        B obj2;
        
//        obj1 = new A();
        obj2 = new B();
    }
}
