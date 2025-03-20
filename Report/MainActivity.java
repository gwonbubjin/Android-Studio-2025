package com.example.report;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private Button btnSubmit;
    private TextView tvRatingPrompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 레이아웃 연결

        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btn_submit);
        tvRatingPrompt = findViewById(R.id.tv_rating_prompt);

        btnSubmit.setOnClickListener(v -> {
        });
    }
}
