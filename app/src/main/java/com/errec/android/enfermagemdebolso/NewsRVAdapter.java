package com.errec.android.enfermagemdebolso;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ArticleViewHolder> {

    List<Article> articles;

    NewsRVAdapter(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_item_list, viewGroup, false);
        ArticleViewHolder articleViewHolder = new ArticleViewHolder(v);
        return articleViewHolder;
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder ArticleViewHolder, int position) {
        ArticleViewHolder.newsTitle.setText(articles.get(position).getTitle());
        ArticleViewHolder.newsLink.setText(articles.get(position).getLink());
        ArticleViewHolder.newsLink.setText(articles.get(position).getBody());
        ArticleViewHolder.newsPhotoID.setImageResource(articles.get(position).getPhotoId());
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView newsTitle;
        TextView newsLink;
        TextView newsBody;
        ImageView newsPhotoID;

        ArticleViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card1_view);
            newsTitle = (TextView) itemView.findViewById(R.id.news_title);
            newsLink = (TextView) itemView.findViewById(R.id.news_link);
            newsBody = (TextView) itemView.findViewById(R.id.news_body);
            newsPhotoID = (ImageView) itemView.findViewById(R.id.news_photoId);
        }
    }
}
