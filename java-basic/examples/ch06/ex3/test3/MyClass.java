package bitcamp.java100.ch06.ex3.test3;

public class MyClass {

    static int v1 = 100; // 클래스 로딩 시 생성
 
    static void m1() {
        System.out.println("MyClass.m1()");
    } 
    
    int v2 = 200; // new 연산자 사용하여 인스턴스 생성 시 Heap에 생성

    void m2() {
    System.out.println("인스턴스.m2()");
    }
} 