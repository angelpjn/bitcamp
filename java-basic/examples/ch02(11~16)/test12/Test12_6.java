
package bitcamp.java100.ch02.test12;

public class Test12_6 {

    public static void main(String[] args){
       

        byte b1 = 50;
        byte b2 = 50;
        byte b3;
        
        b3 = 100;

        // b3 = b1 + b2;  => 결과는 100이지만 4byte.
        // b3 = b1 + 50;  => 결과는 100이지만 4byte.

        b3 = 50 + 50; // => 이건 literal이라 compile 가능

        int i;
        i = b1 + b2;

        short s1;
        // s1 = b1 + b2;

    }
}