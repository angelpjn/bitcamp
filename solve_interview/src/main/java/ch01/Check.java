package ch01;

import java.util.Scanner;

class Check {

    static Scanner scan = new Scanner(System.in);
    
    public static String prompt(String message) {
        System.out.print(message);
        return scan.nextLine();
    }
    
    public static boolean confirm(String res) {
        if (res.equals("n") || res.equals("no") || res.equals("")) 
            return false;
        return true;
            
    }
    
}
