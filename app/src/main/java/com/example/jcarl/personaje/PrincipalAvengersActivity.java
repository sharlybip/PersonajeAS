package com.example.jcarl.personaje;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PrincipalAvengersActivity extends AppCompatActivity {
    Button personajes;
    Button jugar;
    ImageView iv_personaje;
    private MediaPlayer mp;

    int numero_aleatorio = (int)(Math.random()*10);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_avengers);

        personajes = (Button)findViewById(R.id.btn_personajes);
        iv_personaje = (ImageView)(findViewById(R.id.personajeCambia));

        int id;
        if (numero_aleatorio == 0 || numero_aleatorio == 10){
            id =  getResources().getIdentifier("falcon", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 1 || numero_aleatorio == 9){
            id =  getResources().getIdentifier("doctor", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 2 || numero_aleatorio == 8){
            id =  getResources().getIdentifier("groot", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 3 || numero_aleatorio == 7){
            id =  getResources().getIdentifier("loki", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 4 || numero_aleatorio == 5 || numero_aleatorio == 6){
            id =  getResources().getIdentifier("nebula", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }
        mp = MediaPlayer.create(this,R.raw.avengers);
        mp.start();
        mp.setLooping(true);

        personajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                mp.release();
                Intent intent = new Intent(PrincipalAvengersActivity.this, PersonajesAvengersActivity.class);
                startActivity(intent);
            }

        });

        jugar= (Button)findViewById(R.id.btn_jugar);
        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                mp.release();
                Intent intent = new Intent(PrincipalAvengersActivity.this, JuegoAvengersActivity.class);
                startActivity(intent);
                finish();

            }

        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            Intent intent = new Intent(PrincipalAvengersActivity.this, MenuJuegosActivity.class);
            startActivity(intent);
            mp.stop();
            mp.release();
            finish();

        }
        return super.onKeyDown(keyCode, event);
    }


}