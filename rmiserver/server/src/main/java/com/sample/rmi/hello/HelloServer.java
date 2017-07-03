package com.sample.rmi.hello;

import com.smple.rmi.hello.IHello;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @company: Linesum
 * @author huarh
 * @date: 2017年07月03日 下午1:02:43 
 * @Description:
 */
public class HelloServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        //创建一个远程对象
        IHello hello = new HelloImpl();
        //本地主机上的远程对象注册表Registry的实例，并指定端口为8888，这一步必不可少（Java默认端口是1099），必不可缺的一步，缺少注册表创建，则无法绑定对象到远程注册表上
        LocateRegistry.createRegistry(8888);
        //把远程对象注册到RMI注册服务器上，并命名为RHello
        //绑定的URL标准格式为：rmi://host:port/name(其中协议名可以省略，下面两种写法都是正确的）
        Naming.bind("rmi://localhost:8888/Hello", hello);
//        Naming.bind("//localhost:8888/Hello",hello);
    }
}
