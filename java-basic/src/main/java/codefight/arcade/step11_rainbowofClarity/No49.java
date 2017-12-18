/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step11_rainbowofClarity;

public class No49 {

    String lineEncoding(String s) {
        int count = 1;
        String encoding = "";
        for (int i = 1; i < s.length(); i++) {
            if (count == 1) {
                System.out.println(1);
                encoding += s.substring(i - 1, i);
            }
            if (s.charAt(i - 1) == s.charAt(i) && i != s.length() - 1) {
                System.out.println(2);
                count++;
            } else if (s.charAt(i - 1) != s.charAt(i) && i != s.length() - 1) {
                System.out.println(3);
                if (count != 1)
                    encoding += count;
                count = 1;
            } else if (s.charAt(i - 1) == s.charAt(i) && i == s.length() - 1) {
                System.out.println(4);
                count++;
                encoding += count;
            } else if (s.charAt(i - 1) != s.charAt(i) && i == s.length() - 1) {
                System.out.println(5);
                if (count != 1)
                    encoding += count + s.substring(i, i + 1);
                else
                    encoding += s.substring(i, i + 1);
            }
        }
        char[] temp = encoding.toCharArray();
        char temp1 = ' ';
        for (int i = 1; i < temp.length; i++) {
            if ('2' <= temp[i] && temp[i] <= '9') {
                temp1 = temp[i];
                temp[i] = temp[i - 1];
                temp[i - 1] = temp1;
            }
        }
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            result += temp[i];
        }

        return result;
    }


    public static void main(String[] args) {
        No49 no = new No49();

        String s = "aabbbc";

        System.out.println(no.lineEncoding(s));
    }

}


















