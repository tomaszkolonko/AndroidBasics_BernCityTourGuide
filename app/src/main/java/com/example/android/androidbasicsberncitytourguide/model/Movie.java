package com.example.android.androidbasicsberncitytourguide.model;

public class Movie {
    private String mTitle;
    private String mCast;
    private String mCinema;
    private String mTime;

    public Movie() {}

    public Movie(String title, String cast, String cinema, String time) {
        this.mTitle = title;
        this.mCast = cast;
        this.mCinema = cinema;
        this.mTime = time;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getCast() {
        return mCast;
    }

    public String getCineam() {
        return mCinema;
    }

    public String getTime() {
        return mTime;
    }
}
