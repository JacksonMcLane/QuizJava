package com.example.quizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    private TextView textViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        wireWidgets();
        Intent lastIntent = getIntent();
        //int score = lastIntent.getIntExtra(MainActivity.
    }

    private void wireWidgets() {
        textViewScore = findViewById(R.id.textView_end_score);
    }
}
