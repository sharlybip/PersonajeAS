package com.example.jcarl.personaje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class InicioActivity extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {
                Intent intent = new Intent(InicioActivity.this, InstruccionesActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
     }
}
