/*
부분집합 :
어떤 집합의 부분집합을 전부 반환하는 메서드를 작성하라.
 
 */
package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ArrayList list = new ArrayList();
        int n = 10;
        
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random() * n));
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j))
                    i--;
            }
        }
        
        System.out.print("부분집합 : ");
        int p = Integer.parseInt(scan.nextLine());
        
        Iterator itr = list.iterator();
   
        int i = 0;
        while (itr.hasNext()) {
            if ((int)itr.next() % p == 0)
                System.out.println(itr.next());
            i++;
        }
    }

}
