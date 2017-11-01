/* 
[7-25] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

[실행결과]
100
*/

package ch07_OOP2;

class Outer {
    class Inner {
        int iv = 100;
    }
}

class No25 {
    public static void main(String[] args) {
        Outer out = new Outer();
      
        Outer.Inner inner = out.new Inner();
        int i = inner.iv;
        System.out.println(i);
    }
}