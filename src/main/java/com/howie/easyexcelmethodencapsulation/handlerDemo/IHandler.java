package com.howie.easyexcelmethodencapsulation.handlerDemo;

/**
 * 责任链入口
 */
public interface IHandler {
    void checkDemo(IHandler handler, String message);
}
