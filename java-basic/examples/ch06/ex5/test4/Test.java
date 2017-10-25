package bitcamp.java100.ch06.ex5.test4;

import java.util.Scanner;

public class Test {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();

        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        while (true) {
            Score.inputScore();
            Score.computeScore();
            Score.printScore();
            
            if (!confirm("계속 하시겠습니까? ")) {
                break;
            }
        }
    }
}
