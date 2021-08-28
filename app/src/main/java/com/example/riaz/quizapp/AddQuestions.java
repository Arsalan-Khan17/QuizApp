package com.example.riaz.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_questions);
    }

    public void backClicked(View view)
    {
        Intent i = new Intent(this, CreateQuiz.class);
        startActivity(i);
    }

    public void homeClicked(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void NextQuestion(View view)
    {
        Toast.makeText(this, "Next Button is clicked", Toast.LENGTH_SHORT).show();
    }


    public void clickOk(View view) {
        Toast.makeText(this, "OK Button is clicked", Toast.LENGTH_SHORT).show();
    }
}
