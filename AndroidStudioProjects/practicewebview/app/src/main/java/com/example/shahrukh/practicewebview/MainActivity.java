package com.example.shahrukh.practicewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button simplewebview,staticwebview;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        staticwebview=(Button)findViewById(R.id.simpleweb);
        simplewebview.setOnClickListener(this);

        staticwebview=(Button)findViewById(R.id.StaticWeb);
        staticwebview.setOnClickListener(this);
        webView=(WebView)findViewById(R.id.webview);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.StaticWeb:
                String customHtml="<HTML><body><h2>this i sfrom custom html</h2></body></HTML>";
                staticwebview.loadData(customHtml,"text/html","UTF=8");
                break;




            case R.id.simpleweb:
                simplewebview.setWebViewClient(new MyWebViewClient());
                String  url="www.google.com";
                simplewebview.getSetting().setJavaScriptEnabled(true);
                simplewebview.loadurl(url);
                break;
        }

    }


    private class MyWebViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);

            return true;
        }
    }


}
