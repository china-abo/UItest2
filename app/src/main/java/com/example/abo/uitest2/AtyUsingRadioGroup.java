package com.example.abo.uitest2;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

/**
 * Created by abo on 16/3/4.
 */
public class AtyUsingRadioGroup extends Activity {
    private RadioButton radioRight;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_radiogroup);
        radioRight = (RadioButton)findViewById(R.id.radioRight);
        findViewById(R.id.radio_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioRight.isChecked()){
                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断")
                            .setMessage("回答正确").setPositiveButton("关闭",null).show();
                }else{
                    new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("判断")
                            .setMessage("回答错误").setPositiveButton("关闭",null).show();
                }
            }
        });

    }
}
