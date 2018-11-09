package com.example.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video_Day_1 extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    Button button;
    YouTubePlayer.OnInitializedListener listener;

    Intent intent;
    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__day_1);
        intent = getIntent();
        t = intent.getIntExtra("int-keyword", 0);
        final String[] YouUrl = {
                "PFMeLgqPjgE", "gKZinLW7qJ0", "PFMeLgqPjgE", "gKZinLW7qJ0", "PyDeNj-r8kQ",
                "wQeZLHGSSyk", "mjTecsbaPPM", "CNzAY4lefxw", "VCXkO62Gnqo", "xcMk8WciHck",
                "ReQ1nhGCUu4","cuIWjeT_SvU","F_Mt_u1Qaz4","PoDQCG2CMxU","ZU9iIbywOuM"
                };
//        TextView textView = (TextView)findViewById(R.id.text);
//        textView.setText("전달된 값은 : "+t);
//        getText(getInt);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubeView);
        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(YouUrl[t]);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youTubePlayerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyC1jR4KIMS2UEja0fWCiszS8UJH6V0K2Hw", listener);
            }
        });
    }
}
