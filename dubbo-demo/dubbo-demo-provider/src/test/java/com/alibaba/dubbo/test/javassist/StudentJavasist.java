package com.alibaba.dubbo.test.javassist;

import javassist.*;

import java.lang.reflect.InvocationTargetException;

/**
 * <p>TODO</p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author jixd
 * @version 1.0
 * @Date Created in 2018年06月28日 13:18
 * @since 1.0
 */
public class StudentJavasist {
    public StudentJavasist() {
    }

    public static void main(String[] args) throws CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //class容器
        ClassPool pool = new ClassPool(true);
        //class
        CtClass ctClass = pool.makeClass("com.alibaba.dubbo.Student");
        ctClass.addField(CtField.make("private String name;",ctClass));

        ctClass.addMethod(CtMethod.make("public String getName(){return name;}",ctClass));

        ctClass.addConstructor(CtNewConstructor.make("public Student(){this.name = \"xiaohua\";}",ctClass));

        Class student = ctClass.toClass();

        Object o = student.newInstance();

        String name = (String)student.getDeclaredMethod("getName").invoke(o);

        System.out.println(name);
    }

}
