package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View v){
        //判断姓名，密码是否为空
        EditText mailEdit= findViewById(R.id.mail);
        EditText pwdEdit = findViewById(R.id.pwd);

        String mail = mailEdit.getText().toString();
        String pwd = pwdEdit.getText().toString();
        ProgressBar progressBar = findViewById(R.id.pro_bar);



        //如果为空，则无焦点提示
        if(mail.equals("")){
            //context resId duration
            Toast.makeText(this,"メールアドレスを入力してください",Toast.LENGTH_LONG).show();
            return;

        }

        if(pwd.equals("")){
            Toast.makeText(this,"パスワードを入力してください",Toast.LENGTH_LONG).show();
            return;
        }

        //都部位空，出现进度条
        progressBar.setVisibility(View.VISIBLE);
        new Thread(){
            public void run(){
                for(int i =1;i<=100;i++){
                    progressBar.setProgress(i);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();



    }
}