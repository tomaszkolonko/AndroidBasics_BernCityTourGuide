package com.example.android.androidbasicsberncitytourguide;

public class RestaurantDataSource {
    static Restaurant[] myRestaurants = new Restaurant[5];

    public static Restaurant[] getRestaurantArray() {
        myRestaurants[0] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[1] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[2] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[3] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        myRestaurants[4] = new Restaurant("resti one", "lentulusrain 7", "9238592", "adsf@asdf.com");
        return myRestaurants;
    }

}
