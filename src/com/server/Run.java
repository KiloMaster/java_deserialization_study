package com.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Run {
    public static void main(String[] args) {
        try {
            ServerI server = new ServerImp();
            int port= Integer.parseInt(args[0]);
            String registry_name=args[1];
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind(registry_name, server);
            System.out.println("Service Start!\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}