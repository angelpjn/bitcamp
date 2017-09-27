
package bitcamp.java100;

public class Test12_9 {

    public static void main(String[] args){
       
        // char => unicode CS의 code 값을 저장한다.(굉장히 중요하다. 문자를 저장하는 것이 아니다.)
        char c1;

        c1 = 44032;
        
        char c2 = 0xAC00;
        
        System.out.println(c1);
        System.out.println(c2);

        char n1 = 0xBC15;
        char n2 = 0XC815;
        char n3 = 0xB0A8;
        System.out.printf("%c %c %c\n", n1, n2, n3);

        n1 = '박'; // 해당 글자의 유니코드 값을 리턴한다.
        n2 = '정';
        n3 = '남';

        System.out.printf("%c %c %c\n", n1, n2, n3);

        // 유니코드 값을 이용한 문자 7을 숫자 7로 변환한 것
        char x = '7';
        int num = x - '0'; // => 0055(DEC) - 0048(DEC) = 7
        System.out.println(num);
    }
}