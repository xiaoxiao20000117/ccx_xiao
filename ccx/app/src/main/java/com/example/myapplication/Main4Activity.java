package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
     //private String[] data={"apple","banana","orange"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button1=(Button)findViewById(R.id.bt1);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Main4Activity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView=(ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,ZuoYe1.class);
                startActivity(intent);
            }
        });

    }
}

