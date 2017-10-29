/* 
[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.

 */
package ch07_OOP2;

class Parent1 {
    int x = 100;
    
    Parent1() {
        this(200);
        System.out.println("Parent1()" + x);
    }
    
    Parent1(int x) {
        this.x = x;
        System.out.println("Parent1(int x)" + x);
    }
    
    int getX() {
        return x;
    }
}

class Child1 extends Parent1 {
    int x = 3000;
    
    Child1() {
        this(1000);
        System.out.println("Child1()" + x);
    }
    
    Child1(int x) {
        this.x = x;
        System.out.println("Child1(int x)" + x);
    }
}

class no7 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println("x=" + c.getX());
    }
}