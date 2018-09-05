package com.example.metacoders.banglarecipee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class murgi_jhol_Activity extends AppCompatActivity {
WebView mwebview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murgi_jhol_);
       mwebview=(WebView)findViewById(R.id.videoview);
        String videoStr = "<iframe width=\"360\" height=\"256\" src=\"https://www.youtube.com/embed/GNIBqXZCbJg?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen>";
       mwebview
        .setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings ws = mwebview.getSettings();
        ws.setJavaScriptEnabled(true);
        mwebview.loadData(videoStr, "text/html", "utf-8");

    }
}
