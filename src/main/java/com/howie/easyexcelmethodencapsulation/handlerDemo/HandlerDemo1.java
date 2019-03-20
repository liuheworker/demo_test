package com.howie.easyexcelmethodencapsulation.handlerDemo;

public class HandlerDemo1 implements IHandler {
    @Override
    public void checkDemo(IHandler handler, String message) {
        if ("a".equals(message)) {
            System.out.println("A执行");
        }else {
            handler.checkDemo(handler, message);
        }
    }
}
