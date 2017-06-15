package com.ispring.gameplane;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if(viewId == R.id.btnGame){
            startGame();
        }
    }

    public void startGame(){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
    /*
    *    >> 项目大概分析 <<
    * Sprite: 敌机绘制的基类，这里取名精灵类,主要是一些属性
    *
    * AutoSprite: 继承 Sprite. 敌机自动直线下落的实现。
    *     方法： 通过改变x, y位移。
    *     --- > 增加曲线 和 变速
    *
    * Award: 继承 AutoSprite
    *
    * */
}