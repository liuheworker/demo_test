package com.howie.easyexcelmethodencapsulation.handlerDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class HandlerConfig {

    @Bean(name = "handlerDemo")
    @Scope(value = "prototype")
    public IHandler getHandler() {
        List<IHandler> list = new ArrayList<>();
        IHandler h1 = getHandlerDemo1();
        IHandler h2 = getHandlerDemo2();
        System.out.println(h1);
        System.out.println(h2);
        list.add(h1);
        list.add(h2);
        return new HandlerListDemo(list);
    }

    @Bean
    public HandlerDemo1 getHandlerDemo1() {
        final HandlerDemo1 handlerDemo1 = new HandlerDemo1();
        System.out.println(handlerDemo1);
        return handlerDemo1;
    }

    @Bean
    public HandlerDemo2 getHandlerDemo2() {
        final HandlerDemo2 handlerDemo2 = new HandlerDemo2();
        System.out.println(handlerDemo2);
        return handlerDemo2;
    }
}
