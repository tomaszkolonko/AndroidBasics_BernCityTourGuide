package com.example.android.androidbasicsberncitytourguide.activities;

import android.graphics.Movie;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.android.androidbasicsberncitytourguide.R;
import com.example.android.androidbasicsberncitytourguide.fragments.RestaurantFragment;
import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {

    ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantFragment())
                .commit();
    }
}