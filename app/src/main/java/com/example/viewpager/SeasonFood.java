package com.example.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SeasonFood extends AppCompatActivity implements View.OnClickListener {

    private final int FRAGMENT1 = 1;
    private final int FRAGMENT2 = 2;
    private final int FRAGMENT3 = 3;
    private final int FRAGMENT4 = 4;

    private ImageButton spring_btn, summer_btn, autumn_btn, winter_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_food);

        spring_btn = (ImageButton) findViewById(R.id.spring_btn);
        summer_btn = (ImageButton) findViewById(R.id.summer_btn);
        autumn_btn = (ImageButton) findViewById(R.id.autumn_btn);
        winter_btn = (ImageButton) findViewById(R.id.winter_btn);

        spring_btn.setOnClickListener(this);
        summer_btn.setOnClickListener(this);
        autumn_btn.setOnClickListener(this);
        winter_btn.setOnClickListener(this);

        callFragment(FRAGMENT1);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.spring_btn:
                callFragment(FRAGMENT1);
                break;

            case R.id.summer_btn:
                callFragment(FRAGMENT2);
                break;

            case R.id.autumn_btn:
                callFragment(FRAGMENT3);
                break;

            case R.id.winter_btn:
                callFragment(FRAGMENT4);
                break;
        }

    }

    private void callFragment(int fragment_no) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment_no) {
            case 1:
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;


            case 2:
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;

            case 3:
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.fragment_container, fragment3);
                transaction.commit();
                break;

            case 4:
                Fragment4 fragment4 = new Fragment4();
                transaction.replace(R.id.fragment_container, fragment4);
                transaction.commit();
                break;
        }
    }
}
