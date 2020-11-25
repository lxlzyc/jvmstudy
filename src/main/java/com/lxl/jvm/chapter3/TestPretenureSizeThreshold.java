package com.lxl.jvm.chapter3;

/**
 * @program: jvmstudy
 * @description: 大对象直接进入老年代
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3146728(大于此值的直接分配到老年代)
 * -XX:PretenureSizeThreshold 只对serial 和parNew生效 -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
 * Heap
 *  par new generation   total 9216K, used 2322K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   eden space 8192K,  28% used [0x00000000fec00000, 0x00000000fee448a8, 0x00000000ff400000)
 *   from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 *   to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 *  concurrent mark-sweep generation total 10240K, used 4096K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *  Metaspace       used 3427K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 375K, capacity 388K, committed 512K, reserved 1048576K
 * @author: lxl
 * @create: 2020-11-25 22:21
 **/
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] location1;
        location1 = new byte[4* _1MB];
    }
}
