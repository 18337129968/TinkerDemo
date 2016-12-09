package com.iss.innoz.tinkerdemo.utils;

import com.squareup.otto.Bus;

/**
 * SampleAndroidProject
 * com.app.sampleandroidproject.utils
 *
 * @Author: xie
 * @Time: 2016/9/2 14:15
 * @Description:
 */

public class BusProvider {
    private static Bus _bus = new Bus();

    private BusProvider() {
    }

    public static <T> void post (T t) {
        _bus.post(t);
    }

    public static void register (Object obj) {
        _bus.register(obj);
    }

    public static void unregister (Object obj) {
        _bus.unregister(obj);
    }
}
