package com.server;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CLIENT {
    public static void main(String[] args) throws Exception {
        String uri = "rmi://127.0.0.1:1099/ExecObj";
        Context ctx = new InitialContext();
        ctx.lookup(uri);
    }
}
