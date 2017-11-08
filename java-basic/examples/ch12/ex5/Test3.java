package bitcamp.java100.ch12.ex5;

public class Test3 implements A, B, C {
    
    @Override
    public void m1() {
        System.out.println("m1()");
    }
    
    @Override
    public void m3() {
        System.out.println("m3()");
    }
    
    @Override
    public void m2() {
        System.out.println("m2()");
    }
    
}
