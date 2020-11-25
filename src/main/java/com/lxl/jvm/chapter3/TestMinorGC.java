package com.lxl.jvm.chapter3;

/**
 * @program: jvmstudy
 * @description: 对象优先再eden分配
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * Heap
 *  PSYoungGen      total 9216K, used 2322K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 8192K, 28% used [0x00000000ff600000,0x00000000ff8448c8,0x00000000ffe00000)
 *   from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 *   to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
 *  ParOldGen       total 10240K, used 0K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   object space 10240K, 0% used [0x00000000fec00000,0x00000000fec00000,0x00000000ff600000)
 *  Metaspace       used 3418K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 374K, capacity 388K, committed 512K, reserved 1048576K
 * @author: lxl
 * @create: 2020-11-25 22:14
 **/
public class TestMinorGC {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] location1,location2,location3,location4;
        location1 = new byte[2* _1MB];
        location1 = new byte[2* _1MB];
        location1 = new byte[2* _1MB];
        //出现一次minorGC
        location1 = new byte[4* _1MB];
    }
}
