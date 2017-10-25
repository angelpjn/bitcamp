
package bitcamp.java100.ch06.ex2.test2;

import java.io.Console;

public class Test {
    
    static void prepareConsole() {
        Console console = System.console();
        if (console == null) {
            System.err.println("콘솔 지원 불가!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        
        prepareConsole();
        
        while (true) {
            Score score = new Score();
            ScoreView.input(score);
            ScoreDao.add(score);

            if (!MessageBox.confirm("계속하시겠습니까?")) {
                break;
            }
        }
        
        for (int i = 0; i < ScoreDao.size(); i++) { // size() => size() : 저장된 갯수 리턴
            ScoreView.print(ScoreDao.get(i)); // 저장된 값을 리턴
        }
    }
}


















