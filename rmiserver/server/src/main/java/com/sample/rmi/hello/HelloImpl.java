package com.sample.rmi.hello;

import com.smple.rmi.hello.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @company: Linesum
 * @author huarh
 * @date: 2017年07月03日 下午0:58:48 
 * @Description:
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {

    private static final long serialVersionUID = -2766425774246043720L;

    protected HelloImpl() throws RemoteException {
    }

    @Override
    public String helloWorld() throws RemoteException {
        return "Hello World!";
    }

    @Override
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
        return "你好，" + someBodyName + "!";
    }
}
