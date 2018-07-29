package com.example.shahrukh.webpage;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button staticWebView,SimpleWebView;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        staticWebView=(Button)findViewById(R.id.button);
        staticWebView.setOnClickListener(this);

        SimpleWebView=(Button)findViewById(R.id.button2);
        SimpleWebView.setOnClickListener(this);

        webView=(WebView)findViewById(R.id.webview);


    }

    @Override
    public void onClick(View v) {



          switch (v.getId()){



              case R.id.button:
                  String customHTML="<HTML><Body><h1>hey this is from custom html </h1></body></HTML>";
                  webView.loadData(customHTML,"text/html","UTF-8");
                  break;


              case R.id.button2:
                  webView.setWebViewClient(new MyWebViewClient() );
                  String url="www.google.com";
                  webView.getSettings().setJavaScriptEnabled(true);
                  webView.loadUrl(url);
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





