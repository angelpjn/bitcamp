package ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tes3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx =
                new ClassPathXmlApplicationContext("ch20/ex2/application-context3.xml");
    }
}
