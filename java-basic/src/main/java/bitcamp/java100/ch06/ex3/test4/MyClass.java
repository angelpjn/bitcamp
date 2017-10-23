package bitcamp.java100.ch06.ex3.test4;

public class MyClass {

    static int v1 = 100; // 클래스 로딩 시 생성
 
    static void m1() {
        System.out.println("MyClass.m1()");
    } 
    
    static {
        System.out.println("MyClass의 static 블록 실행!");
        v1 = 300;
    }
    
    static {
        System.out.println("MyClass3의 static 블록 싱행22222!");
    }
} 