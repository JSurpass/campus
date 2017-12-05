package com.campus.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 公共工具类
 * @author JYC
 * @描述：公共的工具类
 */

public class CommonUtil {
//**********************************************为空判断开始************************************************

    /**
     * Object判断是否为空
     * @param Value
     * @return
     */
    public static boolean isEmpty(Object Value) {
        return (Value == null || Value.equals(""));
    }
    /**
     * String类型判断是否为空
     * @param Value
     * @return
     */
    public static boolean isEmpty(String Value) {
        return (Value == null || Value.trim().equals(""));
    }
    /**
     * StringBuffer类型判断是否为空
     * @param Value
     * @return
     */
    public static boolean isEmpty(StringBuffer Value) {
        return (Value == null || (String.valueOf(Value).trim()).equals(""));
    }
    /**
     * Double类型判断是否为空
     * @param value
     * @return
     */
    public static boolean isEmpty(Double value) {
        return (value == null || value.doubleValue() == 0.0);
    }
    /**
     * Long类型判断是否为空
     * @param obj
     * @return
     */
    public static boolean isEmpty(Long obj) {
        return (obj == null || obj.longValue() == 0);
    }


    /**
     * List集合判断是否为空
     * @param list
     * @return
     */
    public static boolean isEmpty(List list) {
        return (list == null || list.size() == 0);
    }
    /**
     * Set集合判断是否为空
     * @param set
     * @return
     */
    public static boolean isEmpty(Set set) {
        return (set == null || set.size() == 0);
    }
    /**
     * Map集合判断是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map map) {
        return (map == null || map.size() == 0);
    }
    /**
     * Object[]数组判断是否为空
     * @param Value
     * @return
     */
    public static boolean isEmpty(Object[] Value) {
        return (Value == null || Value.length == 0);
    }

//**********************************************为空判断开始************************************************



}