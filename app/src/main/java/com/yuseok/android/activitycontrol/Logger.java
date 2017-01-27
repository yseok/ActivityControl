package com.yuseok.android.activitycontrol;

import android.util.Log;

/** 로깅 객체
 *
 * @author yuseok
 * @version 1.0
 * @since 2017
 */
public class Logger {
    // Debug Mode : 정상 동작 안될 경우 강제로 세팅한다.
    public final static boolean DEBUG_MODE = BuildConfig.DEBUG;

    /** 로그내용을 콘솔에 출력
     *
     * @param string
     * @param className
     */
    public static void print(String string, String className) {
        if(DEBUG_MODE) {
            Log.d(className, string);
        }
    }
}
