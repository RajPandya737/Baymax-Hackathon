package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class BayMaxScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bay_max_screen);
        MediaPlayer hydt;
        hydt = MediaPlayer.create(BayMaxScreen.this, R.raw.hydt);
        hydt.start();
    }

    public void goodday(View view) {
        TextView t = (TextView) findViewById(R.id.Question);
        Button bg = (Button) findViewById(R.id.bg);
        Button bb = (Button) findViewById(R.id.bb);
        EditText e = (EditText) findViewById(R.id.edit);
        Button enter = (Button) findViewById(R.id.enterbutton);
        MediaPlayer tigth;
        tigth = MediaPlayer.create(BayMaxScreen.this, R.raw.tigth);
        tigth.start();

        t.setText("That is good to hear, I hope your happiness continues. Did you do any activities today?");
        bg.setVisibility(View.GONE);
        bb.setVisibility(View.GONE);
        e.setVisibility(View.VISIBLE);
        enter.setVisibility(View.VISIBLE);
    }

    public void enter(View view) {
        EditText e = (EditText) findViewById(R.id.edit);
        Button enter = (Button) findViewById(R.id.enterbutton);
        TextView t = (TextView) findViewById(R.id.Question);
        e.setVisibility(View.GONE);
        enter.setVisibility(View.GONE);
        MediaPlayer waoot;
        waoot = MediaPlayer.create(BayMaxScreen.this, R.raw.waoot);
        waoot.start();
        t.setText("Well, additional activities you could do are yoga, going for a walk, read a book, or dance to your favourite song. Anyone of these are great options.");
        Timer timer;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(BayMaxScreen.this, HomeScreen.class);
                startActivity(i);
                finish();
            }
        }, 4000);
    }

    public void badday(View view) {
        TextView t = (TextView) findViewById(R.id.Question);
        Button bg = (Button) findViewById(R.id.bg);
        Button bb = (Button) findViewById(R.id.bb);
        EditText e = (EditText) findViewById(R.id.edit);
        Button enter = (Button) findViewById(R.id.enterbutton);

        MediaPlayer oriio;
        oriio = MediaPlayer.create(BayMaxScreen.this, R.raw.oriio);
        oriio.start();

        t.setText("Ok, remember, it is ok to be sad, you do not have to feel embarrassed about anything. If you are feeling sad, I recommend you do a few activities. Have you done any so far?");
        bg.setVisibility(View.GONE);
        bb.setVisibility(View.GONE);
        e.setVisibility(View.VISIBLE);
        enter.setVisibility(View.VISIBLE);
    }

    public void home(View view) {
        Intent i = new Intent(BayMaxScreen.this, HomeScreen.class);
        startActivity(i);
    }
}