package com.example.shahrukh.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    String context="<h1>this header is from android</h1>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.webview);
        webView.loadDataWithBaseURL(null,context,"text/html","UTF-8",null);
    }
}
