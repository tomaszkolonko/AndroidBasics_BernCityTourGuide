package com.example.android.androidbasicsberncitytourguide.model;

import android.content.Context;
import android.content.res.Resources;
import com.example.android.androidbasicsberncitytourguide.R;

import java.util.ArrayList;

public class ShoppingCenter {
    private String mName;
    private String mAddress;
    private String mPhone;
    private int mImageResource;
    // Nasty workaround for getting String Ressources into this class...
    private static Resources mRes;

    public ShoppingCenter(Context context) {
        this.mRes = context.getResources();
    }

    public ShoppingCenter(String name, String address, String phone, int imageResource, Context context) {
        this.mName = name;
        this.mAddress = address;
        this.mPhone = phone;
        this.mImageResource = imageResource;
        // Nasty workaround for getting String Ressources into this class...
        // Like the whole constructor
        this.mRes = context.getResources();
    }

    public ShoppingCenter(String name, String address, String phone, int imageResource) {
        this.mName = name;
        this.mAddress = address;
        this.mPhone = phone;
        this.mImageResource = imageResource;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() { return mPhone; }

    public int getImageResource() { return mImageResource; }

    public static ArrayList<ShoppingCenter> createShoppingCenterList(Context context) {
        ArrayList<ShoppingCenter> shoppingCenters = new ArrayList<ShoppingCenter>();

        // Nasty workaround for getting String Ressources into this class...
        if(mRes == null) {
            mRes = context.getResources();
        }

        shoppingCenters.add(new ShoppingCenter(
                mRes.getString(R.string.sc_one_name),
                mRes.getString(R.string.sc_one_address),
                mRes.getString(R.string.sc_one_phone),
                R.drawable.restaurant_one));
        shoppingCenters.add(new ShoppingCenter(
                mRes.getString(R.string.sc_two_name),
                mRes.getString(R.string.sc_two_address),
                mRes.getString(R.string.sc_two_phone),
                R.drawable.restaurant_two));
        shoppingCenters.add(new ShoppingCenter(
                mRes.getString(R.string.sc_three_name),
                mRes.getString(R.string.sc_three_address),
                mRes.getString(R.string.sc_three_phone),
                R.drawable.restaurant_three));
        shoppingCenters.add(new ShoppingCenter(
                mRes.getString(R.string.sc_four_name),
                mRes.getString(R.string.sc_four_address),
                mRes.getString(R.string.sc_four_phone),
                R.drawable.restaurant_four));
        shoppingCenters.add(new ShoppingCenter(
                mRes.getString(R.string.sc_five_name),
                mRes.getString(R.string.sc_five_address),
                mRes.getString(R.string.sc_five_phone),
                R.drawable.restaurant_five));
        shoppingCenters.add(new ShoppingCenter(
                mRes.getString(R.string.sc_six_name),
                mRes.getString(R.string.sc_six_address),
                mRes.getString(R.string.sc_six_phone),
                R.drawable.restaurant_six));


        return shoppingCenters;
    }
}
