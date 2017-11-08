/* 
[11-2] 다음 코드의 실행결과를 적으시오.

*/

package ch11_Collections_Framework;

import java.util.*;

class No2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        HashSet set = new HashSet(list);
        TreeSet tset = new TreeSet(set);
        Stack stack = new Stack();
        stack.addAll(tset);
        while (!stack.empty())
            System.out.println(stack.pop());
    }
}