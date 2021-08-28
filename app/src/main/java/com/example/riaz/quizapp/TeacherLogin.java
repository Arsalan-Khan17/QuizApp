package com.example.riaz.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TeacherLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
    }

    public void backClicked(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void homeClicked(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void createAccountClicked(View view)
    {
        Intent i = new Intent(this, CreateNewAccount.class);
        startActivity(i);
    }

    public void loginClicked(View view)
    {
        Intent i = new Intent(this, AddQuizViewResult.class);
        startActivity(i);
    }
}
