/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

public class No54 {

    int sumUpNumbers(String inputString) {
        
        int index = 0;
        int result = 0;
        for (int i = 0; i < inputString.length(); i = index + 1) {
            for (int j = i; j < inputString.length(); j++) {
                if (inputString.charAt(j) < '0' || '9' < inputString.charAt(j) || j == inputString.length() - 1) {
                    index = j;
                    break;
                }
            }
            
            try {
                if (index == inputString.length() - 1)
                    result += Integer.parseInt(inputString.substring(i, index + 1));
                else
                    result += Integer.parseInt(inputString.substring(i, index));
            } catch (NumberFormatException e) {
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No54 no = new No54();

        String inputString = "2 apples, 12 oranges";
//        String inputString = "12@3450";

        System.out.println(no.sumUpNumbers(inputString));
    }

}
