package com.example.signuplogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLayout();
        setClick();
    }

    void setLayout() {
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
    }

    void setClick() {
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameFromDB = getIntent().getStringExtra("username");
                String nameFromDB = getIntent().getStringExtra("name");
                String emailFromDB = getIntent().getStringExtra("email");
                String passwordFromDB = getIntent().getStringExtra("password");

                Intent intent = new Intent(MainActivity.this, ProfieActivity.class);

                intent.putExtra("name", nameFromDB);
                intent.putExtra("email", emailFromDB);
                intent.putExtra("usename", usernameFromDB);
                intent.putExtra("password", passwordFromDB);

                startActivity(intent);

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LogbookActivity.class);
                startActivity(intent);
            }
        });
    }
}