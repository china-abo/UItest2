package com.example.abo.uitest2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.app.DatePickerDialog;

/**
 * Created by abo on 16/3/4.
 */
public class AtyUsingdDatePicker extends Activity {
    private TextView textView;
    private Button button;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_datepicker);
        textView = (TextView)findViewById(R.id.text_date);

        findViewById(R.id.btn_datepicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(AtyUsingdDatePicker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        textView.setText(String.format("%d/%d/%d",year, monthOfYear, dayOfMonth));
                    }
                },2016,3,4).show();
            }
        });

    }
}
