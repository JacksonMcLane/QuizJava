package com.example.quizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    private TextView textViewScore;
    private Button buttonRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        wireWidgets();
        setListeners();
        Intent lastIntent = getIntent();
        int score = lastIntent.getIntExtra(MainActivity.EXTRA_SCORE, -1);
        textViewScore.setText(getString(R.string.score_textView) + score + "/10");
    }

    private void setListeners() {
        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }

    private void wireWidgets() {
        textViewScore = findViewById(R.id.textView_end_score);
        buttonRestart = findViewById(R.id.button_end_restart);
    }
}
