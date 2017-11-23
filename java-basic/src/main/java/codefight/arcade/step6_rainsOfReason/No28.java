/*
Given a string, 
replace each its character 
by the next one 
in the English alphabet 
(z would be replaced by a).

Example

For inputString = "crazy", the output should be
alphabeticShift(inputString) = "dsbaz".
*/
package codefight.arcade.step6_rainsOfReason;

public class No28 {
    String alphabeticShift(String inputString) {
        
        StringBuffer buf = new StringBuffer(inputString);
        
        String result = "";
        
        for (int i = 0; i < inputString.length(); i++) {
            if (buf.charAt(i) == 'z')
                buf.replace(i, i + 1, "a");
            else
                buf.replace(i, i + 1, Character.toString((char)(buf.charAt(i) + 1)));
        }
        result = buf.toString();
        return result;
    }

    public static void main(String[] args) {
        No28 no = new No28();

        String inputString = "crazy";
        System.out.println(no.alphabeticShift(inputString));
    }

}
