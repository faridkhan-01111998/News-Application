package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.news.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView text_detail_title,text_detail_author,text_detail_time,text_detail_detail,text_detail_content;
    ImageView img_detail_news;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        text_detail_title = findViewById(R.id.text_detail_title);
        text_detail_author = findViewById(R.id.text_detail_author);
        text_detail_time = findViewById(R.id.text_detail_time);
        text_detail_detail = findViewById(R.id.text_detail_detail);
        text_detail_content = findViewById(R.id.text_detail_content);
        img_detail_news = findViewById(R.id.img_detail_news);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        text_detail_title.setText(headlines.getTitle());
        text_detail_author.setText(headlines.getAuthor());
        text_detail_time.setText(headlines.getPublishedAt());
        text_detail_detail.setText(headlines.getDescription());
        text_detail_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).into(img_detail_news);
    }
}