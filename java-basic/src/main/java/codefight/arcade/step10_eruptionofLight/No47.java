
/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step10_eruptionofLight;

public class No47 {

    boolean isMAC48Address(String inputString) {
        if (inputString.length() != 17) {
            return false;
        }
        for (int i = 0; i < 17; i++) {
            if ((i + 1) % 3 == 0 && inputString.charAt(i) != '-') {
                return false;
            } else if ((i + 1) % 3 != 0 && (('9' < inputString.charAt(i) && inputString.charAt(i) < 'A') ||
                    (inputString.charAt(i) < '0' || inputString.charAt(i) > 'F'))) {
                return false;
            }
            
        }
        return true;
    }


    public static void main(String[] args) {
        No47 no = new No47();

        String inputString = "00-1B-63-84-45-E6";

        System.out.println(no.isMAC48Address(inputString));
    }

}
