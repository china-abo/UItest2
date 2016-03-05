package com.example.abo.uitest2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by abo on 16/3/5.
 */
public class AtyUsingToast extends Activity {
    private Button showToastShort;
    private Button getShowToastLang;
    private Button imageToast;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_toast);
        showToastShort = (Button) findViewById(R.id.btn_toast);
        showToastShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Toast ashortToast = Toast.makeText(AtyUsingToast.this, "一个较短短Toast", Toast.LENGTH_SHORT);
                //改变toast位置
                ashortToast.setGravity(Gravity.CENTER,10,20);  //第一个参数调用Gravity 显示在屏幕中位置，2，3变量为X和Y轴偏移量
                ashortToast.show();
            }
        });
        getShowToastLang = (Button) findViewById(R.id.btn_toast2);
        getShowToastLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AtyUsingToast.this, "一个较长Toast显示", Toast.LENGTH_LONG).show();
            }
        });
        imageToast = (Button)findViewById(R.id.btn_toast3);
        imageToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast imgToat = Toast.makeText(AtyUsingToast.this,"带图片",Toast.LENGTH_SHORT);
                ImageView imageView = new ImageView(AtyUsingToast.this);
                imageView.setImageResource(R.drawable.ic_launcher);
                imgToat.setView(imageView);
                imgToat.show();

            }
        });
    }
}
