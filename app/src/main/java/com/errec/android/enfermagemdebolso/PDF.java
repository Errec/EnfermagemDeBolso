package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import static com.errec.android.enfermagemdebolso.Legis.KEY_PNAB;

public class PDF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String linkTo = "";

        Intent intent = getIntent();
        if (null != intent) {
            linkTo = intent.getStringExtra(KEY_PNAB);
        }

        WebView mWebView = new WebView(PDF.this);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + linkTo);

        setContentView(mWebView);
    }
}
