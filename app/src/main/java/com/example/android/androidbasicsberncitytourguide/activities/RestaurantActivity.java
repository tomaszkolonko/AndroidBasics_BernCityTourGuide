package com.example.android.androidbasicsberncitytourguide.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.android.androidbasicsberncitytourguide.R;
import com.example.android.androidbasicsberncitytourguide.model.Restaurant;
import com.example.android.androidbasicsberncitytourguide.fragments.RestaurantFragment;


public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantFragment())
                .commit();
    }
}
