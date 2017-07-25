package com.mike.spring4.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by xuguirong on 23/07/2017.
 */
@Aspect
public class Audience {

    @Pointcut("execution(** com.mike.spring4.aop.Performace.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhone(){
        System.out.println("关闭手机");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("寻找座位");
    }

    @After("performance()")
    public void leave(){
        System.out.println("离场");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("鼓掌");
    }

    @AfterThrowing("performance()")
    public void refund(){
        System.out.println("退款");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("环绕：关闭手机");
            System.out.println("环绕：寻找座位");
            proceedingJoinPoint.proceed();
            System.out.println("环绕：鼓掌");

        }catch (Throwable e){
            System.out.println("环绕：退款");
        }
    }

}
