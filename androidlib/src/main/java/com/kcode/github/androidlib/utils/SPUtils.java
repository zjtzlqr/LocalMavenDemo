package com.kcode.github.androidlib.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * SharedPreferences存储工具类
 * Created by 蔡凯 on 2015/7/20.
 */
public class SPUtils {

    private final static int DEFAULT_INT_VALUE = 0;
    private final static long DEFAULT_LONG_VALUE = 0;
    private final static double DEFAULT_DOUBLE_VALUE = 0.00;
    private final static float DEFAULT_FLOAT_VALUE = 0;
    private final static String DEFAULT_STRING_VALUE = "";
    private final static boolean DEFAULT_BOOLEAN_VALUE = false;

    public static void clear(Context mConext, String shareFilename){
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear().commit();
    }

    /**
     * 存储字符串
     *
     * @param mConext
     * @param key
     * @param value
     * @param shareFilename
     */
    public static void setStringSharePreferences(Context mConext, String key, String value, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value).apply();
    }

    /**
     * 存储字符串
     *
     * @param mConext
     * @param key
     * @param value
     */
    public static void setStringSharePreferences(Context mConext, String key, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mConext);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value).apply();
    }

    /**
     * 获取通过SharedPreferences存储的字符串
     *
     * @param mConext
     * @param key
     * @param shareFilename
     * @return
     */
    public static String getStringSharePreferences(Context mConext, String key, String shareFilename) {
        return getStringSharePreferences(mConext, key, DEFAULT_STRING_VALUE, shareFilename);
    }

    /**
     * 获取通过SharedPreferences存储的字符串
     *
     * @param mConext
     * @param key
     * @return
     */
    public static String getStringSharePreferences(Context mConext, String key) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mConext);
        return sp.getString(key,DEFAULT_STRING_VALUE);
    }

    /**
     * 获取通过SharedPreferences存储的字符串
     *
     * @param mConext
     * @param key
     * @param defalutvalue
     * @param shareFilename
     * @return
     */
    public static String getStringSharePreferences(Context mConext, String key, String defalutvalue, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        return sp.getString(key, defalutvalue);
    }

    /**
     * 存储int类型
     *
     * @param mConext
     * @param key
     * @param value
     * @param shareFilename
     */
    public static void setIntSharePreferences(Context mConext, String key, int value, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(key, value).apply();
    }

    /**
     * 获取通过SharedPreferences存储的int
     *
     * @param mConext
     * @param key
     * @param shareFilename
     * @return
     */
    public static int getIntSharePreferences(Context mConext, String key, String shareFilename) {
        return getIntSharePreferences(mConext, key, DEFAULT_INT_VALUE, shareFilename);
    }

    /**
     * 获取通过SharedPreferences存储的int
     *
     * @param mConext
     * @param key
     * @param defalutvalue
     * @param shareFilename
     * @return
     */
    public static int getIntSharePreferences(Context mConext, String key, int defalutvalue, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        return sp.getInt(key, defalutvalue);
    }

    /**
     * 存储long
     *
     * @param mConext
     * @param key
     * @param value
     * @param shareFilename
     */
    public static void setLongSharePreferences(Context mConext, String key, long value, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putLong(key, value).apply();
    }

    /**
     * 获取通过SharedPreferences存储的long类型数据
     *
     * @param mConext
     * @param key
     * @param shareFilename
     * @return
     */
    public static long getLongSharePreferences(Context mConext, String key, String shareFilename) {
        return getLongSharePreferences(mConext, key, DEFAULT_LONG_VALUE, shareFilename);
    }

    /**
     * 获取通过SharedPreferences存储的long类型数据
     *
     * @param mConext
     * @param key
     * @param defalutvalue
     * @param shareFilename
     * @return
     */
    public static long getLongSharePreferences(Context mConext, String key, long defalutvalue, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        return sp.getLong(key, defalutvalue);
    }

    /**
     * 存储boolean
     *
     * @param mConext
     * @param key
     * @param value
     * @param shareFilename
     */
    public static void setBooleanSharePreferences(Context mConext, String key, boolean value, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(key, value).apply();
    }

    /**
     * 获取通过SharedPreferences存储的boolean类型数据
     *
     * @param mConext
     * @param key
     * @param shareFilename
     * @return
     */
    public static boolean getBooleanSharePreferences(Context mConext, String key, String shareFilename) {
        return getBooleanSharePreferences(mConext, key, DEFAULT_BOOLEAN_VALUE, shareFilename);
    }

    /**
     * 获取通过SharedPreferences存储的boolean类型数据
     *
     * @param mConext
     * @param key
     * @param defalutvalue
     * @param shareFilename
     * @return
     */
    public static boolean getBooleanSharePreferences(Context mConext, String key, boolean defalutvalue, String shareFilename) {
        SharedPreferences sp = mConext.getSharedPreferences(shareFilename, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defalutvalue);
    }
}
