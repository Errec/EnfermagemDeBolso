package com.errec.android.enfermagemdebolso;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class News extends Activity {

    private List<Article> articles;
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
        articles = new ArrayList<>();
        articles.add(new Article("0Forum mineiro se prepara para o dia nacinal da valorizaçào dos enfermeiros braçudos", "http://www.corenmg.gov.br/", "A Enfermagem representa maior contingente da força de trabalho do Sistema Único de Saúde (SUS), mas ainda é necessário sensibilizar seus usuários e trabalhadores na luta pela regulamentação da...", R.drawable.enfnotum));
        articles.add(new Article("1Forum mineiro se prepara para o dia nacinal da valorizaçào dos enfermeiros braçudos", "http://www.corenmg.gov.br/", "A Enfermagem representa maior contingente da força de trabalho do Sistema Único de Saúde (SUS), mas ainda é necessário sensibilizar seus usuários e trabalhadores na luta pela regulamentação da...", R.drawable.enfnotum));
        articles.add(new Article("2Forum mineiro se prepara para o dia nacinal da valorizaçào dos enfermeiros braçudos", "http://www.corenmg.gov.br/", "A Enfermagem representa maior contingente da força de trabalho do Sistema Único de Saúde (SUS), mas ainda é necessário sensibilizar seus usuários e trabalhadores na luta pela regulamentação da...", R.drawable.enfnotum));
        articles.add(new Article("3Forum mineiro se prepara para o dia nacinal da valorizaçào dos enfermeiros braçudos", "http://www.corenmg.gov.br/", "A Enfermagem representa maior contingente da força de trabalho do Sistema Único de Saúde (SUS), mas ainda é necessário sensibilizar seus usuários e trabalhadores na luta pela regulamentação da...", R.drawable.enfnotum));
        articles.add(new Article("4Forum mineiro se prepara para o dia nacinal da valorizaçào dos enfermeiros braçudos", "http://www.corenmg.gov.br/", "A Enfermagem representa maior contingente da força de trabalho do Sistema Único de Saúde (SUS), mas ainda é necessário sensibilizar seus usuários e trabalhadores na luta pela regulamentação da...", R.drawable.enfnotum));
    }

    private void initializeAdapter() {
        NewsRVAdapter adapter = new NewsRVAdapter(articles);
        rv.setAdapter(adapter);
    }
}
