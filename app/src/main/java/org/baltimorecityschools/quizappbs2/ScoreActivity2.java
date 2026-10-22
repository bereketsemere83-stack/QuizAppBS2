package org.baltimorecityschools.quizappbs2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScoreActivity2 extends AppCompatActivity {

    TextView scoreTV;
    int score;
    String scoreMessage;
    Intent incomingIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_score2);

        scoreTV = (TextView) findViewById(R.id.scoreTV);
        score = 0;

        incomingIntent = getIntent();
        score = incomingIntent.getIntExtra("score", 0);
        scoreMessage = "SCORE: " + score + "/10";

        scoreTV.setText(scoreMessage);



    }
}