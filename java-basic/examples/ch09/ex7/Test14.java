package bitcamp.java100.ch09.ex7;

import java.util.HashSet;
import java.util.Iterator;

public class Test14 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        String s1 = "홍길동";
        String s3 = "임꺽정";
        String s2 = "유관순";
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
