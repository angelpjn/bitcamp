/*
1.1 중복이 없는가 : 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
*/

package ch01;
import java.util.Scanner;

public class no1 { 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        System.out.print("문자 입력 : ");        
        String str = scan.nextLine();
        String[] strArr = new String[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            strArr[i] = str.substring(i, i + 1);
            int count = 1;
            int j = 0;
            while (j < str.length()) {
                if (i > 0 && strArr[i] == strArr[i - 1]) {
                    count++;
                } else {
                    count = 1;
                }
            }
            System.out.println(strArr[i] + "중복 문자 : " + count);
        }
        scan.close();
    }
}
