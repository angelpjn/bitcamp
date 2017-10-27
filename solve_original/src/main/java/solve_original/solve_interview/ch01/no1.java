/*
1.1 중복이 없는가 : 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
*/

package solve_original.solve_interview.ch01;
import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
  
        System.out.print("문자 입력 : ");        
        String str = scan.nextLine();
        char[] ch = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length() -i - 1; j++) {
                if (ch[i] == str.charAt(i + j + 1)) {
                    count++;
                }
            }
            if (count == 0) {
                
            } else {
                System.out.println(ch[i] + "중복 문자 : " + count);
            } 
        }
    }
}
