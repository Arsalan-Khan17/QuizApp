package com.example.riaz.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddQuizViewResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quiz_view_result);
    }

    public void backClicked(View view)
    {
        Intent i = new Intent(this, TeacherLogin.class);
        startActivity(i);
    }

    public void homeClicked(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void AddQuizOptionClick(View view)
    {
        Intent i = new Intent(this, CreateQuiz.class);
        startActivity(i);
    }

    public void ViewResultOptionClick(View view)
    {
        Intent i = new Intent(this, Result.class);
        startActivity(i);
    }
}
