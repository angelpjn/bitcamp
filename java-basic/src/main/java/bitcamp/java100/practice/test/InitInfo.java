package bitcamp.java100.practice.test;

public class InitInfo {
    
    ConsoleObject consoleobj = new ConsoleObject();
    
    void initInfo(Score score) {
        score.name = consoleobj.console.readLine("이름? ");
        score.kor = Integer.parseInt(consoleobj.console.readLine("국어? "));
        score.eng = Integer.parseInt(consoleobj.console.readLine("영어? "));
        score.math = Integer.parseInt(consoleobj.console.readLine("수학? "));
        score.sum = score.kor + score.eng + score.math;
        score.avg = score.sum / 3f;
    }
}
