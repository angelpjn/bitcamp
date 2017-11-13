/*
1.9 문자열 회전 : 한 단어가 다른 문자열에 포함되어 있는지 판별하는 isSubstring이라는 메서드가 있다고 하자. 
s1과 s2의 두 문자열이 주어졌고, s2가 s1을 회전시킨 결과인지 판별하고자 한다(가령 'waterbottle'은 'erbottlewat'을
회전시켜 얻을 수 있는 문자열이다). 
isSubstring 메서드를 한 번만 호출해서 판별할 수 있는 코드를 작성하라.
*/
package ch01;

import java.util.Scanner;

public class No9 {

    static Scanner scan = new Scanner(System.in);

    static String prompt(String message) {
        System.out.print(message);
        String str = scan.nextLine();
        return str;
    }

    static boolean confirm(String message) {
        System.out.print(message);
        String res = scan.nextLine().toLowerCase();
        if (res.equals("") || res.equals("y") || res.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {

        while (true) {
            String strOri = prompt("문자열 1 입력 : ");
            String strCheck = prompt("문자열 2 입력 : ");
            char[] chArr = new char[strOri.length()];
            String[] strArr = new String[strOri.length()];

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < chArr.length; i++) {
                chArr[i] = strOri.charAt(i);
            }

            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strOri.substring(i);
                for (int j = 0; j < i; j++) {
                    strArr[i] += Character.toString(chArr[j]);
                }
            }
            int i = 0;
            int count = 0;
            for (i = 0; i < strArr.length; i++) {
                if (strCheck.equals(strArr[i])) {
                    count++;
                    break;
                }
            }
            if (count != 0 || strOri.equals(strCheck)) {
                System.out.println("회전문");
                System.out.println(strArr[i] + "는 " + strOri + "의 " + i + "번째 회전 결과");
            } else {
                System.out.println("회전문 아님");
            }

            System.out.println();

            if (!confirm("계속할까? ")) {
                System.out.println();
                break;

            }
        }

    }
}
