package com.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerI extends Remote
{
    public String action(String arg)throws RemoteException;
}