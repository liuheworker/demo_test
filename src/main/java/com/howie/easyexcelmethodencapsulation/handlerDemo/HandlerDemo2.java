package com.howie.easyexcelmethodencapsulation.handlerDemo;

public class HandlerDemo2 implements IHandler {
    @Override
    public void checkDemo(IHandler handler, String message) {
        if ("b".equals(message)) {
            System.out.println("B执行");
        }else {
            handler.checkDemo(handler, message);
        }
    }
}
