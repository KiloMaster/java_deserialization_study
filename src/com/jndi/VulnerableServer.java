package com.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;

public class VulnerableServer {
    public static void main(String[] args) throws Exception {
        String uri = "rmi://127.0.0.1:1099/ExecObj";
//        String uri = "rmi://127.0.0.1:1097/Exploit";//el
        Context ctx = new InitialContext();
        ctx.lookup(uri);
    }
}
