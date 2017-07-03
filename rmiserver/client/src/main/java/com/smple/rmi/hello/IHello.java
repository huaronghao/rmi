package com.smple.rmi.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @company: Linesum
 * @author huarh
 * @date: 2017年07月03日 下午0:56:28 
 * @Description:
 */
public interface IHello extends Remote {

    String helloWorld() throws RemoteException;

    String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}
