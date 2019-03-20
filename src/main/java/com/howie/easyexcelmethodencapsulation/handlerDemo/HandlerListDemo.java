package com.howie.easyexcelmethodencapsulation.handlerDemo;

import java.util.List;

public class HandlerListDemo implements IHandler {
    private List<IHandler> list;
    private int index = -1;

    HandlerListDemo(List<IHandler> list) {
        this.list = list;
    }

    @Override
    public void checkDemo(IHandler handler, String message) {
        if (index == list.size() - 1) {
            System.out.println("责任链执行结束");
        }else {
            index++;
            list.get(index).checkDemo(this, message);
        }
    }
}
