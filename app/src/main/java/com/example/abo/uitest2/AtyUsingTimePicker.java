package com.example.abo.uitest2;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;


public class AtyUsingTimePicker extends Activity {

    private Button button;
    private TextView textView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_time);
        button = (Button)findViewById(R.id.btn_time);
        textView = (TextView)findViewById(R.id.text_time);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(AtyUsingTimePicker.this,new TimePickerDialog.OnTimeSetListener(){
                    public void onTimeSet(TimePicker view, int hourOfDay,int minute){
                        textView.setText(String.format("%s:%s",timeFormat(hourOfDay),timeFormat(minute)));
                    }
                },21,18,true).show();
            }
        });
    }
    public String timeFormat(int value){
        return value>=10?""+value:"0"+value;
    }
}
