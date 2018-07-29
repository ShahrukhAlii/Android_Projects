package com.example.shahrukh.webpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button staticPage,loadpage;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        staticPage=(Button)findViewById(R.id.button);
        staticPage.setOnClickListener(this);
        loadpage=(Button)findViewById(R.id.button2);
        loadpage.setOnClickListener(this);
        webView=(WebView)findViewById(R.id.webview);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button:
                String customHTML="<html> <body> <h1> This is from Android Web page</h1> </body> </html>";
                webView.loadData(customHTML,"text/html","UTF-8");
                break;


            case R.id.button2:
                webView.setWebViewClient(new webViewClient());
                String url="https://www.google.com";
                webView.loadUrl(url);
                webView.getSettings().setJavaScriptEnabled(true);
                break;


        }

    }
    private class webViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }
}
