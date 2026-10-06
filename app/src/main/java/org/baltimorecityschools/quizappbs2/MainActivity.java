package org.baltimorecityschools.quizappbs2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.color.utilities.Score;

public class MainActivity extends AppCompatActivity {

    // 1. Declare all variable
    Button trueBTN, falseBTN, submitBTN;
    TextView questionTV;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Initialize variables & inflate UI elements
        trueBTN = (Button) findViewById(R.id.trueBTN);
        falseBTN = (Button) findViewById(R.id.falseBTN);
        submitBTN = (Button) findViewById(R.id.SubmitBTN);
        questionTV =(TextView) findViewById(R.id.questionTV);
        score = 0;

        // 3. Do stuff
        // 3a. when the user clicks the True button,
        trueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3b. A popup should appear telling them they are wrong.
                String message = "Your are Right!";
                int duration = Toast.LENGTH_SHORT;
                Toast toastWrong = Toast.makeText(MainActivity.this, message, duration);
                toastWrong.show();
                score = score + 1;


            }
        });


        falseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3b. A popup should appear telling them they are wrong.
                String message = "Your are Wrong!";
                int duration = Toast.LENGTH_SHORT;
                Toast toastWrong = Toast.makeText(MainActivity.this, message, duration);
                toastWrong.show();


            }
        });
        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTOScoreIntent = new Intent(MainActivity.this, ScoreActivity2.class);
                goTOScoreIntent.putExtra("score", score);
                startActivity(goTOScoreIntent);

            }
        });




    }
}
