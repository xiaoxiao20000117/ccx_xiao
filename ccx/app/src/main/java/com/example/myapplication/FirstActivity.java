package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    private  EditText edt1;
    private  EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
         edt1=findViewById(R.id.et1);
         edt2=findViewById(R.id.et2);
        Button bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a=Double.parseDouble(edt1.getText().toString());
                Double b=Double.parseDouble(edt2.getText().toString());
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("n1",a);
                intent.putExtra("n2",b);
                startActivity(intent);
            }
        });

    }
}
