package com.weex.test.lib;

/**
 * Copyright (C), 2011-2019
 * FileName: com.weex.test.lib.Singleton3.java
 * Author: xujixiao
 * Email: xujixiao@wzdai.com
 * Date: 2019/2/21 14:25
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * xujixiao      14:25    1.0        Create
 */
public class Singleton3 {
    private static Singleton3 mSingleton3 = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return mSingleton3;
    }
}
