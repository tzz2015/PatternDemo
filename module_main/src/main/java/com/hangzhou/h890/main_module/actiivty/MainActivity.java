package com.hangzhou.h890.main_module.actiivty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hangzhou.h890.common_library.base.BaseActivity;
import com.hangzhou.h890.common_library.base.BaseFragment;
import com.hangzhou.h890.common_library.utils.Constant;
import com.hangzhou.h890.common_library.utils.UIHelper;
import com.hangzhou.h890.main_module.R;
import com.hangzhou.h890.main_module.R2;

import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = Constant.MAIN_HOME)
public class MainActivity extends BaseActivity {

    private BaseFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
       /* findViewById(R.id.bt_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openAHome();
            }
        });
        findViewById(R.id.bt_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openBHome();
            }
        });*/

    }

    /**
     * 在library中 使用R2 并且不能使用switch语句
     *
     * @param view
     */
    @OnClick({R2.id.bt_button1, R2.id.bt_button2, R2.id.bt_button3})
    public void onViewClicked(View view) {
        int i = view.getId();
        if (i == R.id.bt_button1) {
            UIHelper.openAHome();
        } else if (i == R.id.bt_button2) {
            UIHelper.openBHome();
        } else if (i == R.id.bt_button3) {
            if (fragment == null) {
                fragment = UIHelper.getBFragment();
                addFragment(fragment, R.id.fl_content);
            }

        }

    }
}
