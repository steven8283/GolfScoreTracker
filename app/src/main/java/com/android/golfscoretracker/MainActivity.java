package com.android.golfscoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0, scorePlayerB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForPlayerA(int score) {
        TextView scoreView = findViewById(R.id.playerAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void doubleEagleForPlayerA(View view) {
        scorePlayerA -= 3;
        displayForPlayerA(scorePlayerA);
    }

    public void eagleForPlayerA(View view) {
        scorePlayerA -= 2;
        displayForPlayerA(scorePlayerA);
    }

    public void birdieForPlayerA(View view) {
        scorePlayerA -= 1;
        displayForPlayerA(scorePlayerA);
    }

    public void bogeyForPlayerA(View view) {
        scorePlayerA += 1;
        displayForPlayerA(scorePlayerA);
    }

    public void doubleBogeyForPlayerA(View view) {
        scorePlayerA += 2;
        displayForPlayerA(scorePlayerA);
    }

    public void tripleBogeyForPlayerA(View view) {
        scorePlayerA += 3;
        displayForPlayerA(scorePlayerA);
    }

    /*Player B Score Count*/

    public void displayForPlayerB(int score) {
        TextView scoreView = findViewById(R.id.playerBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void doubleEagleForPlayerB(View view) {
        scorePlayerB -= 3;
        displayForPlayerB(scorePlayerB);
    }

    public void eagleForPlayerB(View view) {
        scorePlayerB -= 2;
        displayForPlayerB(scorePlayerB);
    }

    public void birdieForPlayerB(View view) {
        scorePlayerB -= 1;
        displayForPlayerB(scorePlayerB);
    }

    public void bogeyForPlayerB(View view) {
        scorePlayerB += 1;
        displayForPlayerB(scorePlayerB);
    }

    public void doubleBogeyForPlayerB(View view) {
        scorePlayerB += 2;
        displayForPlayerB(scorePlayerB);
    }

    public void tripleBogeyForPlayerB(View view) {
        scorePlayerB += 3;
        displayForPlayerB(scorePlayerB);
    }

    /*Reset Button*/

    public void resetAllScores(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }


}
