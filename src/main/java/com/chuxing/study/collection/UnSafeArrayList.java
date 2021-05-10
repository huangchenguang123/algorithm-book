package com.chuxing.study.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @date 2021/5/8
 * @author chenguang
 * @desc ArrayList并发问题
 */
public class UnSafeArrayList {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }

}
