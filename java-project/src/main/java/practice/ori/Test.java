package practice.ori;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

    static boolean confirm(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        String response = scan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes")) 
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Score> list = new ArrayList<>();
        
        while (true) {
            Score score = new Score();
            score.input();
            
            list.add(score);
            
            if (!confirm("계속하시겠습니까? "))
            break;
        }
        
        Iterator<Score> itr = list.iterator();
        
        while (itr.hasNext()) {
            itr.next().print();
        }
    }
}
