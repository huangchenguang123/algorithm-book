package com.chuxing.study.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author chenguang
 * @date 2021/5/8
 * @desc ArrayList初始化bug
 *
 * Arrays.asList.toArray在jdk1.8之前返回的是E[]，赋值给ArrayList时会导致新增元素出现异常，
 * 因为String[]和Object[]是不同的，但是编译器没有给出警告
 */
public class ArrayListInitBugs {

    public static void main(String[] args) {
        new ArrayList(Arrays.asList("foo", "bar"));
    }

}
