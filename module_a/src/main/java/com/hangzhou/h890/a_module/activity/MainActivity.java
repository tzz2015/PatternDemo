package com.hangzhou.h890.a_module.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hangzhou.h890.a_module.R;
import com.hangzhou.h890.a_module.bean.User;
import com.hangzhou.h890.a_module.databinding.ActivityMainABinding;
import com.hangzhou.h890.common_library.base.BaseActivity;
import com.hangzhou.h890.common_library.utils.Constant;
import com.hangzhou.h890.common_library.utils.UIHelper;
import com.orhanobut.logger.Logger;

@Route(path = Constant.A_HOME)
public class MainActivity extends BaseActivity {

    private ActivityMainABinding viewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //library支持DataBinding
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_a);
        viewDataBinding.btButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openMainHome();
            }
        });
        viewDataBinding.btButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openBHome();
            }
        });

        viewDataBinding.setUser(new User("我是哈哈哈哈"));


    }
}
