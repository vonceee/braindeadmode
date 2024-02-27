package com.example.braindeadmode.ui.bookmark;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.braindeadmode.BookmarkAdapter;
import com.example.braindeadmode.BookmarkItem;
import com.example.braindeadmode.R;

import java.util.ArrayList;
import java.util.List;

public class BookmarkFragment extends Fragment {

    private RecyclerView bookmarkRecyclerView;
    private BookmarkAdapter bookmarkAdapter;
    private List<BookmarkItem> bookmarkItems;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bookmark, container, false);

        // Initialize the RecyclerView
        bookmarkRecyclerView = view.findViewById(R.id.bookmark_list);
        bookmarkRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize the data with sample data
        bookmarkItems = new ArrayList<>();
        bookmarkItems.add(new BookmarkItem("Sample Title  1", "This is a sample description for the first bookmark.", "https://example.com/image1.jpg"));
        bookmarkItems.add(new BookmarkItem("Sample Title  2", "This is a sample description for the second bookmark.", "https://example.com/image2.jpg"));
        bookmarkItems.add(new BookmarkItem("Sample Title  3", "This is a sample description for the third bookmark.", "https://example.com/image3.jpg"));

        // Set up the adapter
        bookmarkAdapter = new BookmarkAdapter(bookmarkItems);
        bookmarkRecyclerView.setAdapter(bookmarkAdapter);

        return view;
    }
}

