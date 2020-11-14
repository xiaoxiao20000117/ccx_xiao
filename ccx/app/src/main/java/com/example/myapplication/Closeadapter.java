package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Closeadapter extends ArrayAdapter<close> {
    private int resourceId;
    public Closeadapter(Context context, int textviewResourceId, List<close>objects){
        super(context,textviewResourceId,objects);
        resourceId=textviewResourceId;
}
@Override
public View getView(int position , View convertView, ViewGroup parent){
        close c1=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView closeImage=(ImageView)view.findViewById(R.id.close_image);
        TextView closename=(TextView)view.findViewById(R.id.close_name);
        closeImage.setImageResource(c1.getimageid());
        closename.setText(c1.getname());
        return view;
    }
}
