package com.example.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Video_Day_1 extends AppCompatActivity {

    Intent intent;
    int t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__day_1);
        intent = getIntent();
        t = intent.getIntExtra("int-keyword",0);

        String [] YouUrl = {"",""};
//        TextView textView = (TextView)findViewById(R.id.text);
//        textView.setText("전달된 값은 : "+t);
//        getText(getInt);
    }
}
