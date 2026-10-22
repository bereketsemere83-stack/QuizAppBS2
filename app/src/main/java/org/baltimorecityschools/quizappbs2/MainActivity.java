package org.baltimorecityschools.quizappbs2;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    Question q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
    Question currentq;
    String message;
    int questionNumber;
    Question[] questions;
    ImageView flagIV;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Initialize variables & inflate UI elements
        trueBTN = (Button) findViewById(R.id.trueBTN);
        falseBTN = (Button) findViewById(R.id.falseBTN);
        submitBTN = (Button) findViewById(R.id.SubmitBTN);
        questionTV = (TextView) findViewById(R.id.questionTV);
        flagIV = (ImageView) findViewById(R.id.flagIV);
        score = 0;
        questionNumber = 0;


        q1 = new Question("This is the flag of Brazil.", true,R.drawable.brazil);
        q2 = new Question("This is the flag of Peru.", false, R.drawable.canada);
        q3 = new Question("This is the flag of United States.", true,R.drawable.usa);
        q4 = new Question("This is the flag of Argentina.", true, R.drawable.argentina);
        q5 = new Question("This is the flag of France.", false,R.drawable.russia);
        q6 = new Question("This is the flag of Norway.", false,R.drawable.swiss);
        q7 = new Question("This is the flag of Eritrea.", true,R.drawable.eritrea);
        q8 = new Question("This is the flag of Sudan.", false,R.drawable.southafrica);
        q9 = new Question("This is the flag of Spain.", false,R.drawable.india);
        q10 = new Question("This is the flag of Congo.", true,R.drawable.congo);
        questions = new Question[]{
                q1, q2, q3, q4, q5, q6, q7, q8, q9, q10

        };
        currentq = questions[0];
        questionTV.setText(currentq.getquestionprompt());
        flagIV.setImageResource(currentq.getImage());


                // 3. Do stuff
        // 3a. when the user clicks the True button,
        trueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentq.getcorrectAns() == true) {
                    message = getString(R.string.right_msg);
                    score = score + 1;
                }
                else {
                    message = getString(R.string.wrong_msg);
                }
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, message, duration);
                toast.show();

            }
        });


        falseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentq.getcorrectAns() == false) {
                    message = getString(R.string.right_msg);
                    score = score + 1;
                }
                else {
                    message = getString(R.string.wrong_msg);
                }
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, message, duration);
                toast.show();

            }
        });


        // NEXT BUTTON
        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionNumber < questions.length - 1) {
                    questionNumber = questionNumber + 1;
                    currentq = questions[questionNumber];
                    questionTV.setText(currentq.getquestionprompt());
                    flagIV.setImageResource(currentq.getImage());

                }
                else {
                    Intent goTOScoreIntent = new Intent(MainActivity.this, ScoreActivity2.class);
                    goTOScoreIntent.putExtra("score", score);
                    startActivity(goTOScoreIntent);

                }

            }
        });

    }

}




