/* 
[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
(1)에 알맞은 코드를 넣어서 완성하시오.

a b c d e f g h i j k l m n o p q r s t u v w x y z
` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /

0 1 2 3 4 5 6 7 8 9
q w e r t y u i o p

[실행결과]
src:abc123
result:`~!wer
*/

package solve_original.solve_jungseok.ch05_Array;

class no10 {
    public static void main(String[] args) {
        char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
                ']', '{', '}', ';', ':', ',', '.', '/' };
        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
        String src = "abc123";
        String result = "";
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            /*
             * (1) 알맞은 코드를 넣어 완성하시오.
             */ }
        System.out.println("src:" + src);
        System.out.println("result:" + result);
    } // end of main
} // end of class