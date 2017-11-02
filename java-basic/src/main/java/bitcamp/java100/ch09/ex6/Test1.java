package bitcamp.java100.ch09.ex6;

public class Test1 {

    public static void main(String[] args) {
        Stack contacts = new Stack();
        
        contacts.push(new Contact("홍길동", "hon@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));
//        contacts.push(new String("안중근")); => 아무거나 입력되는 문제 
//        contacts.push(new Boolean(true));
        
        Contact c = (Contact)contacts.pop(); // => 꺼낼때마다 형변환 해줘야 하는 문제
        
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
//        bookStack.push(new String());
//        bookStack.push(new Integer());
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();

        // ScoreStack
        
        
        
        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
//        contactStack.push(new String());
//        contactStack.push(new Integer());
        
        
        
        // ScoreStack
        ScoreStack scoreStack = new ScoreStack();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
//        scoreStack.push(new String());
//        scoreStack.push(new Integer());
        
        
    }
}
