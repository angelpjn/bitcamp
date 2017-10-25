import java.util.Scanner;

public class no1_3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
  
        System.out.print("문자 입력 : ");        
        String strTemp1 = scan.nextLine();
        
        char[] ch1 = new char[strTemp1.length()];
        
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = strTemp1.charAt(i);
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ' ') {
                System.out.print("%20");
                continue;
            }
            System.out.print(ch1[i]);
        }
        System.out.println();
    }
}
