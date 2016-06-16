package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ArticleViewHolder> {

    public static final String KEY_TITLE = "article_title";
    private List<Article> articles;

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
        return new ArticleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder ArticleViewHolder, int position) {
        ArticleViewHolder.articleTitle.setText(articles.get(position).getArticleTitle());
        ArticleViewHolder.articleLink.setText(articles.get(position).getArticleLink());
        ArticleViewHolder.articleBody.setText(articles.get(position).getArticleBody());
        ArticleViewHolder.articlePhotoID.setImageResource(articles.get(position).getArticlePhotoId());
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cv;
        TextView articleTitle;
        TextView articleLink;
        TextView articleBody;
        ImageView articlePhotoID;

        ArticleViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card1_view);
            articleTitle = (TextView) itemView.findViewById(R.id.news_title);
            articleLink = (TextView) itemView.findViewById(R.id.news_link);
            articleBody = (TextView) itemView.findViewById(R.id.news_body);
            articlePhotoID = (ImageView) itemView.findViewById(R.id.news_photoId);

            articleBody.setOnClickListener(this);
            articlePhotoID.setOnClickListener(this);
            articleLink.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == articleBody.getId() || v.getId() == articlePhotoID.getId()) {

                Intent intent = new Intent(v.getContext(), ArticlePage.class);
                intent.putExtra(KEY_TITLE, articleTitle.getText());

                v.getContext().startActivity(intent);

            } else if (v.getId() == articleLink.getId()) {
                Toast.makeText(v.getContext(), "Open link!", Toast.LENGTH_LONG).show();
            }
        }
    }
}
