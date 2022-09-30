package org.practice.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAdvice {
    @Before("execution(* *.crossCutConcern*(..))")
    public void beforeAdvice(){
        System.out.println(
                "Inside Before AOP proxy object advice for any method starting with the name crossCutConcernOne.Called before actual definition."
        );
    }

    @After("execution(* *.crossCutConcern*(..))")
    public void afterAdvice(){
        System.out.println(
                "Inside After AOP proxy object advice for any method starting with the name crossCutConcernOne.Called after actual definition."
        );
    }

}
