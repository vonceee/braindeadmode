package com.example.braindeadmode;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<NewsItem> newsItems;

    public NewsAdapter(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view, this); // Pass 'this' to refer to the current NewsAdapter instance
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewsItem newsItem = newsItems.get(position);
        holder.titleTextView.setText(newsItem.getTitle());
        holder.summaryTextView.setText(newsItem.getSummary());
        // TODO: Load the image into the ImageView
    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView summaryTextView;
        private final NewsAdapter adapter; // Add this line

        ViewHolder(View itemView, NewsAdapter adapter) { // Modify the constructor
            super(itemView);
            this.adapter = adapter; // Store the reference to the adapter
            titleTextView = itemView.findViewById(R.id.title);
            summaryTextView = itemView.findViewById(R.id.summary);

            // Make the entire item clickable
            // Inside the ViewHolder class
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int adapterPosition = getAdapterPosition();
                    if (adapterPosition != RecyclerView.NO_POSITION) {
                        NewsItem clickedItem = adapter.newsItems.get(adapterPosition);
                        Intent intent = new Intent(v.getContext(), DetailActivity.class);
                        intent.putExtra("NEWS_ITEM", clickedItem); // Pass the NewsItem to DetailActivity
                        v.getContext().startActivity(intent);
                    }
                }
            });

        }
    }
}

