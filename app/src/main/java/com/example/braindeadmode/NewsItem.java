package com.example.braindeadmode;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class NewsItem implements Parcelable {

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String summary;

    @SerializedName("urlToImage")
    private String imageUrl;

    // Default constructor required for Parcelable
    public NewsItem() {}

    // Existing constructor
    public NewsItem(String title, String summary, String imageUrl) {
        this.title = title;
        this.summary = summary;
        this.imageUrl = imageUrl;
    }

    // Required for Parcelable
    protected NewsItem(Parcel in) {
        title = in.readString();
        summary = in.readString();
        imageUrl = in.readString();
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    // Methods required for Parcelable
    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(summary);
        dest.writeString(imageUrl);
    }

    // Static field to create the creator for the parcelable protocol
    public static final Creator<NewsItem> CREATOR = new Creator<NewsItem>() {
        @Override
        public NewsItem createFromParcel(Parcel in) {
            return new NewsItem(in);
        }

        @Override
        public NewsItem[] newArray(int size) {
            return new NewsItem[size];
        }
    };
}

