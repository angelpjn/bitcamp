/*
Correct variable names consist only of 
Latin letters, digits and underscores
and they can't start with a digit.

Check if the given string is a correct variable name.
*/
package codefight.arcade.step6_rainsOfReason;

public class No27 {
    boolean variableName(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));

            if (i == 0 && 0 <= name.charAt(i) - '0' && name.charAt(i) - '0' <= 9) {
                System.out.println(count);
                return false;
            }
            if (name.charAt(i) - '_' == 0 ||
                    ('a' <= name.charAt(i) && name.charAt(i) <= 'z') ||
                    ('A' <= name.charAt(i) && name.charAt(i) <= 'Z') ||
                    ('0' <= name.charAt(i) && name.charAt(i) <= '9'))
            count++;
        }
        if (count == name.length())
            return true;
        return false;
    }

    public static void main(String[] args) {
        No27 no = new No27();

        String name = "va[riable0";
        System.out.println(no.variableName(name));
    }

}
