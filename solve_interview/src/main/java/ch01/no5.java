package ch01;
/*
1.5 하나 빼기 : 문자열을 편집하는 방법에는 세 가지 종류가 있다. 문자 삽입, 문자 삭제, 문자 교체. 
문자열 두 개가 주어졌을 때, 문자열을 같게 만들기 위한 편집 횟수가 1회 이내인지 확인하는 함수를 작성하라.

- 예제
· pale, ple -> true
· pales, pale -> true
· pale, bale -> true
· pale, bake -> false
 */
import java.util.Arrays;
import java.util.Scanner;

public class no5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("문자 1 입력 : ");
        String str1 = scan.nextLine();
        
        System.out.print("문자 2 입력 : ");
        String str2 = scan.nextLine();
        
        
        if (!(str1.length() == str2.length())) {
            
        } else {
            char[] ch1 = new char[str1.length()];
            char[] ch2 = new char[str1.length()];
            
            for (int i = 0; i < str1.length(); i++) {
                ch1[i] = str1.charAt(i);
                ch2[i] = str2.charAt(i);
            }
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            int count = 0;
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(count + "회 편집 필요");
            } else {System.out.println("1회 이내 편집 필요");
            }
        }
    }
}
