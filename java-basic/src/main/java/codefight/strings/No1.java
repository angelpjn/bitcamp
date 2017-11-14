package codefight.strings;

import java.util.Arrays;

public class No1 {

    public static void main(String[] args) {
        String s = "CodefightsIsAwesome";

        char[] ch = s.toCharArray();

        int[] upper = new int[s.length()];
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
                upper[i] = s.indexOf(ch[i]);
            }
        }

        
        int[] upper2 = new int[ch.length + count];
        for (int i = 1; i < upper.length; i++) {
            upper2[i] = upper[i];
        }
        System.out.println(Arrays.toString(upper2));
    
        char[] ch2 = new char[upper2.length];

        for (int i = ch2.length - 1; i >= 0; i--) {
            if (count > 1) {
                ch2[i] = ch[i - 2];
                if (i - 2 < 1) {
                    count--;
                }
            } else if (count == 1) {
                ch2[i] = ch[i - 1];
                if (i < ch2.length - 1 && ch[i - 1] >= 65 && ch[i - 1] <= 90) {
                    count--;
                }
            } else {
                ch2[i] = ch[i];
            }
        }
        String s2 = "";
        for (int i = 0; i < ch2.length; i++) {
            s2 += ch2[i];
        }
        System.out.println(s2.toLowerCase());
        
    }
}
// }
// if (count == 1)
// }
// }}

// String s2 = "";
// for (int i = 0; i < ch2.length; i++) {
// s2 += ch2[i];
// }
//
// System.out.println(s2.toLowerCase());
