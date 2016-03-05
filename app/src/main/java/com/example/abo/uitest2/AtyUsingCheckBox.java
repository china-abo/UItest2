package com.example.abo.uitest2;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by abo on 16/3/4.
 */
    public class AtyUsingCheckBox extends Activity{
    private CheckBox cbCD, cbSH, cbSZ, cbJN;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_checkbox);
        cbCD = (CheckBox)findViewById(R.id.chengdu);
        cbJN = (CheckBox)findViewById(R.id.jinan);
        cbSH = (CheckBox)findViewById(R.id.shanghao);
        cbSZ = (CheckBox)findViewById(R.id.shenzhen);
        findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str ="毕业后可能去：\n";
                if(cbSH.isChecked()){
                    str+="上海\n";
                }
                if(cbCD.isChecked()){
                    str+="成都\n";
                }
                if(cbJN.isChecked()){
                    str+="济南\n";
                }
                if(cbSZ.isChecked()){
                    str+="深圳\n";
                }
                new AlertDialog.Builder(AtyUsingCheckBox.this).setTitle("结果").setMessage(str)
                        .setPositiveButton("关闭",null).show();

            }
        });
    }

}
