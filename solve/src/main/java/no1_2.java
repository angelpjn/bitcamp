import java.util.Arrays;
import java.util.Scanner;

public class no1_2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
  
        System.out.print("순열 대상 문자 입력 1 : ");        
        String strTemp1 = scan.nextLine();
        
        System.out.print("순열 대상 문자 입력 2 : ");        
        String strTemp2 = scan.nextLine();

        char[] ch1 = new char[strTemp1.length()];
        
        char[] ch2 = new char[strTemp2.length()];
        
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = strTemp1.charAt(i);
        }

        Arrays.sort(ch1);
        String str1 = Arrays.toString(ch1);
        System.out.println(str1);
        
        for (int i = 0; i < ch1.length; i++) {
            ch2[i] = strTemp2.charAt(i);
        }
        
        Arrays.sort(ch2);
        String str2 = Arrays.toString(ch2);
        System.out.println(str2);
        
        if (ch1.length == ch2.length || str1.equals(str2)) {
            System.out.println("두 문자열은 순열입니다.");
        } else {
            System.out.println("순열이 아닙니다");
        }
    }
}
