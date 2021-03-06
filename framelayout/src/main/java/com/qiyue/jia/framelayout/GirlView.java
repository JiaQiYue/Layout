package com.qiyue.jia.framelayout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by jia on 2017/10/9.
 */

public class GirlView extends View {

    //定义变量,一次是图片的X,Y坐标
    public float bitmapX;
    public float bitmapY;

    public GirlView(Context context) {
        super(context);
        //设置起始坐标
        bitmapX = 0;
        bitmapY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建并实例化Paint对象
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.s_1);
        //绘制图像
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        //判断图片是否回收,木有回收的话强制收回图片
        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }

    }
}
