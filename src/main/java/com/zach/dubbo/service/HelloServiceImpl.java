package com.zach.dubbo.service;

/**
 * Created by Administrator on 2016-10-16.
 */
public class HelloServiceImpl implements  HelloService{

    public String sayHello(String str) {
        System.out.println(str);
        return str + "isOK";
    }
}
