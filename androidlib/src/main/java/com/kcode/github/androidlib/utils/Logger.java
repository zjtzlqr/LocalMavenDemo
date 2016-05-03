package com.kcode.github.androidlib.utils;

import android.util.Log;

/**
 * Created by ck on 2015/7/20.
 */
public class Logger {

    private static boolean DEBUG = false;

    public static void openLog() {
        DEBUG = true;
    }

    public static void closeLog() {
        DEBUG = false;
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg);
        }

    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.e(tag, msg);
        }
    }
}
