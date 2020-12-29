package com.example.advancedintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        open_web();
    }
    public void open_web(){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.tw"));
        startActivity(i);//開啟後關閉XML
    }
}