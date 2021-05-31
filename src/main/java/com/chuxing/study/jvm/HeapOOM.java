package com.chuxing.study.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenguang
 * @date 2021/5/31
 * @desc 堆oom测试
 *
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}
