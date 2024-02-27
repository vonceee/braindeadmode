package com.example.braindeadmode;

public class BookmarkItem {
    private String title;
    private String description;
    private String imageUrl;

    // Constructor
    public BookmarkItem(String title, String description, String imageUrl) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

