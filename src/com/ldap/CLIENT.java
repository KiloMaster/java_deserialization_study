package com.ldap;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CLIENT {
    public static void main(String[] args) throws Exception {
        String uri = "ldap://127.0.0.1:1389/Object";
        Context ctx = new InitialContext();
        ctx.lookup(uri);
    }
}
