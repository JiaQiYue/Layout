package com.qiyue.jia.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏列
        //setContentView(R.layout.tablelayout_1);

        //拉伸列
        //setContentView(R.layout.tablelayout_2);

        //收缩列
        setContentView(R.layout.tablelayout_3);
    }
}
