/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

public class No53 {

    boolean validTime(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3));
        
        if (hour >= 24) return false;
        if (min >= 60) return false;
            
        return true;
    }

    public static void main(String[] args) {
        No53 no = new No53();

        String time = "13:58";

        System.out.println(no.validTime(time));
    }

}
