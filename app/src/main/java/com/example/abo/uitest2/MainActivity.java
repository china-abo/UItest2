package com.example.abo.uitest2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private ArrayAdapter<ListCellData> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        adapter.add(new ListCellData(this, "RadioGroup", new Intent(this, AtyUsingRadioGroup.class)));
        adapter.add(new ListCellData(this,"CheckBox",new Intent(this,AtyUsingCheckBox.class)));
        adapter.add(new ListCellData(this,"DatePicker", new Intent(this,AtyUsingdDatePicker.class)));
        adapter.add(new ListCellData(this,"TimePicker",new Intent(this,AtyUsingTimePicker.class)));
        adapter.add(new ListCellData(this,"Spinner",new Intent(this,AtyUsingSpinner.class)));
        adapter.add(new ListCellData(this,"Notification",new Intent(this,AtyNotification.class)));
        adapter.add(new ListCellData(this,"Toast",new Intent(this,AtyUsingToast.class)));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        ListCellData data = adapter.getItem(position);
        super.onListItemClick(l, v, position, id);
        data.startActivity();
    }
}
