package com.kcode.github.androidlib.utils;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import java.util.UUID;

/**
 * 系统工具类
 * Created by 蔡凯 on 2015/8/10.
 */
public class SystemUtil {
    /**
     * 获取手机型号
     * @return
     */
    public static String getModle(){
        return Build.MODEL;
    }

    /**
     * 获取系统版本号
     * @return
     */
    public static String getSystemCode(){
        return Build.VERSION.RELEASE;
    }

    public static String getDeviceID(Context mContext){
        TelephonyManager tm = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);
        if(tm == null){
            return getUUID(mContext);
        }
        final String deviceId = tm.getDeviceId();
        Logger.i("caik", "获取到的设备号:" + deviceId);
        if(deviceId == null
                ||"null".equals(deviceId)
                || "".equals(deviceId)){
            return getUUID(mContext);
        }
        return deviceId;
    }

    public static String getUUID(Context mContext){
        StringBuilder sb = new StringBuilder();
        Logger.i("caik","进入获取uuid的方法");
        sb.append("进入获取uuid的方法").append("\n");
        String uuid;
        uuid = SPUtils.getStringSharePreferences(mContext,
                "uuid", "uuid");
        if(TextUtils.isEmpty(uuid)){
            Logger.i("caik","本地无uuid,开始生成uuid");
            sb.append("本地无uuid,开始生成uuid").append("\n");
            uuid = UUID.randomUUID().toString();
            sb.append("生成结束,uuid=").append(uuid).append("\n");
            Logger.i("caik", "uuid=" + uuid);
            SPUtils.setStringSharePreferences(mContext,
                    "uuid",uuid,"uuid");
        }
        Logger.i("caik", "返回" + uuid);
        return uuid;
    }

    public static String getMacAddress(Context mContext){
        String macAddress = null;
        WifiManager wifiMgr = (WifiManager)mContext.getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = (null == wifiMgr ? null : wifiMgr.getConnectionInfo());
        if (null != info) {
            macAddress = info.getMacAddress();
        }

        return macAddress;
    }
}
