package com.example.aviatorsignals;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class BetActivity extends AppCompatActivity {

    TextView odds , amount;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bet);

        odds=findViewById(R.id.oddsId);
        amount=findViewById(R.id.amountID);
        btn1=findViewById(R.id.btn);


        double multiplierResult = chooseMultiplier() / 2;
        double numberResult = chooseNumber();
        odds.setText(String.format("X", multiplierResult));
        amount.setText(String.format("R", numberResult));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAndDisplayResults();
            }
        });
    }

    private void generateAndDisplayResults() {
        double multiplierResult = chooseMultiplier() / 2;
        double numberResult = chooseNumber();

        odds.setText(String.format("x %.2f", multiplierResult));
        amount.setText(String.format("R %.2f", numberResult));

    }

    private double chooseMultiplier() {
        double multiplier = new Random().nextDouble() * (3 - 2) + 2;
        if (multiplier > 1.5) {
            multiplier = multiplier / 1;
        }
        return multiplier;
    }

    private double chooseNumber() {
        int number = new Random().nextInt(50) + 1;
        if (number > 15) {
            number = number / 1;
        }
        return number;
    }
}