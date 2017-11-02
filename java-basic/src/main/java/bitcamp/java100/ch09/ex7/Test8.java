package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

import bitcamp.java100.ch09.ex7.Test6.Contact;

public class Test8 {

    static class MyKey {
        String id;
        String pwd;

        public MyKey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }
    }

    public static void main(String[] args) {

        HashMap<MyKey, Contact> map = new HashMap<>();

        Contact c1 = new Contact("홍길동", "hong@test", "1111-1111");
        MyKey k1 = new MyKey("aaaa", "1111");
        
        map.put(k1, c1);

        System.out.println(map.get(k1));

        MyKey k2 = new MyKey("aaaa", "1111");
        System.out.println(map.get(k2));
        
    }
}










