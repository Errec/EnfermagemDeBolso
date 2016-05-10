package com.errec.android.enfermagemdebolso;

/**
 * Created by ${Raniro} on ${29/04/2016}.
 */
public class Video {

    private String videoID;
    private String videoTitle;

    public Video(String videoID, String videoTitle) {
        this.videoID = videoID;
        this.videoTitle = videoTitle;
    }

    public String getVideoId() {
        return videoID;
    }

    public String getVideoTitle() {
        return videoTitle;
    }
}
