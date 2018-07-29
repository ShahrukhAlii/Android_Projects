package com.example.shahrukh.my5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button customHTML,Staticview;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        customHTML=(Button)findViewById(R.id.button2);
        customHTML.setOnClickListener(this);
        Staticview =(Button)findViewById(R.id.button);
        Staticview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.button2:

                String CustomHTML ="<HTML>  <head>   <body>   <h1>This is Header<h1/> " +
                        "<p>This is paragraph<p/>  <body/>     <head/>     <HTML/>";


                webView.loadData(CustomHTML,"text/html","UTF-8");
                break;

            case R.id.button:

                webView.setWebViewClient(new ClientWebView());

                String url ="https://www.youtube.com/";
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
                break;

        }





    }
    private  class ClientWebView extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }
}
