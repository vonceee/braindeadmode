package com.example.braindeadmode;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve the NewsItem from the Intent
        NewsItem newsItem = getIntent().getParcelableExtra("NEWS_ITEM");

        // Populate the UI with the NewsItem data
        // For example:
        // ((TextView) findViewById(R.id.detail_title)).setText(newsItem.getTitle());
        // ((TextView) findViewById(R.id.detail_summary)).setText(newsItem.getSummary());
        // ... and so on for other views
    }
}

