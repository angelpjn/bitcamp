
package bitcamp.java100;

public class Test11_10 {

    public static void main(String[] args){

        System.out.println(98765.123456789); // 8바이트
        System.out.println(98765.123456789f); // 4바이트
        System.out.println();

        // 단정도(float. 7개 자리수. 값의 오차범위가 크므로 배정도(double) 쓸 것)
        System.out.println(9876567f);
        System.out.println(98765678f);
        System.out.println(9876.567f);
        System.out.println(9876.5678f);

        System.out.println();

        // 배정도(dlrp double 15개 자리수 float보다 당연히 정밀)
        System.out.println(98765678);
        System.out.println(9876.5678);

        // ※유효 자릿 수 : 앞 뒤 0 떼고 남은 숫자




        
    }
}