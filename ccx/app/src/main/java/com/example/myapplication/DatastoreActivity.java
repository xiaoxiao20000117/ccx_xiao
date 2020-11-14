package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.telecom.ConnectionRequest;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.litepal.tablemanager.Connector;
import org.w3c.dom.Text;

public class DatastoreActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastore);
        button1=(Button)findViewById(R.id.sava_bt);
        button2=(Button)findViewById(R.id.read_bt);
        button3=(Button)findViewById(R.id.createdb_bt);
        textView=(TextView)findViewById(R.id.tx);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor sp=getSharedPreferences("mydata",MODE_PRIVATE).edit();
                sp.putString("name","张三");
                sp.putInt("age",18);
                sp.apply();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp=getSharedPreferences("mydata",MODE_PRIVATE);
                int age=sp.getInt("age",0);
                String name=sp.getString("name","");
                textView.setText(name+age);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();
            }
        });
    }
}
