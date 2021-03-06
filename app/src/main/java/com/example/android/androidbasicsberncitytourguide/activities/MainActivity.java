package com.example.android.androidbasicsberncitytourguide.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.example.android.androidbasicsberncitytourguide.adapter.CategoryFragmentAdapter;
import com.example.android.androidbasicsberncitytourguide.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);

        CategoryFragmentAdapter adapter = new CategoryFragmentAdapter(
                getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);
    }
}
