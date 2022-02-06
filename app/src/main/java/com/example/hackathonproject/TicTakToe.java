package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class TicTakToe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tak_toe);
    }

    int board[][] = new int[3][3];
    int turn = 1;

    public void flip(ImageView i) {
        ImageView turnpic = (ImageView) findViewById(R.id.turn);
        if (turn == 1) {
            i.setImageResource(R.drawable.opic);
            turnpic.setImageResource(R.drawable.bturn);
            win();
            Timer timer;
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    botmove();
                    turnpic.setImageResource(R.drawable.pturn);
                }
            }, 2000);

        }
    }

    public void botmove() {
        if (board[0][0] == 0) {
            board[0][0] = 2;
            ImageView i = (ImageView) findViewById(R.id.a);
            i.setImageResource(R.drawable.xpic);
        } else if (board[0][1] == 0) {
            board[0][1] = 2;
            ImageView i = (ImageView) findViewById(R.id.b);
            i.setImageResource(R.drawable.xpic);
        } else if (board[0][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.c);
            i.setImageResource(R.drawable.xpic);
            board[0][2] = 2;
        } else if (board[1][0] == 0) {
            board[1][0] = 2;
            ImageView i = (ImageView) findViewById(R.id.d);
            i.setImageResource(R.drawable.xpic);
        } else if (board[2][0] == 0) {
            board[2][0] = 2;
            ImageView i = (ImageView) findViewById(R.id.g);
            i.setImageResource(R.drawable.xpic);
        } else if (board[1][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.e);
            i.setImageResource(R.drawable.xpic);
            board[1][1] = 2;
        } else if (board[2][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.h);
            i.setImageResource(R.drawable.xpic);
            board[2][1] = 2;
        } else if (board[1][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.f);
            i.setImageResource(R.drawable.xpic);
            board[1][2] = 2;
        } else if (board[2][2] == 0) {
            board[2][2] = 2;
            ImageView i = (ImageView) findViewById(R.id.i);
            i.setImageResource(R.drawable.xpic);
        }
        win();


    }

    public void win() {
        int winner = 0;
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != 0)
            winner = board[0][0];
        else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != 0)
            winner = board[1][0];
        else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != 0)
            winner = board[2][0];
        else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != 0)
            winner = board[0][0];
        else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != 0)
            winner = board[0][1];
        else if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != 0)
            winner = board[0][2];
        else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0)
            winner = board[0][0];
        else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0)
            winner = board[0][2];
            //TO DO: Complete the other 7 winning conditions
            //cat's game
        else if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 &&
                board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0 &&
                board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0)
            winner = 3;
        if (winner == 1) {
            Toast.makeText(getApplicationContext(), "You Win", Toast.LENGTH_SHORT).show();
            homeScreen();
        } else if (winner == 2) {
            Toast.makeText(getApplicationContext(), "Baymax Wins", Toast.LENGTH_SHORT).show();
            homeScreen();
        } else if (winner == 3) {
            Toast.makeText(getApplicationContext(), "Tie Game", Toast.LENGTH_SHORT).show();
            homeScreen();
        }
    }

    public void homeScreen(){
        Intent i = new Intent(TicTakToe.this, HomeScreen.class);
        startActivity(i);
    }

    public void aClick(View view) {
        if (board[0][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.a);
            board[0][0] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void bClick(View view) {
        if (board[0][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.b);
            board[0][1] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void cClick(View view) {
        if (board[0][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.c);
            board[0][2] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void dClick(View view) {
        if (board[1][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.d);
            board[1][0] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void eClick(View view) {
        if (board[1][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.e);
            board[1][1] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void fClick(View view) {
        if (board[1][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.f);
            board[1][2] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void gClick(View view) {
        if (board[2][0] == 0) {
            ImageView i = (ImageView) findViewById(R.id.g);
            board[2][0] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void hClick(View view) {
        if (board[2][1] == 0) {
            ImageView i = (ImageView) findViewById(R.id.h);
            board[2][1] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void iClick(View view) {
        if (board[2][2] == 0) {
            ImageView i = (ImageView) findViewById(R.id.i);
            board[2][2] = turn;
            flip(i);
        } else {
            Toast.makeText(getApplicationContext(), "Place already taken", Toast.LENGTH_SHORT).show();
        }
        win();
    }

    public void reset(View view) {
        ImageView a = (ImageView) findViewById(R.id.a);
        a.setImageResource(R.drawable.blank);
        ImageView b = (ImageView) findViewById(R.id.b);
        b.setImageResource(R.drawable.blank);
        ImageView c = (ImageView) findViewById(R.id.c);
        c.setImageResource(R.drawable.blank);
        ImageView d = (ImageView) findViewById(R.id.d);
        d.setImageResource(R.drawable.blank);
        ImageView e = (ImageView) findViewById(R.id.e);
        e.setImageResource(R.drawable.blank);
        ImageView f = (ImageView) findViewById(R.id.f);
        f.setImageResource(R.drawable.blank);
        ImageView g = (ImageView) findViewById(R.id.g);
        g.setImageResource(R.drawable.blank);
        ImageView h = (ImageView) findViewById(R.id.h);
        h.setImageResource(R.drawable.blank);
        ImageView i = (ImageView) findViewById(R.id.i);
        i.setImageResource(R.drawable.blank);
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                board[k][j] = 0;
            }
        }
    }


}