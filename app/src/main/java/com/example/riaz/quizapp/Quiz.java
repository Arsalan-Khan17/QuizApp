package com.example.riaz.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void backClicked(View view)
    {
        Intent i = new Intent(this, StudentLogin.class);
        startActivity(i);
    }

    public void homeClicked(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void optionOne(View view) {
        Toast.makeText(this, "Option 1 is clicked", Toast.LENGTH_SHORT).show();
    }

    public void optionTwo(View view) {
        Toast.makeText(this, "Option 2 is clicked", Toast.LENGTH_SHORT).show();
    }

    public void optionThree(View view) {
        Toast.makeText(this, "Option 3 is clicked", Toast.LENGTH_SHORT).show();
    }

    public void optionFour(View view) {
        Toast.makeText(this, "Option 4 is clicked", Toast.LENGTH_SHORT).show();
    }

}
