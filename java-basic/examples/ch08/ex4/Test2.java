package bitcamp.java100.ch08.ex4;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Score2 s1 = new Score2(1, "홍길동", 100, 100, 100);
        Score2 s2 = new Score2(1, "홍길동", 100, 100, 100);

        if (s1 != s2) {
            System.out.println("s1과 s2주소가 다르다.");
        }

        if (s1.equals(s2)) {
            System.out.println("s1과 s2의 내용은 같다.");
        }
    }
}