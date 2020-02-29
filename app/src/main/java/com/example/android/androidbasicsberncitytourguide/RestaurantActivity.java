package com.example.android.androidbasicsberncitytourguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    ArrayList<Restaurant> restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);

        // I guess this is not the right place to initialize everything but
        // that it rather should be done inside the RestaurantFragment.

//        RecyclerView recyclerView = findViewById(R.id.restaurant_recycler_view);
//        restaurants = Restaurant.createRestaurantList();
//        RestaurantAdapter adapter = new RestaurantAdapter(restaurants);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //**



        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantFragment())
                .commit();
    }
}
