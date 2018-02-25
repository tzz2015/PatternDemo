package com.hangzhou.h890.b_module.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hangzhou.h890.b_module.R;
import com.hangzhou.h890.common_library.base.BaseActivity;
import com.hangzhou.h890.common_library.base.BaseFragment;
import com.hangzhou.h890.common_library.utils.Constant;

/**
 * 创建 by lyf on 2018/2/25.
 * 描述：
 */
@Route(path = Constant.TEST_FRAGMENT)
public class TestFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }
}
