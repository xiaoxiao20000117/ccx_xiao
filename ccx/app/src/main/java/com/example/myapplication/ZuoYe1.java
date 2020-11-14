package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ZuoYe1 extends AppCompatActivity {
    private String[] data={"Apple","Banana","Orange","Pear","Watermelon","Cherry"};
    private List<close> closeList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zuo_ye1);
        initClose();
        Closeadapter adapter=new Closeadapter(ZuoYe1.this,R.layout.close_item,closeList);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                close fruit=closeList.get(position);
                Toast.makeText(ZuoYe1.this,fruit.getimageid(),Toast.LENGTH_SHORT).show();
                //Toast.makeText(ZuoYe1.this,fruit.getname(),Toast.LENGTH_LONG).show();
            }
        });
    }
    private void initClose()
    {
        close a=new close("Apple",R.drawable.apple_pic);
        closeList.add(a);
        close b=new close("Banana",R.drawable.banana_pic);
        closeList.add(b);
        close c=new close("Orange",R.drawable.orange_pic);
        closeList.add(c);
        close d=new close("Pear",R.drawable.pear_pic);
        closeList.add(d);
        close e=new close("Watermelon",R.drawable.watermelon_pic);
        closeList.add(e);
        close f=new close("Cherry",R.drawable.cherry_pic);
        closeList.add(f);
    }
}

