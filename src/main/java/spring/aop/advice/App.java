package spring.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] {"SpringAopAdvice.xml"});

    }
}
