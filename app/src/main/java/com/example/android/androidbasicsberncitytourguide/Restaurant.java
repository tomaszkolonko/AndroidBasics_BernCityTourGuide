package com.example.android.androidbasicsberncitytourguide;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String address;
    private String phone;
    private String email;
    private int imageResource;

    public Restaurant(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        //this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResource() {
        return imageResource;
    }

    public static ArrayList<Restaurant> createRestaurantList() {
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

        restaurants.add(new Restaurant("Restaurant One", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Two", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Three", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Four", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Five", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Six", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Seven", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Eight", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant One", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Two", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Three", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Four", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Five", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Six", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Seven", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Eight", "Address", "phone", "email"));
        restaurants.add(new Restaurant("Restaurant Nine", "Address", "phone", "email"));



        return restaurants;
    }
}
