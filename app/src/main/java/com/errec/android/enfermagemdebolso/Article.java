package com.errec.android.enfermagemdebolso;

public class Article {

    private String articleTitle;
    private String articleLink;
    private String articleBody;
    private int articlePhotoId;

    public Article(String articleTitle, String articleLink, String articleBody, int articlePhotoId) {
        this.articleTitle = articleTitle;
        this.articleLink = articleLink;
        this.articleBody = articleBody;
        this.articlePhotoId = articlePhotoId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public int getArticlePhotoId() {
        return articlePhotoId;
    }
}
