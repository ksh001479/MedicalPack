package com.example.viewpager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageButton imgBtn1 = (ImageButton) findViewById(R.id.img_btn1);
        ImageButton imgBtn2 = (ImageButton) findViewById(R.id.img_btn2);
        ImageButton imgBtn3 = (ImageButton) findViewById(R.id.img_btn3);
        ImageButton date = (ImageButton) findViewById(R.id.img_btn4);
        ImageButton map = (ImageButton) findViewById(R.id.img_btn5);
        ImageButton option = (ImageButton) findViewById(R.id.img_btn6);

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
