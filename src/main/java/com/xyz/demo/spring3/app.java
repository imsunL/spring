package com.xyz.demo.spring3;

import com.xyz.demo.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    private static ApplicationContext applicationContext;
    public static void main(String[] args){
        applicationContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld obj =(HelloWorld) applicationContext.getBean("helloBean");
        obj.printHello();
    }
}
