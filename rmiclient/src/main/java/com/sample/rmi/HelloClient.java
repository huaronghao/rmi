package com.sample.rmi;

import com.smple.rmi.hello.IHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @company: Linesum
 * @author huarh
 * @date: 2017年07月03日 下午1:05:56 
 * @Description:
 */
public class HelloClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
        IHello hello =(IHello) Naming.lookup("rmi://localhost:8888/Hello");
        System.out.println(hello.helloWorld());
        System.out.println(hello.sayHelloToSomeBody("边浩"));
    }
}
