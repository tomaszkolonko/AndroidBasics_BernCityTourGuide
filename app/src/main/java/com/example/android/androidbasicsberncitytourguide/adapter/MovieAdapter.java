package com.example.android.androidbasicsberncitytourguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.androidbasicsberncitytourguide.R;
import com.example.android.androidbasicsberncitytourguide.model.Movie;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    // Store a member variable for the movie
    private List<Movie> mMovies;

    // Pass in the movie list into the constructor
    public MovieAdapter(List<Movie> movies) {
        super();
        mMovies = movies;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView movieTitle;
        public TextView movieCinema;
        public TextView movieTime;
        public ImageView movieImageSource;

        public ViewHolder(View itemView) {
            super(itemView);

            movieTitle = itemView.findViewById(R.id.movie_title);
            movieCinema = itemView.findViewById(R.id.movie_cinema);
            movieTime = itemView.findViewById(R.id.movie_time);
            movieImageSource = itemView.findViewById(R.id.movie_image);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View movieView = inflater.inflate(R.layout.movie_list_element, parent, false);

        // Return a new ViewHolder
        ViewHolder viewHolder = new ViewHolder(movieView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        //Get the data model based on position
        Movie movie = mMovies.get(position);

        // Set item views based on the views and data model
        TextView movieTitleView = viewHolder.movieTitle;
        movieTitleView.setText(movie.getTitle());

        TextView movieCinemaView = viewHolder.movieCinema;
        movieCinemaView.setText(movie.getCineam());

        TextView movieTimeView = viewHolder.movieTime;
        movieTimeView.setText(movie.getTime());

        ImageView image = (ImageView) viewHolder.movieImageSource;
        image.setImageResource(movie.getImageSource());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mMovies.size();
    }
}
