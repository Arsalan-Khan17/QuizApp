package com.example.riaz.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CreateQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quiz);
    }

    public void backClicked(View view)
    {
        Intent i = new Intent(this, AddQuizViewResult.class);
        startActivity(i);
    }

    public void homeClicked(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void NewQuizCreated(View view)
    {
        Intent i = new Intent(this, AddQuestions.class);
        startActivity(i);
    }
}
