package com.lxl.jvm.chapter3;

/**
 * @program: jvmstudy
 * @description: 空间分配担保
 * 在minor gc前，虚拟机必须检查老年代最大可用连续空间是否大于新生代所有对象的总空间
 * 如果成立则minor gc安全；
 * 否则 查看 -XX:HandlePromotionFailure 参数 （是否允许担保失败）
 *  true 检查老年代最大可用的连续空间 是否大于历次晋升的对象平均大小。如果大于 进行minor gc，否则 full gc
 *  false 直接full gc
 *  （最极端的 内存回收后 新生代所有对象都存活，所以需要老年代担保）
 *  -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:HandlePromotionFailure=false -XX:+PrintCommandLineFlags -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
 *  java 1.6后，此参数无效。
 *  规则变为只要老年代的连续空间大于新生代对象总大小或历次晋升平均大小，就会MinGC 否则full gc
 *  Heap
 *  par new generation   total 9216K, used 4480K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   eden space 8192K,  54% used [0x00000000fec00000, 0x00000000ff060200, 0x00000000ff400000)
 *   from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 *   to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 *  concurrent mark-sweep generation total 10240K, used 8852K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *  Metaspace       used 3472K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
 *
 * @author: lxl
 * @create: 2020-11-25 22:38
 **/
public class TestHandlePromotion {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] location1,location2,location3,location4,location5,location6,location7;
        location1 = new byte[2* _1MB];
        location2 = new byte[2* _1MB];
        location3 = new byte[2* _1MB];
        location1 = null;
        location4 = new byte[2* _1MB];
        location5 = new byte[2* _1MB];
        location6 = new byte[2* _1MB];
        location4 = null;
        location5 = null;
        location6 = null;
        location7 = new byte[2* _1MB];

    }

}
