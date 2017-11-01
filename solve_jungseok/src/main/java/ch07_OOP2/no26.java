/* 
[7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

[실행결과]
200
 */

package ch07_OOP2;

class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}

class No26 {
    public static void main(String[] args) {
        
        Outer2.Inner2 out = new Outer2.Inner2();
        
        int i = out.iv;
        System.out.println(i);
    }
}