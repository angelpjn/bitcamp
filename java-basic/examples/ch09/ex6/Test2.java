package bitcamp.java100.ch09.ex6;

public class Test2 {

    public static void main(String[] args) {

        Stack2<Contact> contacts = new Stack2<Contact>();
        
        contacts.push(new Contact("홍길동", "hon@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));
//        contacts.push(new String("안중근")); 
//        contacts.push(new Boolean(true));
        
        Contact c1 = contacts.pop(); // => 꺼낼때마다 형변환 해줘야 하는 문제
        Contact c2 = contacts.pop(); // => 꺼낼때마다 형변환 해줘야 하는 문제
        
        Stack2<Book> bookStack = new Stack2<Book>();
        bookStack.push(new Book());
        bookStack.push(new Book());
//        bookStack.push(new String());
//        bookStack.push(new Integer());
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();

        // ScoreStack
        Stack2<Score> scoreStack = new Stack2<Score>();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
//        scoreStack.push(new String());
//        scoreStack.push(new Integer());
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
    }
}
