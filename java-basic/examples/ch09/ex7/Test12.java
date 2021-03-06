package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test12 {
    
    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }
        
    }

    public static void main(String[] args) {

        HashMap<String, Contact> map = new HashMap<>();

        map.put("c01", new Contact("홍길동1", "hong1@test.com", "1111-1111"));
        map.put("c02", new Contact("홍길동2", "hong2@test.com", "1111-1112"));
        map.put("c03", new Contact("홍길동3", "hong3@test.com", "1111-1113"));
        map.put("c04", new Contact("홍길동4", "hong4@test.com", "1111-1114"));
        map.put("c05", new Contact("홍길동5", "hong5@test.com", "1111-1115"));
        
        
        Set<Entry<String, Contact>> es = map.entrySet();
        // interface Entry<K,V> {
        
        for (Entry<String, Contact> e : es) {
            String key = e.getKey();
            Contact contact = e.getValue();
            System.out.printf("%s=%s\n", key, contact.name);
            
        }
        
    }
}










