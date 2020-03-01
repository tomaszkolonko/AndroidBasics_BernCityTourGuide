package com.example.android.androidbasicsberncitytourguide.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.android.androidbasicsberncitytourguide.fragments.CityFragment;
import com.example.android.androidbasicsberncitytourguide.R;

public class CityActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new CityFragment())
                .commit();
    }
}
