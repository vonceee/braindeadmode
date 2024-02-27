package com.example.braindeadmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CreatePostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        final EditText postTitle = findViewById(R.id.postTitle);
        final EditText postContent = findViewById(R.id.postContent);
        Button submitPost = findViewById(R.id.submitPost);

        submitPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to pass the post data back to the profile activity
                Intent resultIntent = new Intent();
                resultIntent.putExtra("postTitle", postTitle.getText().toString());
                resultIntent.putExtra("postContent", postContent.getText().toString());
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}

