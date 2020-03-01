package com.example.android.androidbasicsberncitytourguide.model;

import com.example.android.androidbasicsberncitytourguide.R;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String address;
    private String phone;
    private String email;
    private int imageResource;

    public Restaurant(String name, String address, String phone, String email, int imageResource) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.imageResource = imageResource;
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

        restaurants.add(new Restaurant("Restaurant One", "Lerchenhalde 534",
                "041 458 65 97", "info@rest.ch", R.drawable.restaurant_one));
        restaurants.add(new Restaurant("Restaurant Two", "Brungasse 4",
                "041 777 65 97", "info@rest.ch", R.drawable.restaurant_two));
        restaurants.add(new Restaurant("Restaurant Three", "Helmutrain 53",
                "041 869 65 11", "info@rest.ch", R.drawable.restaurant_three));
        restaurants.add(new Restaurant("Restaurant Four", "Kramergasse 22",
                "041 458 55 97", "info@rest.ch", R.drawable.restaurant_four));
        restaurants.add(new Restaurant("Restaurant Five", "Wankdorfstrasse 11",
                "041 458 65 37", "info@rest.ch", R.drawable.restaurant_five));
        restaurants.add(new Restaurant("Restaurant Six", "Winkelriedstrass 200",
                "041 159 23 99", "info@rest.ch", R.drawable.restaurant_six));
        restaurants.add(new Restaurant("Restaurant One", "Lerchenhalde 534",
                "041 458 65 97", "info@rest.ch", R.drawable.restaurant_one));
        restaurants.add(new Restaurant("Restaurant Two", "Brungasse 4",
                "041 777 65 97", "info@rest.ch", R.drawable.restaurant_two));
        restaurants.add(new Restaurant("Restaurant Three", "Helmutrain 53",
                "041 869 65 11", "info@rest.ch", R.drawable.restaurant_three));
        restaurants.add(new Restaurant("Restaurant Four", "Kramergasse 22",
                "041 458 55 97", "info@rest.ch", R.drawable.restaurant_four));
        restaurants.add(new Restaurant("Restaurant Five", "Wankdorfstrasse 11",
                "041 458 65 37", "info@rest.ch", R.drawable.restaurant_five));
        restaurants.add(new Restaurant("Restaurant Six", "Winkelriedstrass 200",
                "041 159 23 99", "info@rest.ch", R.drawable.restaurant_six));
        restaurants.add(new Restaurant("Restaurant One", "Lerchenhalde 534",
                "041 458 65 97", "info@rest.ch", R.drawable.restaurant_one));
        restaurants.add(new Restaurant("Restaurant Two", "Brungasse 4",
                "041 777 65 97", "info@rest.ch", R.drawable.restaurant_two));
        restaurants.add(new Restaurant("Restaurant Three", "Helmutrain 53",
                "041 869 65 11", "info@rest.ch", R.drawable.restaurant_three));
        restaurants.add(new Restaurant("Restaurant Four", "Kramergasse 22",
                "041 458 55 97", "info@rest.ch", R.drawable.restaurant_four));
        restaurants.add(new Restaurant("Restaurant Five", "Wankdorfstrasse 11",
                "041 458 65 37", "info@rest.ch", R.drawable.restaurant_five));
        restaurants.add(new Restaurant("Restaurant Six", "Winkelriedstrass 200",
                "041 159 23 99", "info@rest.ch", R.drawable.restaurant_six));

        return restaurants;
    }
}
