package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    TextView textDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString(Intent.EXTRA_TEXT);

        textDetail = findViewById(R.id.information_detail);
        textDetail.setText(text);

        

        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}