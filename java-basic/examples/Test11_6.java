
package bitcamp.java100;

public class Test11_6 {

    public static void main(String[] args){

        System.out.println(1456781234);
        System.out.println(14_5678_1234);
        System.out.println(1_456_781_234);

        // int 표현 가능 범위(4byte)
        System.out.println(-21_4748_3648);
        System.out.println(21_4748_3647);

        // int 표현 불가
        // System.out.println(-21_4748_3649);
        // System.out.println(21_4748_3648);

        // Long 표현 가능 범위(8byte)
        System.out.println(-922_3372_0368_5477_5808L);
        System.out.println(922_3372_0368_5477_5807L);



        System.out.println(-21_4748_3649L);
        System.out.println(21_4748_3648L);

        System.out.println(10); // 4byte 정수 값
        System.out.println(10L); // 8byte 정수 값

        System.out.println(100);
        System.out.println(0144); // 8진수 표현 100
        System.out.println(0x64); // 16진수 표현 100
        System.out.println(0b01100100); // 2진수 표현 100



    }
}