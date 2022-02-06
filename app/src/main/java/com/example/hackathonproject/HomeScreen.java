package com.example.hackathonproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void BayScreen(View view) {
        Intent i = new Intent(HomeScreen.this, BayMaxScreen.class);
        startActivity(i);
    }

    public void GameScreen(View view) {
        Intent i = new Intent(HomeScreen.this, TicTakToe.class);
        startActivity(i);
    }

    public void activitiesScreen(View view) {
        Intent i = new Intent(HomeScreen.this, ActivityScreen.class);
        startActivity(i);
    }
}