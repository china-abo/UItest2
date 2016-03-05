package com.example.abo.uitest2;

import android.content.Context;
import android.content.Intent;

/**
 * Created by abo on 16/3/4.
 */
public class ListCellData {

    public ListCellData(Context context,String controlName, Intent relatedIntent){
        this.controlName =  controlName;
        this.context = context;
        this.relatedIntent = relatedIntent;
    }
    private  String controlName = "";

    public  String getControlName(){
        return  controlName;
    }

    private Context context = null;

    public  Context getContext(){
        return context;
    }

    private Intent relatedIntent = null;
    public Intent getRelatedIntent(){
        return  relatedIntent;
    }

    public void startActivity(){
        getContext().startActivity(getRelatedIntent());
    }

    public String toString(){
        return getControlName();
    }
}
