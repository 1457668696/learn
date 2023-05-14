package com.mwxz.common;

import lombok.Data;

@Data
public class R<T> {

    private Integer code; //编码：200成功，-200和其它数字为失败

    private String msg; //错误信息

    private T data; //数据


//  普通数据
 public static <T> R<T> success(String msg) {
    R<T> r = new R<T>();
    r.code = 200;
    r.msg = msg;
    return r;
}
    public static <T> R<T> success(String msg,T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 200;
        r.msg = msg;
        return r;
    }
//   错误消息
    public static <T> R<T> error(String msg) {
        R<T> r = new R<T>();
        r.msg = msg;
        r.code = -200;
        return r;
    }

    public static <T> R<T> error(String msg,T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = -200;
        r.msg = msg;
        return r;
    }


//    Map看情况使
//   private Map map = new HashMap(); //动态数据
//    public R<T> add(String key, Object value) {
//        this.map.put(key, value);
//        return this;
//    }

}
