package aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class AppAdvice {
    @Before("execution(* *.aopTrigger(..))")
    public void beforeAdvice(){
        System.out.println("Calling AOP method which targets the execution of ANY method call in the application.");
    }

}
