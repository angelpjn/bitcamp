package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test4 {

    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
        
        String s4 = new String("홍길동");
        String s5 = new String("홍길동");
        
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);
        
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s4.equals(s5));
        
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        
        set.add(s4);
        set.add(s5);
        
        System.out.println(set.size());

        String[] arr = new String[set.size()]; // 파라 제공한 배열의 배열 개수가 필요한 요소보다 적으면 (여기서 1~3을 넣으면. 필요 개수는 4) HashSet은 4개 짜리 배열 만들어서 값을 넣은 뒤 리턴.
                                               // 그래서 배열 개수가 같지 않으면 arr과 arr2의 레퍼런스가 다르게 된다.
        String[] arr2 = set.toArray(arr);
        
        if (arr == arr2) 
            System.out.println("arr == arr2");
        else
            System.out.println("arr != arr2");
        
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
