package com.example.feedthecatbygrenka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView SText;
    Button GeneralO;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SText = (TextView) findViewById(R.id.ScoreText);
        GeneralO = (Button) findViewById(R.id.GeneralO);
        GeneralO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 10;
                SText.setText("" + score);
            }
        });
    }
}