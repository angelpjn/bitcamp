/*
input:
s: "VizQEogigkRZJacVELulHjG"
Expected Output:
"viz q eogigk r z jac v e lul hj g"
"viz q eogigk r z jac v e lul hj g"
Console Output:
Empty
*/
package codefight.interview.strings;

public class No1 {

    String amendTheSentence(String s) {
        char[] ch = s.toCharArray();

        int[] upper = new int[s.length()];
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
                upper[i] = 1;
            }
        }

        if (count == 0) {
            return s.toLowerCase();
        } else {
            
        
        int[] upper2 = new int[upper.length + count - 1];
        
        for (int i = 0; i < upper.length; i++) {
            upper2[i] = upper[i];
        }
        
        char[] ch2 = new char[upper.length + count];

        int count2 = 0;
        for (int i = 0;  i < ch.length; i++) {
            ch2[i + count2] = ch[i];
            if (upper2[i] > 0) {
                ch2[i + count2] = ' ';
                count2++;
                ch2[i + count2] = ch[i];
            }
        }
        
        String s2 = "";
        for (int i = 0; i < ch2.length; i++) {
            s2 += ch2[i];
        }
        System.out.println(s2.toLowerCase());
        return s2.toLowerCase();
        }
    }
    
    public static void main(String[] args) {
        No1 no = new No1();
//        no.amendTheSentence("VizQEogigkRZJacVELulHjG");
        System.out.println(no.amendTheSentence("Hello"));
    }
}
