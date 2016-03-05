package com.example.abo.uitest2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by abo on 16/3/4.
 */
public class AtyUsingSpinner extends Activity{
    private Spinner spinner;
    private ArrayAdapter<String> arrayAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_spinner);
        spinner = (Spinner)findViewById(R.id.spinner);
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        arrayAdapter.add("zhangsan");
        arrayAdapter.add("lisi");
        arrayAdapter.add("wangwu");
        spinner.setAdapter(arrayAdapter);
    }
}
