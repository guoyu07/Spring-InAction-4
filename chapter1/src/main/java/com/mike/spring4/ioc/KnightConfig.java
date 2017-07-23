package com.mike.spring4.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuguirong on 23/07/2017.
 * 骑士配置类：java-base的方式，在代码样例中我们尽量使用这种推荐的方式来配置，不使用xml
 */
@Configuration //表明这是一个配置类
public class KnightConfig {

    @Bean //spring4引入的一个声明明bean的注解
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuset(System.out);
    }
}
