package com.example.viewpager;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by songmho on 2015-01-02.
 */
public class page_3 extends android.support.v4.app.Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout linearLayout=(LinearLayout)inflater.inflate(R.layout.page,container,false);

        LinearLayout background=(LinearLayout)linearLayout.findViewById(R.id.background);
        Button page_num = (Button) linearLayout.findViewById(R.id.page_num);
        page_num.setText(String.valueOf(3+"Day"));
//        TextView page_num=(TextView)linearLayout.findViewById(R.id.page_num);
//        page_num.setText("3");
//        background.setBackground(new ColorDrawable(0xff008c9e));
        return linearLayout;
    }
}
