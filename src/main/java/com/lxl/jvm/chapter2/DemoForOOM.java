package com.lxl.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: jvmstudy
 * @description: OOM demo
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author: lxl
 * @create: 2020-10-29 22:47
 **/
public class DemoForOOM {

    static class OOMObject {
        int[][] m;
        public OOMObject(){
            m = new int[1024][1024];
        }
    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        int i = 0;
        while (true) {
            System.out.println(++i);
            list.add(new OOMObject());
        }
    }

}
