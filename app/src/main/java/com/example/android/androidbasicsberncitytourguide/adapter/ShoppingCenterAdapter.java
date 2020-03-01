package com.example.android.androidbasicsberncitytourguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.androidbasicsberncitytourguide.R;
import com.example.android.androidbasicsberncitytourguide.model.ShoppingCenter;
import java.util.List;

public class ShoppingCenterAdapter extends RecyclerView.Adapter<ShoppingCenterAdapter.ViewHolder> {

    // Store a member variable for the shoppingCenters
    private List<ShoppingCenter> mShoppingCenters;

    // Pass in the restaurant list into the constructor
    public ShoppingCenterAdapter(List<ShoppingCenter> shoppingCenters) {
        super();
        mShoppingCenters = shoppingCenters;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView shoppingCenterNameView;
        public TextView shoppingCenterAddressView;
        public TextView shoppingCenterPhoneView;
        public ImageView shoppingCenterImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            shoppingCenterNameView = itemView.findViewById(R.id.shoppingcenter_name);
            shoppingCenterAddressView = itemView.findViewById(R.id.shoppingcenter_address);
            shoppingCenterPhoneView = itemView.findViewById(R.id.shoppingcenter_phone);
            shoppingCenterImageView = itemView.findViewById(R.id.shoppingcenter_image);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ShoppingCenterAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // View restaurantView = inflater.inflate(R.layout.restaurant_list_element, parent, false);
        View restaurantView = inflater.inflate(R.layout.shoppingcenter_list_element, parent, false);

        // Return a new ViewHolder
        ViewHolder viewHolder = new ViewHolder(restaurantView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        //Get the data model based on position
        ShoppingCenter shoppingCenters = mShoppingCenters.get(position);

        // Set item views based on the views and data model
        TextView restaurantNameView = viewHolder.shoppingCenterNameView;
        restaurantNameView.setText(shoppingCenters.getName());

        TextView restaurantAddressView = viewHolder.shoppingCenterAddressView;
        restaurantAddressView.setText(shoppingCenters.getAddress());

        TextView restaurantPhone = viewHolder.shoppingCenterPhoneView;
        restaurantPhone.setText(shoppingCenters.getPhone());

        ImageView image = (ImageView) viewHolder.shoppingCenterImageView;
        image.setImageResource(shoppingCenters.getImageResource());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mShoppingCenters.size();
    }
}
