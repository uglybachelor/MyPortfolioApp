package com.example.zhouzhenghai.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_streamer:
                Toast.makeText(this, "This Button Will Launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(this, "This Button Will Launch Scores App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this, "This Button Will Launch Library App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger:
                Toast.makeText(this, "This Button Will Launch Build it Bigger!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz_reader:
                Toast.makeText(this, "This Button Will Launch XYZ Reader!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this, "This Button Will Launch My Capstone App!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
