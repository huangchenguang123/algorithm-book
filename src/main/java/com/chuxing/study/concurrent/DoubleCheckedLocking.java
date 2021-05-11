package com.chuxing.study.concurrent;

/**
 * @date 2021/5/12
 * @author chenguang
 * @desc 双重检查锁
 */
//public class DoubleCheckedLocking {
//
//    private static Object object;
//
//    public static void main(String[] args) {
//        Object object = getObject();
//        System.out.println(object);
//    }
//
//    private static Object getObject() {
//        if (object == null) {
//            synchronized (DoubleCheckedLocking.class) {
//                object = new Object();
//            }
//        }
//        return object;
//    }
//
//}
//public class DoubleCheckedLocking {
//
//    private volatile static Object object;
//
//    public static void main(String[] args) {
//        Object object = getObject();
//        System.out.println(object);
//    }
//
//    private static Object getObject() {
//        if (object == null) {
//            synchronized (DoubleCheckedLocking.class) {
//                object = new Object();
//            }
//        }
//        return object;
//    }
//
//}
public class DoubleCheckedLocking {

    public static class ObjectHolder {

        public static Object object = new Object();

    }

    public static void main(String[] args) {
        Object object = getObject();
        System.out.println(object);
    }

    private static Object getObject() {
        return ObjectHolder.object;
    }

}
