package com.errec.android.enfermagemdebolso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class News extends AppCompatActivity {

    private List<Article> articles = new ArrayList<>();
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        initializeData();
        initializeAdapter();
    }

    private void initializeData() {
        articles.add(new Article("0title", "0link", "0body", R.drawable.enfnotum));
        articles.add(new Article("1title", "1link", "1body", R.drawable.enfnoticias));
        articles.add(new Article("2title", "2link", "2body", R.drawable.image1));
        articles.add(new Article("3title", "3link", "3body", R.drawable.image2));
        articles.add(new Article("4title", "4link", "4body", R.drawable.image3));
        articles.add(new Article("5title", "5link", "5body", R.drawable.enfnotum));
        articles.add(new Article("6title", "6link", "6body", R.drawable.image3));
        articles.add(new Article("7title", "7link", "7body", R.drawable.enfnoticias));
        //TODO: database
    }

    private void initializeAdapter() {
        NewsRVAdapter adapter = new NewsRVAdapter(articles);
        rv.setAdapter(adapter);
    }
}