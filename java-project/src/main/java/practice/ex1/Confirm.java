package practice.ex1;

import java.util.Scanner;

class Confirm {

    Scanner scan = new Scanner(System.in);
    
    public boolean confirm(String message) {
        System.out.print(message);
        String response = scan.nextLine().toLowerCase();
        if (response.equals("y") || response.equals("yes") || response.equals("")) 
            return true;
        return false;
    }

    public boolean confirm2(String message) {
        System.out.print(message);
        String response = scan.nextLine().toLowerCase();
        if (response.equals("n") || response.equals("no") || response.equals("")) 
            return false;
        return true;
    }
    
}
