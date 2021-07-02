package com.example.jcarl.personaje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuJuegosActivity extends AppCompatActivity {

    ImageButton avengers, dora, simpsons, winnie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juegos);
        avengers = (ImageButton)findViewById(R.id.btn_avengers);
        dora = (ImageButton)findViewById(R.id.btn_dora);
        simpsons = (ImageButton)findViewById(R.id.btn_simpsons);
        winnie = (ImageButton)findViewById(R.id.btn_winnie);

        avengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuegosActivity.this, PrincipalAvengersActivity.class);
                startActivity(intent);
                }

        });
        dora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuegosActivity.this, PrincipalDoraActivity.class);
                startActivity(intent);
            }

        });
        simpsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuegosActivity.this, PrincipalSimpsonsActivity.class);
                startActivity(intent);
            }

        });
        winnie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuegosActivity.this, PrincipalWinnieActivity.class);
                startActivity(intent);
            }

        });
    }
}