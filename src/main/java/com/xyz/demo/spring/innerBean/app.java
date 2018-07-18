package com.xyz.demo.spring.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xyz.demo.spring.innerBean.Customer;

class App
{
    private static ApplicationContext applicationContext;

    public static void main( String[] args )
    {
        applicationContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Customer obj = (Customer) applicationContext.getBean("CustomerBean");

        System.out.println(obj.toString());
    }
}