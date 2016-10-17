package com.zach.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2016-10-16.
 */
public class ServerMain {
    public static void main(String[] args) throws IOException {
        //因为这个spring是dubbo自带的，所以在这里就直接使用就好了，不用在引入spring了
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
