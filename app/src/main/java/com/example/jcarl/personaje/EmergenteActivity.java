package com.example.jcarl.personaje;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;

public class EmergenteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergente);
        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);
        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;
        getWindow().setLayout((int) (ancho * 0.85), (int) (alto * 0.5));
        new CountDownTimer(2000,1){

            @Override
            public void onTick(long millisUntilFinished) {
                JuegoAvengersActivity lp = new JuegoAvengersActivity();
                lp.finish();
            }
            @Override
            public void onFinish() {
                finish();
            }
        }.start();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            /*Intent intent = new Intent(EmergenteActivity.this, MenuJuegosActivity.class);
            startActivity(intent);*/
            this.finish();

        }
        return super.onKeyDown(keyCode, event);
    }
}