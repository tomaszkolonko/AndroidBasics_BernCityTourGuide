package com.example.android.androidbasicsberncitytourguide;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    // Store a member variable for the restaurants
    private List<Restaurant> mRestaurants;

    // Pass in the restaurant list into the constructor
    public RestaurantAdapter(List<Restaurant> restaurants) {
        super();
        mRestaurants = restaurants;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView restaurantNameView;
        public TextView restaurantAddressView;
        public TextView restaurantPhone;
        public ImageView restaurantImageSource;

        public ViewHolder(View itemView) {
            super(itemView);

            restaurantNameView = itemView.findViewById(R.id.restaurant_name);
            restaurantAddressView = itemView.findViewById(R.id.restaurant_address);
            restaurantPhone = itemView.findViewById(R.id.restaurant_phone);
            restaurantImageSource = itemView.findViewById(R.id.restaurant_image);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // View restaurantView = inflater.inflate(R.layout.restaurant_list_element, parent, false);
        View restaurantView = inflater.inflate(R.layout.restaurant_list_element, parent, false);

        // Return a new ViewHolder
        ViewHolder viewHolder = new ViewHolder(restaurantView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        //Get the data model based on position
        Restaurant restaurant = mRestaurants.get(position);

        // Set item views based on the views and data model
        TextView restaurantNameView = viewHolder.restaurantNameView;
        restaurantNameView.setText(restaurant.getName());

        TextView restaurantAddressView = viewHolder.restaurantAddressView;
        restaurantAddressView.setText(restaurant.getAddress());

        TextView restaurantPhone = viewHolder.restaurantPhone;
        restaurantPhone.setText(restaurant.getPhone());

        ImageView image = (ImageView) viewHolder.restaurantImageSource;
        image.setImageResource(restaurant.getImageResource());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }
}
