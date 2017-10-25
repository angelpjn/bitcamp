import java.util.Scanner;

public class no1_1 {

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
