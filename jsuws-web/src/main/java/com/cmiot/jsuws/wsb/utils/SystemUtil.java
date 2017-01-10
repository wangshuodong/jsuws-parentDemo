package com.cmiot.jsuws.wsb.utils;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2017/1/3.
 */
public class SystemUtil {
    @Value(value = "jiangsu.web.addr")
    public static String jsuWsAddr;

    public static String getJsuWsAddr() {
        return jsuWsAddr;
    }
}
