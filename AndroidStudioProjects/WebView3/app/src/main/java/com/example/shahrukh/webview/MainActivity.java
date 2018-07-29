package com.example.shahrukh.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button loadpage,staticpage;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadpage=(Button)findViewById(R.id.button);
        loadpage.setOnClickListener(this);
        staticpage=(Button)findViewById(R.id.button2);
        staticpage.setOnClickListener(this);
        webView=(WebView)findViewById(R.id.webview);

    }


    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.button:
                String customHTML="<html><body><p>hey this is paragrapg from android page</p></body></html";
                webView.loadData(customHTML,"text/html","UTF-8");
                break;

            case R.id.button2:
                webView.setWebViewClient(new webviewClient());
                String url="http://www.google.com";
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
                break;


        }
    }

    private  class  webviewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url) {

            view.loadUrl(url);

            return true;
        }
    }
}
