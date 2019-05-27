package com.atguigu.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.gmall.service.OrderService;

public class MainApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");

        // 通过Order接口条用User接口
        OrderService bean = ioc.getBean(OrderService.class);
        bean.initOrder("2");
        bean.sayHellow();

        System.out.println("调用成功……");

        // 阻塞
        System.in.read();
    }
}
