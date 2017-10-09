package com.qiyue.jia.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * LinearLayout中的权重属性
         */
        //setContentView(R.layout.linearlayout_weight1);

        //setContentView(R.layout.linearlayout_weight2);

        /**
         * 如果文件的布局是match_parent(fill_parent),那么使用权重是要注意计算
         * 1.个个都是match_parent(fill_parent),但是屏幕只有一个啦,那么1 - 3(这里是权重控件的个数) = - 2 fill_parent
         * 2.依次比例是1/6,2/6,3/6
         * 3.先到先得,先分给one,计算: 1 - 2 * (1/6) = 2/3 fill_parent 接着到two,计算: 1 - 2 * (2/6) = 1/3 fill_parent 最后到three,计算 1 - 2 * (3/6) = 0 fill_parent
         * 4.所以最后的结果是:one占了两份,two占了一份,three什么都木有
         */
        //setContentView(R.layout.linearlayout_weight3);


        /**
         * LinearLayout中的分割线
         *
         * 方法一:直接在布局中添加一个view,这个view的作用仅仅是显示出一条线
         *
         * 方法二:使用LinearLayout的一个divider属性,直接为LinearLayout设置分割线 这里就需要你自己准备一张线的图片了
         * 1)android:divider设置作为分割线的图片
         * 2)android:showDividers设置分割线的位置,none(无),begining(开始),end(结束),middle(每两个组件间)
         * 3)dividerPadding设置分割线的Padding
         */
        //setContentView(R.layout.linearlayout_divider);

        /**
         * LinearLayout简单的demo
         */
        setContentView(R.layout.linearlayout_divider);
    }
}
