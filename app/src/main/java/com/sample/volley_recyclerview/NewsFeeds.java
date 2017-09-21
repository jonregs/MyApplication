package com.sample.volley_recyclerview;

/**
 * Created by AndroidNovice on 6/5/2016.
 */
//Simple POJO to hold values of our JSON

public class NewsFeeds {

    private String imgURL, feedName, content;
    private int rating;

    public NewsFeeds(String name, String content, String imgurl, int rating) {
        this.feedName = name;
        this.content = content;
        this.imgURL = imgurl;
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public String getImgURL() {
        return imgURL;
    }

    public String getFeedName() {
        return feedName;
    }

    public int getRating() {
        return rating;
    }

}