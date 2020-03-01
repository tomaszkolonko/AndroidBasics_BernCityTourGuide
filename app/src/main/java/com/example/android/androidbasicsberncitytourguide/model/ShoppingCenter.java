package com.example.android.androidbasicsberncitytourguide.model;

import com.example.android.androidbasicsberncitytourguide.R;

import java.util.ArrayList;

public class ShoppingCenter {
    private String mName;
    private String mAddress;
    private String mPhone;
    private int mImageResource;

    public ShoppingCenter() {}

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

    public static ArrayList<ShoppingCenter> createShoppingCenterList() {
        ArrayList<ShoppingCenter> shoppingCenters = new ArrayList<ShoppingCenter>();

        shoppingCenters.add(new ShoppingCenter("ShoppingCenter One", "Lerchenhalde 534",
                "041 458 65 97", R.drawable.restaurant_one));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Two", "Brungasse 4",
                "041 777 65 97", R.drawable.restaurant_two));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Three", "Helmutrain 53",
                "041 869 65 11",  R.drawable.restaurant_three));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Four", "Kramergasse 22",
                "041 458 55 97", R.drawable.restaurant_four));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Five", "Wankdorfstrasse 11",
                "041 458 65 37", R.drawable.restaurant_five));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Six", "Winkelriedstrass 200",
                "041 159 23 99", R.drawable.restaurant_six));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter One", "Lerchenhalde 534",
                "041 458 65 97", R.drawable.restaurant_one));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Two", "Brungasse 4",
                "041 777 65 97", R.drawable.restaurant_two));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Three", "Helmutrain 53",
                "041 869 65 11",  R.drawable.restaurant_three));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Four", "Kramergasse 22",
                "041 458 55 97", R.drawable.restaurant_four));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Five", "Wankdorfstrasse 11",
                "041 458 65 37", R.drawable.restaurant_five));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Six", "Winkelriedstrass 200",
                "041 159 23 99", R.drawable.restaurant_six));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter One", "Lerchenhalde 534",
                "041 458 65 97", R.drawable.restaurant_one));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Two", "Brungasse 4",
                "041 777 65 97", R.drawable.restaurant_two));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Three", "Helmutrain 53",
                "041 869 65 11",  R.drawable.restaurant_three));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Four", "Kramergasse 22",
                "041 458 55 97", R.drawable.restaurant_four));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Five", "Wankdorfstrasse 11",
                "041 458 65 37", R.drawable.restaurant_five));
        shoppingCenters.add(new ShoppingCenter("ShoppingCenter Six", "Winkelriedstrass 200",
                "041 159 23 99", R.drawable.restaurant_six));

        return shoppingCenters;
    }
}
