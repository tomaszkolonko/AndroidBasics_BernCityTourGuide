package com.example.android.androidbasicsberncitytourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryFragmentAdapter adapter = new CategoryFragmentAdapter(
                getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);

//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//
//        tabLayout.setupWithViewPager(viewPager);
    }
}
