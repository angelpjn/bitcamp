import java.util.Arrays;
import java.util.Scanner;

public class no1_5 {

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
