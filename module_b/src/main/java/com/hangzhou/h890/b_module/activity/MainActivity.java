package com.hangzhou.h890.b_module.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hangzhou.h890.b_module.R;
import com.hangzhou.h890.common_library.base.BaseActivity;
import com.hangzhou.h890.common_library.utils.Constant;
import com.hangzhou.h890.common_library.utils.UIHelper;

@Route(path = Constant.B_HOME)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        findViewById(R.id.bt_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openMainHome();
            }
        });
        findViewById(R.id.bt_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIHelper.openAHome();
            }
        });
    }
}
