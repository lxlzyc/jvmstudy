package com.lxl.jvm.chapter2;

/**
 * @program: jvmstudy
 * @description: -Xss参数减少栈内存容量
 * 抛出stackOverFlow
 * -Xss280k
 * @author: lxl
 * @create: 2020-10-29 23:04
 **/
public class XssCaseStackOverFlow {

    private int stackLen = 1;
    public void stackLeak(){
        stackLen++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        XssCaseStackOverFlow xssForStackOverFlow = new XssCaseStackOverFlow();
        try {
            xssForStackOverFlow.stackLeak();
        }catch (Throwable throwable){
            System.out.println("stack length="+xssForStackOverFlow.stackLen);
            throw throwable;
        }
    }
}
