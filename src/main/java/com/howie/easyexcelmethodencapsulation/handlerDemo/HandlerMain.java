package com.howie.easyexcelmethodencapsulation.handlerDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import static java.lang.Thread.sleep;

public class HandlerMain {
    public static void main(String[] args) throws InterruptedException {
        // 责任链
//        List<IHandler> list = new ArrayList<>();
//        IHandler h1 = new HandlerDemo1();
//        IHandler h2 = new HandlerDemo2();
//        list.add(h1);
//        list.add(h2);
//        final HandlerListDemo handlerListDemo = new HandlerListDemo(list);
//        handlerListDemo.checkDemo(handlerListDemo, "c");

        // 队列
        BlockingQueue<String> str = new ArrayBlockingQueue<>(3);

        Thread t1 = new Thread(() -> {
            try {
                str.put("苹果");
                str.put("苹果2");
                str.put("苹果3");
                System.out.println(str +"sssss");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        sleep(2000);
        str.put("苹果4");
        str.put("ffffff");
        Thread t2 = new Thread(() -> {
            try {

                System.out.println(str + "dddd");
                sleep(2000);
                System.out.println(str.take());
                System.out.println(str.take());
                System.out.println(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.start();

    }
}
