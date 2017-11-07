/*
7.2 콜 센터 : 고객 응대 담당자, 관리자, 감독관 이렇게 세 부류의 직원들로 구성된 콜 센터가 있다고 하자. 
콜 센터로 오는 전화는 먼저 상담이 가능한 고객 응대 담당자로 연결돼야 한다.
고객 응대 담당자가 처리할 수 없는 전화는 관리자로 연결되고, 관리자가 처리할 수 없는 전화는 다시 감독관에게 연결 된다.
이 문제를 풀기 위한 자료구조를 설계하라.
응대 가능한 첫 번째 직원에게 전화를 연결시키는 dispatchCall() 메서드를 구현하라.
*/

package ch07;

import java.util.Scanner;

public class No2 {
    private static String im;

    static Scanner scan = new Scanner(System.in);
    
    public void dispatchCall(String im) {
        if (im.equals("u")) {
            System.out.println("상담원 응대 가능 건");
        } else if (im.equals("m")) {
            System.out.println("관리자 응대 가능 건");
        } else {
            System.out.println("감독관 응대 건");
        }
    }
    
    public static void main(String[] args) {
        No2 no = new No2();
        System.out.print("응대 중요도 : ");
        im = scan.nextLine();
        no.dispatchCall(im);
    }
}