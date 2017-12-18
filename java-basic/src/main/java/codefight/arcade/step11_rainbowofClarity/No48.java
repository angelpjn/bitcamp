/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step11_rainbowofClarity;

public class No48 {

    boolean isDigit(char symbol) {
        if ('0' <= symbol && symbol <= '9')
            return true;
        return false;
    }


    public static void main(String[] args) {
        No48 no = new No48();

        char symbol = '0';

        System.out.println(no.isDigit(symbol));
    }

}
