package com.example.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int MAX_PAGE = 15;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new adapter(getSupportFragmentManager()));
    }

    private class adapter extends FragmentPagerAdapter {
        public adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;

            switch (position) {
                case 0:
                    cur_fragment = new page_1();
                    break;
                case 1:
                    cur_fragment = new page_2();
                    break;
                case 2:
                    cur_fragment = new page_3();
                    break;
                case 3:
                    cur_fragment = new page_4();
                    break;
                case 4:
                    cur_fragment = new page_5();
                    break;
                case 5:
                    cur_fragment = new page_6();
                    break;
                case 6:
                    cur_fragment = new page_7();
                    break;
                case 7:
                    cur_fragment = new page_8();
                    break;
                case 8:
                    cur_fragment = new page_9();
                    break;
                case 9:
                    cur_fragment = new page_10();
                    break;
                case 10:
                    cur_fragment = new page_11();
                    break;
                case 11:
                    cur_fragment = new page_12();
                    break;
                case 12:
                    cur_fragment = new page_13();
                    break;
                case 13:
                    cur_fragment = new page_14();
                    break;
                case 14:
                    cur_fragment = new page_15();
                    break;
            }
            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
