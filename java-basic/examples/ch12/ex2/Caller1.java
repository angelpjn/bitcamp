package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Caller1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
