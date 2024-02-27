package com.example.braindeadmode;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView newsList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        newsList = findViewById(R.id.news_list);

        // Initialize the RecyclerView
        newsList.setLayoutManager(new LinearLayoutManager(this));

        // Create sample data
        NewsItem newsItem1 = new NewsItem("Sample Title   1", "This is a sample summary for news item   1.", "https://via.placeholder.com/150");
        NewsItem newsItem2 = new NewsItem("Sample Title   2", "This is a sample summary for news item   2.", "https://via.placeholder.com/150");
        NewsItem newsItem3 = new NewsItem("Sample Title   3", "This is a sample summary for news item   3.", "https://via.placeholder.com/150");

        // Create a list of news items
        List<NewsItem> newsItems = Arrays.asList(newsItem1, newsItem2, newsItem3);

        // Initialize the adapter with the sample data
        newsAdapter = new NewsAdapter(newsItems); // Pass the list of news items to the adapter
        newsList.setAdapter(newsAdapter);

    }
}