package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.errec.android.enfermagemdebolso.NewsRVAdapter.KEY_TITLE;

public class ArticlePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_page);

        String title = "";


        Intent intent = getIntent();
        if (null != intent) {
            title = intent.getStringExtra(KEY_TITLE);

        }

        TextView ArticlePageTitle = (TextView) findViewById(R.id.article_page_title);
        ArticlePageTitle.setText(title);
    }
}

//TODO: set source link text, body text, image, icon_share button, comment button,  collapsing layout