package ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tes4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx =
                new ClassPathXmlApplicationContext("ch20/ex2/application-context4.xml");
    }
}
