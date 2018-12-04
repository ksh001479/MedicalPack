package com.example.viewpager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainMenu extends Activity{

    String tel = "tel:01082836745";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

//        ImageButton Timer = (ImageButton) findViewById(R.id.img_btn1);
        ImageButton call = (ImageButton) findViewById(R.id.img_btn2);
        ImageButton seasonFood = (ImageButton) findViewById(R.id.img_btn3);
        ImageButton date = (ImageButton) findViewById(R.id.img_btn4);
        ImageButton map = (ImageButton) findViewById(R.id.img_btn5);
        ImageButton option = (ImageButton) findViewById(R.id.img_btn6);

//        Timer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Timer.class);
//                startActivity(intent);
//            }
//        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "꾹 누르면 119로 연결됩니다. [사용 전 꼭 권한설정을 해주세요.]", Toast.LENGTH_SHORT).show();
            }
        });

        call.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(getApplicationContext(), "119로 연결되는 중.", Toast.LENGTH_SHORT).show();
                startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));

                return true;
            }
        });

        seasonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SeasonFood.class);
                startActivity(intent);
            }
        });

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), hosptial_Maps.class);
                startActivity(intent);
            }
        });

        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Option.class);
                startActivity(intent);
            }
        });
    }
}
