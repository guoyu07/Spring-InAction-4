package com.mike.spring4.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

/**
 * Created by xuguirong on 23/07/2017.
 * 吟游诗人
 */

@Aspect
public class Minstrel {

    @Pointcut("execution(* com.spring4.ioc.*(..))")
    private void anyMethod(){}//定义一个切入点

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    @Before("anyMethod() && args(name)")
    public void singBeforeQuest(){
        stream.println("Fa la la,thre knight is so brave!");
    }

    @After("anyMethod()")
    public void singAfterQuest(){
        stream.println("Tee hee hee,the brave knight " +
        "did embark on a quest!");
    }
}
