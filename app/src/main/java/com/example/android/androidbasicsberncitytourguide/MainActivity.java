package com.example.android.androidbasicsberncitytourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryFragmentAdapter adapter = new CategoryFragmentAdapter(
                getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);


        recyclerView = (RecyclerView) findViewById(R.id.restaurant_recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Restaurant[] myRestaurants = new Restaurant[5];
        myRestaurants[0] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[1] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[2] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[3] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[4] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");


        mAdapter = new RestaurantAdapter(myRestaurants);
        recyclerView.setAdapter(mAdapter);
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//
//        tabLayout.setupWithViewPager(viewPager);
    }
}
