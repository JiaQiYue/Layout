package com.qiyue.jia.framelayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameTouch;
    //初始化变量,帧布局
    private FrameLayout frameAnimation = null;
    //自定义一个用于定时更新UI界面的handler类对象
    Handler handler = new Handler(){
        int i = 0;
        @Override
        public void handleMessage(Message msg) {
            //判断信息是否为本应用发出的
            if (msg.what == 0x123) {
                i++;
                move(i % 8);
            }
            super.handleMessage(msg);
        }
    };

    //定义走路时切换图片的方法
    private void move(int i) {

        Drawable a = getResources().getDrawable(R.drawable.s_1);
        Drawable b = getResources().getDrawable(R.drawable.s_2);
        Drawable c = getResources().getDrawable(R.drawable.s_3);
        Drawable d = getResources().getDrawable(R.drawable.s_4);
        Drawable e = getResources().getDrawable(R.drawable.s_5);
        Drawable f = getResources().getDrawable(R.drawable.s_6);
        Drawable g = getResources().getDrawable(R.drawable.s_7);
        Drawable h = getResources().getDrawable(R.drawable.s_8);

        //通过setForeground来设置前景图像
        switch (i) {

            case 0:
                frameAnimation.setForeground(a);
                break;
            case 1:
                frameAnimation.setForeground(b);
                break;
            case 2:
                frameAnimation.setForeground(c);
                break;
            case 3:
                frameAnimation.setForeground(d);
                break;
            case 4:
                frameAnimation.setForeground(e);
                break;
            case 5:
                frameAnimation.setForeground(f);
                break;
            case 6:
                frameAnimation.setForeground(g);
                break;
            case 7:
                frameAnimation.setForeground(h);
                break;
            case 8:
                frameAnimation.setForeground(a);
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 前景图像
         * android:foreground:*设置改帧布局容器的前景图像
         * android:foregroundGravity:设置前景图像显示的位置
         */

        //setContentView(R.layout.framelayout_foreground);

        /**
         * 跟随手指移动的图片
         */
//        setContentView(R.layout.framelayout_touch);
//
//        frameTouch = (FrameLayout) findViewById(R.id.myLayout);
//
//        final GirlView girlView = new GirlView(MainActivity.this);
//        girlView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                //设置图片的位置
//                girlView.bitmapX = motionEvent.getX() - 150;
//                girlView.bitmapY = motionEvent.getY() - 150;
//                //调用重绘方法
//                girlView.invalidate();
//
//                return true;
//            }
//        });
//
//        frame.addView(girlView);


        frameAnimation = (FrameLayout) findViewById(R.id.myFrame);

        //定义一个定时器对象,定时发送信息给handler
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                //发送一条空信息来通知系统改变前景图片
                handler.sendEmptyMessage(0x123);
            }
        },0,170);

    }
}
