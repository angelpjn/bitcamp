package bitcamp.java100.practice.test;

public class Information {
    
    static Score[] scores = new Score[100];
    static int cursor = 0;
    
    static void add(Score score) {
        scores[cursor++] = score;
    }
    
    public static void main(String[] args) {
        ConsoleObject consoleobj = new ConsoleObject();
        
        consoleobj.prepareConsole();
    
        while (true) {
            Score score = new Score();
            
            MessageBox msg = new MessageBox(); 
            
            InitInfo initinfo = new InitInfo();
            
            initinfo.initInfo(score);
            if (msg.confirm("저장?(y/n) ")) {
                add(score);
            }
            
            if (!msg.confirm("계속?(y/n) ")) {
                break;
            }
        }
        
        for (int i = 0; i < cursor; i++) {
            PrintInfo print = new PrintInfo();
            print.print(scores[i]);
        }
    }
}




























