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

public class Fragment4 extends Fragment {

    WebView mWebView;

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout fl = (FrameLayout) inflater.inflate(R.layout.fragment_fragment4, container, false);

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
        mWebView.addJavascriptInterface(new Fragment4.JavaScriptInterface(getActivity()), "android");
        mWebView.loadUrl("https://blog.naver.com/kma_131/221402136119");
    }

    public class JavaScriptInterface {
        Context mContext;
        JavaScriptInterface(Context c){ mContext = c; }
        @JavascriptInterface
        public void changePage(String idxNum){

            android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment_container, new Fragment4()).commit();
        }
    }
}
