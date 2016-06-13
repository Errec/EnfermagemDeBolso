package com.errec.android.enfermagemdebolso;

/**
 * Created by ${Raniro} on ${29/04/2016}.
 */
public class Article {

    private String title;
    private String link;
    private String body;
    private int photoId;

    Article(String title, String link, String body, int photoId) {
        this.title = title;
        this.link = link;
        this.body = body;
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getBody() {
        return body;
    }

    public int getPhotoId() {
        return photoId;
    }
}
