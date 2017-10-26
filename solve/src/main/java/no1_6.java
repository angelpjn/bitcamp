import java.util.Arrays;
import java.util.Scanner;

/*
1.6 문자열 압축
 반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압출 메서드를 작성하라. 예를 들어 문자열 aabcccccaaa를 압축하면 a2b1c5a3이 된다.
만약 '압축된' 문자열의 길이가 기존 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다. 문자열은 대소문자 알파벳(a~z)으로만 이루어져 있다.
 */
public class no1_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("문자열 입력 : ");
        String str = scan.nextLine();
        
        String[] strArr = new String[str.length()];
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            strArr[i] = str.substring(i, i + 1);
        }
        i = 0;
        while (i < str.length() ) {
            if (i == 0) {
                count++;
            } else if (i > 0 && strArr[i].equals(strArr[i - 1])) {
                count++;
            } else if (i > 0 && !strArr[i].equals(strArr[i - 1])) {
                count = 1;
            } else {}
        }
        scan.close();
    }
}
