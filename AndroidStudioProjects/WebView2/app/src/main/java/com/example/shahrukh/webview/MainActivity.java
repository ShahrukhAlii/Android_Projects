package com.example.shahrukh.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    String code="<h1>This is from Android</h1>\n" +
            "<p>This paragraph is from android</p>\n" +
            "<i>This is from android html</i>\n" +
            "\n<sub>this is from my android garebo wala phone</sub>\n" +
            "<sup>Garebo wala phone</sup>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.webview);
        webView.loadDataWithBaseURL(null,code,"text/html","UTF-8",null);
    }
}
