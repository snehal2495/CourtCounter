package com.example.blee.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int teamScoreA=0;
    int teamScoreB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void addThreePoints(View view){
        teamScoreA=teamScoreA+3;
        scoreforTeamA(teamScoreA);

    }

    public void addThreePointsB(View view){
        teamScoreB=teamScoreB+3;
        scoreForTeamB(teamScoreB);

    }


    public void addTwoPoints(View view){
        teamScoreA=teamScoreA+2;
        scoreforTeamA(teamScoreA);
    }

    public void addTwoPointsB(View view){
        teamScoreB=teamScoreB+2;
        scoreForTeamB(teamScoreB);
    }

    public void addOnePoints(View view){
        teamScoreA=teamScoreA+1;
        scoreforTeamA(teamScoreA);

    }
    public void addOnePointsB(View view){
       teamScoreB=teamScoreB+1;
        scoreForTeamB(teamScoreB);

    }



    public void scoreforTeamA(int score)
    {
        TextView scoreText=(TextView) findViewById(R.id.textview2);
        scoreText.setText(String.valueOf(score));


    }

    public void scoreForTeamB(int scoreB)
    {
        TextView scoreb=(TextView)findViewById(R.id.textview4);
        scoreb.setText(String.valueOf(scoreB));
    }

    public void resetScore(View view)
    {
        TextView winner=(TextView)findViewById(R.id.textviewwinner);
        winner.setText("");
        teamScoreA=0;
        teamScoreB=0;



        scoreforTeamA(teamScoreA);
        scoreForTeamB(teamScoreB);
    }

    public void winnerTeam(View v)
    {

        TextView winner=(TextView)findViewById(R.id.textviewwinner);

        if(teamScoreA>teamScoreB)


        {
            winner.setText("Congrats Team A");
        }else
            winner.setText("Congrats Team B");


    }




}
