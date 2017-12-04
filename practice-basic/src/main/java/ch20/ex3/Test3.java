package ch20.ex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx =
                new ClassPathXmlApplicationContext(
                        "ch20/ex3/application-context3.xml");
    }
}
