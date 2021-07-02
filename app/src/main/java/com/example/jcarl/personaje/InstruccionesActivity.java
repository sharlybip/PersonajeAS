package com.example.jcarl.personaje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class InstruccionesActivity extends AppCompatActivity {

    Button saltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);
        saltar = (Button)findViewById(R.id.btn_saltar);

        saltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InstruccionesActivity.this, MenuJuegosActivity.class);
                startActivity(intent);
            }

        });
    }
    }

