// 중첩 클래스(Nested Class = Inner Class)
// => 패키지에 직접 소속된 클래스가 아니라 다른 클래스 안에 소속된 클래스
/*
    class A {
        class B{
            
        }
    }

cf) 이건 nested class가 아님 
 => class A {}
    class B {}
*/

package bitcamp.java100.ch08.ex1;

class X1 {}

// 클래스 접근제어자는 public과 default만 가능(왜?)
//protected class X2 {}
//private class X3 {}

public class Test6 {


    // nested class는 클래스 멤버라 4가지 접근제어자 모두 사용 가능
    private class X4 {}
    class X5 {}
    protected class X6 {}
    public class X7 {}
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
