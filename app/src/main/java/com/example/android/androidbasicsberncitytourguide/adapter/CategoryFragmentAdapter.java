package com.example.android.androidbasicsberncitytourguide.adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.android.androidbasicsberncitytourguide.fragments.CityFragment;
import com.example.android.androidbasicsberncitytourguide.fragments.ClubbingFragment;
import com.example.android.androidbasicsberncitytourguide.fragments.MovieFragment;
import com.example.android.androidbasicsberncitytourguide.fragments.RestaurantFragment;
import com.example.android.androidbasicsberncitytourguide.fragments.ShoppingFragment;

public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    private final int NUMBER_OF_TABS = 5;
    private Context mContext;

    public CategoryFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new CityFragment();
        } else if(position == 1) {
            return new RestaurantFragment();
        } else if(position == 2) {
            return new MovieFragment();
        } else if(position == 3) {
            return new ShoppingFragment();
        } else {
            return new ClubbingFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return "City";
        } else if(position == 1) {
            return "Food";
        } else if(position == 2) {
            return "Movies";
        } else if(position == 3) {
            return "Shop";
        } else {
            return "Club";
        }
    }
}
