package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
 private Button but2;
 private EditText edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        but2=findViewById(R.id.bt2);
        edt3=findViewById(R.id.et3);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();
                Double data1=intent.getDoubleExtra("n1",0.0);
                Double data2=intent.getDoubleExtra("n2",0.0);
                String data=(data1+data2)+"";
                edt3.setText(data);
            }
        });
    }
}
