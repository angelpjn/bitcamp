
package bitcamp.java100.ch02.test15;

public class Test15_3 {
    public static void main(String[] args){
        
        byte b1 = 20, b2 = 22;
        short s1 = 30, s2 = 33;
        int i1 = 40, i2 = 44;
        long l1 = 50, l2 = 55;
        float f1 = 3.14f, f2 = 45.32f;
        double d1 = 4567.8988, d2 = 9876.5432;

        int r1 = b1 + s1;
        r1 = b1 + i1; // byte는 int 임시 메모리에 저장됨. 변수의 타입이 바뀌는 것이 아님. 
        r1 = i1 + s1; // short도 마찬가지 이를 구어로는 int로 변했다고 표현함.
        // r1 = i1 + l1; //=> 계산 결과는 long 타입
        // r1 = b1 + l1; //=> 계산 결과는 long 타입
        // r1 = s1 + l1; //=> 계산 결과는 long 타입

        long r2 = i1 + l1;
        r2 = b1 + l1;
        r2 = s2 + l1;

        // long r3 = b1 + f1; // => 계산 결과 float
        // r3 = s1 + f1; // => 계산 결과 float
        // r3 = i1 + f1; // => 계산 결과 float       
        // f3 = l1 + f1; // => 계산 결과 float

        float r4 = b1 + f1;
        r4 = s1 + f1;
        r4 = i1 + f1;
        r4 = l1 + f1;

        // float r5 = f1 + d1;

        double r6 = f1 + d1;
        r6 = b1 + d1;
        r6 = s1 + d1;
        r6 = i1 + d1;
        r6 = l1 + d1;



    }
}