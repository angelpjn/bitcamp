package bitcamp.java100.ch16.ex2;

public class Account {
    long balance;
    
    public long deposit(long money) {
        this.balance += money;
        return this.balance;
    }
    
    public long withdraw(long money) {
        if ((this.balance - money) < 0)
            return 0;
        
        this.balance -= money;
        
        return money;
    }
}







