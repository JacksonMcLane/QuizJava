package com.example.quizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    private TextView textViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        wireWidgets();
        Intent lastIntent = getIntent();
        int score = lastIntent.getIntExtra(MainActivity.EXTRA_SCORE, 0);
        Log.d("End Activity", "onCreate: " + score);
        textViewScore.setText(getString(R.string.score_textView) + score);
    }

    private void wireWidgets() {
        textViewScore = findViewById(R.id.textView_end_score);
    }
}
