package com.example.aviatorsignals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TermsAndCondtions extends AppCompatActivity {

    private Button accept ,decline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condtions);

        accept =findViewById(R.id.acceptId);
        decline=findViewById(R.id.decline);

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent vn = new Intent(TermsAndCondtions.this, WelcomeActivity.class);
                startActivity(vn);

            }
        });
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(TermsAndCondtions.this, BetActivity.class);
                startActivity(v);
            }
        });
    }
}