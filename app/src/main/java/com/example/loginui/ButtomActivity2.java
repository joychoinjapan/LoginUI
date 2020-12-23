package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtomActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom2);
        Button btn1 = findViewById(R.id.btn1);


        //点击事件：被点击时被触发的事件
        btn1.setOnClickListener(new MyClickListener());//为按钮注册点击事件监视器，有名内部类

        Button btn2 = findViewById(R.id.btn2);
        //匿名内部类，适用于有唯一操作的按钮
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在控制台输出
                Log.e("TAG","刚刚点击的按钮时注册了匿名内部类监听器对象的按钮");
            }
        });

    }

    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Log.e("TAG","刚刚点击的按钮时注册了内部类监听器对象的按钮");
        }
    }
}