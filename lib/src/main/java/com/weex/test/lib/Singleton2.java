package com.weex.test.lib;

/**
 * Copyright (C), 2011-2019
 * FileName: com.weex.test.lib.Singleton2.java
 * Author: xujixiao
 * Email: xujixiao@wzdai.com
 * Date: 2019/2/21 14:22
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * xujixiao      14:22    1.0        Create
 */
public class Singleton2 {
    private volatile static Singleton2 sSingleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (sSingleton2 == null) {
            synchronized (Singleton2.class) {
                if (sSingleton2 == null) {
                    sSingleton2 = new Singleton2();
                }
            }
        }
        return sSingleton2;
    }
}
