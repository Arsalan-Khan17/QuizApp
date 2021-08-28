package com.example.riaz.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
    }

    public void clickSetting(View view)
    {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(this);
        popup.show();
    }
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId() == R.id.AboutUs){
            Toast.makeText(this, "About Us Selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.RateUs){
            Toast.makeText(this, "Rate Us Selected", Toast.LENGTH_SHORT).show();

            return true;
        }
        else if(item.getItemId() == R.id.Share){
            Toast.makeText(this, "Share Selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == R.id.Support){
            Toast.makeText(this, "Support Selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    public void teacherClicked(View view)
    {
        Intent i = new Intent(this, TeacherLogin.class);
        startActivity(i);
    }

    public void studentClicked(View view)
    {
        Intent i = new Intent(this, StudentLogin.class);
        startActivity(i);
    }


}
