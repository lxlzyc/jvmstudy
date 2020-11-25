package com.lxl.jvm.chapter3;

/**
 * @program: jvmstudy
 * @description: 长期存活对象进入老年代
 *-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1（设置几次回收后进入老年代） -XX:+PrintTenuringDistribution
 * Heap
 *  PSYoungGen      total 9216K, used 6674K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 8192K, 81% used [0x00000000ff600000,0x00000000ffc84908,0x00000000ffe00000)
 *   from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 *   to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
 *  ParOldGen       total 10240K, used 8192K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   object space 10240K, 80% used [0x00000000fec00000,0x00000000ff400020,0x00000000ff600000)
 *  Metaspace       used 3471K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
 * @author: lxl
 * @create: 2020-11-25 22:29
 **/
public class TestTenuringThreshold {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] location1,location2,location3;
        location1 = new byte[ _1MB/4];
        location2 = new byte[4* _1MB];
        location3 = new byte[4* _1MB];
        location3= null;
        location3 = new byte[4* _1MB];
    }

}
