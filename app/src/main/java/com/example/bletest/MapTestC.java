package com.example.bletest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MapTestC extends AppCompatActivity {

    private String TAG = MapTestC.class.getSimpleName();
    private WebView webView = null;

    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maptestc_activity);

        webView = findViewById(R.id.wv3);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // allow the js

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON); //화면이 계속 켜짐
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_USER);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://10.1.4.108/testmapc.php");

        //app thema가 noActionbar 상태에서는 쓰면 CRASH
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        imageView = (ImageView) findViewById(R.id.btnX);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapTestC.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
