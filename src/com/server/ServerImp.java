package com.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ServerImp extends UnicastRemoteObject implements ServerI {
    protected ServerImp() throws RemoteException {
        super();
    }

    @Override
    public String action(String arg) {
        System.out.println(arg);

        return arg;
    }
}