package com.google.example.CourtCounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAscore;
    int TeamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus3TeamA(View view) {
        TeamAscore += 3;
        displayTeamA(TeamAscore);
    }

    public void plus2TeamA(View view) {
        TeamAscore += 2;
        displayTeamA(TeamAscore);
    }

    public void plus1TeamA(View view) {
        TeamAscore++;
        displayTeamA(TeamAscore);
    }

    private void displayTeamA(int score) {
        TextView Score = (TextView) findViewById(R.id.team_a_score);
        Score.setText(String.valueOf(score));
    }

    public void plus3TeamB(View view){
        TeamBScore +=3;
        displayTeamB(TeamBScore);
    }

    public void plus2TeamB(View view){
        TeamBScore +=2;
        displayTeamB(TeamBScore);
    }

    public void plus1TeamB(View view){
        TeamBScore++;
        displayTeamB(TeamBScore);
    }

    public void reset(View view){
        TeamAscore = 0;
        TeamBScore = 0;
        displayTeamA(TeamAscore);
        displayTeamB(TeamBScore);
    }

    private void displayTeamB(int score){
        TextView Score = (TextView) findViewById(R.id.team_b_score);
        Score.setText(String.valueOf(score));
    }

}
