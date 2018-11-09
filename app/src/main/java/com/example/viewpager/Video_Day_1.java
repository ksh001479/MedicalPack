package com.example.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
    WebView mWebView;

    Intent intent;
    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__day_1);
        intent = getIntent();
        t = intent.getIntExtra("int-keyword", 0);
        final String[] YouUrl = {
                "PFMeLgqPjgE", "CftaWmBIldU", "WmLqpNIJ0RY", "wwnF6JcRcMs", "PyDeNj-r8kQ",
                "wQeZLHGSSyk", "mjTecsbaPPM", "CNzAY4lefxw", "VCXkO62Gnqo", "xcMk8WciHck",
                "ReQ1nhGCUu4", "cuIWjeT_SvU", "F_Mt_u1Qaz4", "PoDQCG2CMxU", "ZU9iIbywOuM"
        };
        String[] WebUrl = {
                "https://ko.wikihow.com/%EC%8B%AC%EC%9E%A5-%EB%B0%9C%EC%9E%91%EC%9D%B4-%EC%9D%BC%EC%96%B4%EB%82%AC%EC%9D%84-%EB%95%8C-%EB%8C%80%EC%B2%98-%EB%B0%A9%EB%B2%95", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15"
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
        mWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        mWebView.loadUrl(WebUrl[t]);

    }
}
