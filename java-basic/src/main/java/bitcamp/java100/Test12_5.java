
package bitcamp.java100;

public class Test12_5 {

    public static void main(String[] args){
       

        byte b1;
        b1 = 100;
        
        b1 = -128;
        b1 = 127;
        // => 숫자는 4byte로 저장하지만 예외적으로 1byte 이내에 한해서만 허용
        //    short(2byte)도 마찬가지

        // 1byte 초과로 인한 compile 오류

        // b1 = -129;
        // b1 = 128;

        short s1;
        s1 = -32768;
        s1 = 32767;

        // 2byte 초과로 인한 compile 오류
        // s1 = -32769;
        // s1 = 32768;
        
        int i1;
        i1 = -21_4748_3648;
        i1 = 21_4748_3647;

        // 4byte 초과로 인한 compile 오류
        // i1 = -21_4748_3649L;
        // i1 = 21_4748_3648L;

        // 8byte 정수값 예외 미 허용에 의한 compile 오류
        // b1 = 100L;
        // s1 = 100L;
        // i1 = 100L;

        long l1;

        l1 = -922_3372_0368_5477_5808L;
        l1 = 922_3372_0368_5477_5807L;

        // l1 = -922_3372_0368_5477_5809L;
        // l1 = 922_3372_0368_5477_5808L;

    }
}