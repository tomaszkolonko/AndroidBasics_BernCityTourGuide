package com.example.android.androidbasicsberncitytourguide.model;

import com.example.android.androidbasicsberncitytourguide.R;

import java.util.ArrayList;

public class Movie {
    private String mTitle;
    private String mCinema;
    private String mTime;
    private int mImageSource;

    public Movie() {}

    public Movie(String title, String cinema, String time, int imageSource) {
        this.mTitle = title;
        this.mCinema = cinema;
        this.mTime = time;
        this.mImageSource = imageSource;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getCineam() {
        return mCinema;
    }

    public String getTime() {
        return mTime;
    }

    public int getImageSource() { return mImageSource; }

    public static ArrayList<Movie> createMovieList() {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("Movie One", "MegaMax", "20:15", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Two", "VideoCity", "23:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Three", "DigitalAge","21:30", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Four", "Abaton", "19:30", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Five", "CineRex", "20:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Six", "Arena", "20:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie One", "MegaMax", "20:15", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Two", "VideoCity", "23:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Three", "DigitalAge","21:30", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Four", "Abaton", "19:30", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Five", "CineRex", "20:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Six", "Arena", "20:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie One", "MegaMax", "20:15", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Two", "VideoCity", "23:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Three", "DigitalAge","21:30", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Four", "Abaton", "19:30", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Five", "CineRex", "20:00", R.drawable.restaurant_one));
        movies.add(new Movie("Movie Six", "Arena", "20:00", R.drawable.restaurant_one));

        return movies;
    }
}
