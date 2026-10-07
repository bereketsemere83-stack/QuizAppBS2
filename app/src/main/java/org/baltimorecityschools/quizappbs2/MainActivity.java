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
    Question q1, q2, q3, q4, q5, q6, q7,q8, q9, q10;



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

        q1 = new Question("8 * 6  =  48",  true );
        q2 = new Question(" 7 * 5 = 30",  false );
        q3 = new Question("9 * 4 = 36", true);
        q4 = new Question(" 6 * 7 = 40", false);
        q5 = new Question(" 72/8  = 9  ", true);
        q6 = new Question(" 12/3  =  4", true);
        q7 = new Question(" 56/8 = 7  ", true);
        q8 = new Question(" 35/5  =  6 ", false);
        q9 = new Question(" 42/7  =  8", false);
        q10 = new Question("11 * 3 = 33", true);




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
