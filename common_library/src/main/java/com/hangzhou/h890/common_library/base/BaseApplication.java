package com.hangzhou.h890.common_library.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.logging.Logger;

/**
 * 创建 by lyf on 2018/2/25.
 * 描述：
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    private void initARouter() {
        try {
            ARouter.openDebug();
            ARouter.openLog();
            ARouter.init(this);
        }catch (Exception e){
            com.orhanobut.logger.Logger.e(e.getMessage());
        }

    }
}
