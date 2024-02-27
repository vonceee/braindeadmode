package com.example.braindeadmode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookmarkAdapter extends RecyclerView.Adapter<BookmarkAdapter.BookmarkViewHolder> {

    private List<BookmarkItem> bookmarkItems;

    public BookmarkAdapter(List<BookmarkItem> bookmarkItems) {
        this.bookmarkItems = bookmarkItems;
    }

    @NonNull
    @Override
    public BookmarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bookmark, parent, false);
        return new BookmarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkViewHolder holder, int position) {
        BookmarkItem item = bookmarkItems.get(position);
        // Bind the data to the views
        holder.titleTextView.setText(item.getTitle());
        holder.descriptionTextView.setText(item.getDescription());
        // Load the image using a library like Glide or Picasso
    }

    @Override
    public int getItemCount() {
        return bookmarkItems.size();
    }

    public static class BookmarkViewHolder extends RecyclerView.ViewHolder {
        ImageView bookmarkImage;
        TextView titleTextView;
        TextView descriptionTextView;

        public BookmarkViewHolder(@NonNull View itemView) {
            super(itemView);
            bookmarkImage = itemView.findViewById(R.id.bookmark_image);
            titleTextView = itemView.findViewById(R.id.bookmark_title);
            descriptionTextView = itemView.findViewById(R.id.bookmark_description);
        }
    }
}

