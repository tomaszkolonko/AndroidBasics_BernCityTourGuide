package com.example.android.androidbasicsberncitytourguide.model;

public class ShoppingCenter {
    private String mName;
    private String mAddress;
    private boolean mHasParkingSpace;

    public ShoppingCenter() {}

    public ShoppingCenter(String name, String address, boolean hasParkingSpace) {
        this.mName = name;
        this.mAddress = address;
        this.mHasParkingSpace = hasParkingSpace;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public boolean hasParkingSpace() {
        return mHasParkingSpace;
    }
}
