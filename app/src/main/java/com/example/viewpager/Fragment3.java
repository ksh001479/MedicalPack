package com.example.viewpager;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

public class Fragment3 extends Fragment {


    WebView mWebView;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout fl = (FrameLayout) inflater.inflate(R.layout.fragment_fragment3, container, false);

        if (mWebView != null) {
            mWebView.destroy();
        }

        mWebView = (WebView)fl.findViewById(R.id.webview);
        setWebView1();
        return fl;
    }

    public void setWebView1(){
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.addJavascriptInterface(new Fragment3.JavaScriptInterface(getActivity()), "android");
        mWebView.loadUrl("https://blog.naver.com/kecoprumy/221390189494");
    }

    public class JavaScriptInterface {
        Context mContext;
        JavaScriptInterface(Context c){ mContext = c; }
        @JavascriptInterface
        public void changePage(String idxNum){

            android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment_container, new Fragment3()).commit();
        }
    }
}
