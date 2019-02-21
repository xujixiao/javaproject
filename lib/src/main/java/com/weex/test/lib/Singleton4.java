package com.weex.test.lib;

/**
 * Copyright (C), 2011-2019
 * FileName: com.weex.test.lib.Singleton4.java
 * Author: xujixiao
 * Email: xujixiao@wzdai.com
 * Date: 2019/2/21 15:24
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * xujixiao      15:24    1.0        Create
 */
public class Singleton4 {
    private static Singleton4 sSingleton4;

    private Singleton4() {

    }

    public static synchronized Singleton4 getInstance() {
        if (sSingleton4 == null) {
            sSingleton4 = new Singleton4();
        }
        return sSingleton4;
    }

}
