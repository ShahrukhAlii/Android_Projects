package com.example.shahrukh.webviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button simpleWebView,StaticWebView;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        simpleWebView=(Button)findViewById(R.id.simplewebView);
        simpleWebView.setOnClickListener(this);

        StaticWebView=(Button)findViewById(R.id.staticWebView);
        StaticWebView.setOnClickListener(this);

        webView=(WebView)findViewById(R.id.webView);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.staticWebView:
                String customHTML="<HTML><body><h1>this is from static webview</h1></body></HTML>";
                webView.loadData(customHTML,"text/html","UTF-8");
                break;


            case R.id.simplewebView:

                s


        }


    }

}
