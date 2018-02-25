package com.hangzhou.h890.common_library.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.orhanobut.logger.Logger;

/**
 * 创建 by lyf on 2018/2/25.
 * 描述：
 */

public abstract class BaseFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.e("类名：",getClass().getSimpleName());
    }
}
