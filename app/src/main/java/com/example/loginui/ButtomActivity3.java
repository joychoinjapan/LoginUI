package com.example.loginui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ButtomActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom3);
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);//传递实现View.OnClickListener接口的本类

    }

    public void myClick(View v){
        // 不需要设置setOnClickListener
        //System.out.println(v.getId());
        //System.out.println(R.id.btn4);
        switch (v.getId()){
            case R.id.btn4:
                Log.e("TAG","btn4================");
                break;
            case R.id.btn5:
                Log.e("TAG","btn5================");
                break;
        }

        Log.e("TAG","用xml绑定实现了OnClickListener");
    }

    @Override
    public void onClick(View v) {
        Log.e("TAG","用本类实现了OnClickListener");
    }


}