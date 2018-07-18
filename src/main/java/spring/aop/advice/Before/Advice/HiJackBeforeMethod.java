package spring.aop.advice.Before.Advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HiJackBeforeMethod implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HiJAckBeforeMethod : BEfore method hijacked!");
    }
}
