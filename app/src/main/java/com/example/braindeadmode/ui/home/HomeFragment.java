package com.example.braindeadmode.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.braindeadmode.NewsAdapter;
import com.example.braindeadmode.NewsItem;
import com.example.braindeadmode.databinding.FragmentHomeBinding;

import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private RecyclerView newsList;
    private NewsAdapter newsAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        newsList = binding.newsList; // Assuming you have set the id in your layout file

        // Initialize the RecyclerView
        newsList.setLayoutManager(new LinearLayoutManager(getContext()));

        // Create sample data
        NewsItem newsItem1 = new NewsItem("Sample Title  1", "This is a sample summary for news item  1.", "https://via.placeholder.com/150");
        NewsItem newsItem2 = new NewsItem("Sample Title  2", "This is a sample summary for news item  2.", "https://via.placeholder.com/150");
        NewsItem newsItem3 = new NewsItem("Sample Title  3", "This is a sample summary for news item  3.", "https://via.placeholder.com/150");

        // Create a list of news items
        List<NewsItem> newsItems = Arrays.asList(newsItem1, newsItem2, newsItem3);

        // Initialize the adapter with the sample data
        newsAdapter = new NewsAdapter(newsItems); // Pass the list of news items to the adapter
        newsList.setAdapter(newsAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
