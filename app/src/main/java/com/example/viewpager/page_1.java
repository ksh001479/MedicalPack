package com.example.viewpager;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by songmho on 2015-01-02.
 */
public class page_1 extends android.support.v4.app.Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.page, container, false);

        LinearLayout background = (LinearLayout) linearLayout.findViewById(R.id.background);
//        ImageButton page_img=(ImageButton)linearLayout.findViewById(R.id.page_img);
        Button page_num = (Button) linearLayout.findViewById(R.id.page_num);
        page_num.setText(String.valueOf(1+"Day"));
//        background.setBackground(new ColorDrawable(0xff6dc6d2));

        page_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Video_Day_1.class);
                intent.putExtra("int-keyword",0);
                startActivity(intent);
            }
        });


        return linearLayout;
    }
}
