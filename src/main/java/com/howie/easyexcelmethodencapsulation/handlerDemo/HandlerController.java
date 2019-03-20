package com.howie.easyexcelmethodencapsulation.handlerDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HandlerController {

    @Resource(name = "handlerDemo")
    private IHandler handler;

    @RequestMapping("/demo")
    public void demo() throws InterruptedException {
        handler.checkDemo(handler, "a");
        Thread.sleep(5000);
        handler.checkDemo(handler, "b");
    }
}
