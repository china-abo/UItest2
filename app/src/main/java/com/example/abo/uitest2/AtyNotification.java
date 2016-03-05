package com.example.abo.uitest2;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

/**
 * Created by abo on 16/3/5.
 */
public class AtyNotification extends Activity {
    private Button button;
    private static final int NOTIFICATION_ID = 1200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayt_using_notification);
        button= (Button)findViewById(R.id.btn_show_notification);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //构建一个通知，指定一个图标

                NotificationCompat.Builder builder = new NotificationCompat.Builder(AtyNotification.this);
                builder.setSmallIcon(R.drawable.ic_launcher);
                builder.setContentText("你中了500万");
                builder.setContentTitle("哇，你有一条新信息");
                builder.setContentIntent(PendingIntent.getActivity(AtyNotification.this,1,getIntent(),0));
                Notification notification = builder.build();
                NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(NOTIFICATION_ID,notification);

            }
        });
    }
}
