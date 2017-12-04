package ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tes2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx =
                new ClassPathXmlApplicationContext("ch20/ex2/application-context2.xml");
    }
}
