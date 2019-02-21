package com.weex.test.lib;

/**
 * Copyright (C), 2011-2019
 * FileName: com.weex.test.lib.SingleTon.java
 * Author: xujixiao
 * Email: xujixiao@wzdai.com
 * Date: 2019/2/21 14:19
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * xujixiao      14:19    1.0        Create
 */
/*基于classloader的方式*/
public class SingleTon {
//    DCL在jvm1.5之后是不是已经不存在new 一个对象的指令重排序问题了？所以1.6以及以后的Java sdk 不需要volatile 关键字的保护了
//    最近在看jvm，在1.7和1.8都测试过，不使用用volatile保护instance是没有问题的
    public final static class SingleTonHolder {
        static SingleTon sSingleTon = new SingleTon();
    }

    public static SingleTon getInstance() {
        return SingleTonHolder.sSingleTon;
    }
}
