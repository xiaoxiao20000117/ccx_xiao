package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BroadcastActivity extends AppCompatActivity {
    private MyBroacast myBroacast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        myBroacast=new MyBroacast();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction("com.example.myapplication.MyBroacast");
        registerReceiver(myBroacast,intentFilter);
        Button sentout=(Button)findViewById(R.id.sent_bt);
        sentout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.example.myapplication.MyBroacast");
                sendBroadcast(intent);
            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(myBroacast);
    }
}

 class MyBroacast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "发送", Toast.LENGTH_LONG).show();
    }
}
