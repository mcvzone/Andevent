package com.example.neo.andevent;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebBrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        findViewById(R.id.web_bt_browser).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                WebView wv = (WebView)findViewById(R.id.web_wv_window);
                WebSettings settings = wv.getSettings();
                settings.setJavaScriptEnabled(true);
                wv.setWebViewClient(new WebViewClient());
                //wv.loadUrl("http://m.naver.com");
                wv.loadUrl("file:///android_asset/sample.html");
            }
        });
    }
}
