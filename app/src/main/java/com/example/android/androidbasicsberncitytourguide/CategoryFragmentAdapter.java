package com.example.android.androidbasicsberncitytourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    private final int NUMBER_OF_TABS = 3;
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
            return "Restaurants";
        } else {
            return "Clubbing";
        }
    }
}
