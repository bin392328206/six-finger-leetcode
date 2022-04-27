package com.six.finger.leetcode.two;


import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.locks.LockSupport;

/**
 * Java交替打印奇偶数
 */
public class PrintAB {

    static Thread a;
    static  Thread b;


    public static void main(String[] args) {

        final Object obj = new Object();


//      a=  new Thread(){
//            public void run(){
//                for (int i=1;i<=99;i+=2){
//                    System.out.println(i);
//                    LockSupport.unpark(b);
//                    LockSupport.park(a);
//                }
//
//            }
//        };
//
//
//
//           b=  new Thread(){
//            public void run(){
//                for (int i=2;i<=99;i+=2){
//                    LockSupport.park(b);
//                    System.out.println(i);
//                    LockSupport.unpark(a);
//                }
//
//            }
//        };
//
//           a.start();
//           b.start();
//
//
//    }

        a = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 1; i <= 99; i += 2) {
                        obj.notify();
                        System.out.println(i);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        });


        b = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 2; i <= 100; i += 2) {
                        try {
                            obj.notify();
                            System.out.println(i);
                            obj.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        });

        a.start();
        b.start();


    }
}
