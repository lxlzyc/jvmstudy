package com.lxl.jvm.chapter2;

/**
 * @program: jvmstudy
 * @description: String.intern()返回引用的测试
 * @author: lxl
 * @create: 2020-11-03 21:20
 **/
public class RuntimeConstantPoolOOM {

    //intern 首次遇到原则
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        //true
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        //false
        System.out.println(str2.intern() == str2);
    }

}
