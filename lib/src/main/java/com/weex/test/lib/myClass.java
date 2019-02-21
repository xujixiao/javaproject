package com.weex.test.lib;

public class myClass {
    public static void main(String[] args) {
        System.out.print("xujixiao");
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i);
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("thread1--" + i);
                }
            }
        });
        thread.start();
        thread1.start();
    }
}
