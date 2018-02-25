package com.hangzhou.h890.common_library.utils;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hangzhou.h890.common_library.base.BaseFragment;

/**
 * 创建 by lyf on 2018/2/25.
 * 描述： activity跳转
 */

public class UIHelper {
    /**
     * 打开主模块首页
     */
    public static void openMainHome(){
        ARouter.getInstance().build(Constant.MAIN_HOME).navigation();
    }
    /**
     * 打开A模块首页
     */
    public static void openAHome(){
        ARouter.getInstance().build(Constant.A_HOME).navigation();
    }
    /**
     * 打开B模块首页
     */
    public static void openBHome(){
        ARouter.getInstance().build(Constant.B_HOME).navigation();
    }
    /**
     * B模块fragment
     */
    public static BaseFragment getBFragment(){
        return (BaseFragment) ARouter.getInstance().build(Constant.TEST_FRAGMENT).navigation();
    }
}
