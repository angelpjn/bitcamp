package bitcamp.java100.ch12.ex1;

public class Caller {

    public static void main(String[] args) {
        Protocol obj = new Callee(); // Protocol 인터페이스 상속
//        Protocol obj2 = new String(); // Protocol 인터페이스 상속 X
        
        obj.m1();
        obj.m2();
        
    }

}
