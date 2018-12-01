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
                "PFMeLgqPjgE", "CftaWmBIldU", "WmLqpNIJ0RY", "fCloSXU1SX0", "74JirHV_was",
                "wQeZLHGSSyk", "_FY7dyd5nuw", "CNzAY4lefxw", "UJiDmbPHSq0", "xcMk8WciHck",
                "QwcJCRH7C3E", "DvawexsKfjw", "F_Mt_u1Qaz4", "0O4pUp1kB-k", "Fl4Q47dcdIk"
        };
        String[] WebUrl = {
                "https://ko.wikihow.com/%EC%8B%AC%EC%9E%A5-%EB%B0%9C%EC%9E%91%EC%9D%B4-%EC%9D%BC%EC%96%B4%EB%82%AC%EC%9D%84-%EB%95%8C-%EB%8C%80%EC%B2%98-%EB%B0%A9%EB%B2%95", "https://ko.wikihow.com/%EC%97%B4%EC%82%AC%EB%B3%91-%EB%8C%80%EC%B2%98-%EB%B0%A9%EB%B2%95", "https://m.post.naver.com/viewer/postView.nhn?volumeNo=12776323&memberNo=19859711&vType=VERTICAL", "https://ko.wikihow.com/%EB%B2%8C%EC%97%90-%EC%8F%98%EC%98%80%EC%9D%84-%EB%95%8C-%EB%8C%80%EC%B2%98%EB%B2%95", "https://ko.wikihow.com/%EB%AC%B8%EC%97%90-%EC%86%90%EA%B0%80%EB%9D%BD%EC%9D%B4-%EA%BC%88%EC%9D%84-%EB%95%8C-%ED%86%B5%EC%A6%9D-%EB%8B%A4%EC%8A%A4%EB%A6%AC%EB%8A%94-%EB%B2%95",
                "https://terms.naver.com/entry.nhn?docId=2118489&cid=51017&categoryId=51017", "https://ko.wikihow.com/%EC%95%95%EB%B0%95-%EB%B6%95%EB%8C%80-%EA%B0%90%EB%8A%94-%EB%B2%95", "https://terms.naver.com/entry.nhn?docId=2843268&cid=55605&categoryId=55605", "https://ko.wikihow.com/%EB%B1%80%EC%97%90-%EB%AC%BC%EB%A0%B8%EC%9D%84-%EB%95%8C-%EB%8C%80%EC%B2%98%EB%B2%95", "https://ko.wikihow.com/%EC%A0%88%EB%8B%A8%EB%90%9C-%EC%86%90%EA%B0%80%EB%9D%BD-%EC%9D%91%EA%B8%89%EC%B2%98%EC%B9%98%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95",
                "https://ko.wikihow.com/%ED%98%80-%EA%B9%A8%EB%AC%BC%EC%97%88%EC%9D%84-%EB%95%8C-%EC%B9%98%EB%A3%8C%ED%95%98%EB%8A%94-%EB%B2%95", "https://ko.wikihow.com/%EC%97%BC%EC%A2%8C-%EC%9D%91%EA%B8%89%EC%B2%98%EC%B9%98%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95", "https://ko.wikihow.com/%ED%99%94%EC%83%81-%EC%B9%98%EB%A3%8C%ED%95%98%EB%8A%94-%EB%B2%95", "https://ko.wikihow.com/%EA%B0%90%EC%A0%84-%EC%82%AC%EA%B3%A0-%EB%B0%9C%EC%83%9D-%EC%8B%9C-%EB%8C%80%EC%B2%98%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95", "https://ko.wikihow.com/%ED%95%B4%ED%8C%8C%EB%A6%AC%EC%97%90-%EC%8F%98%EC%98%80%EC%9D%84-%EB%95%8C-%EB%8C%80%EC%B2%98%EB%B2%95"
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
