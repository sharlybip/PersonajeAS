package com.example.jcarl.personaje;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class JuegoWinnieActivity extends AppCompatActivity {
    private TextView Puntos, Contador, Vidas;
    private ImageView iv_personaje;
    private EditText txtPersonaje;
    private Button Confirmar;
    int numero_aleatorio = (int)(Math.random()*9);
    int puntos = 0;
    int contador = 0;
    int vidas = 3;
    private MediaPlayer mp_bien, mp_mal;

    String nom_personaje[] = {"buho","igor","cangu","christopher robin","conejo","ghoper","miel","piglet","rito","tiger"};
    String img_personaje[] = {"buho","burro","cangu","christopher_robin","conejo","ghoper","winnie pooh","piglet","rito","tiger"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_winnie);

        Puntos =(TextView)findViewById(R.id.txtPuntos);
        Contador =(TextView)findViewById(R.id.txtContador);
        Vidas =(TextView)findViewById(R.id.txtVidas);
        iv_personaje =(ImageView)findViewById(R.id.ivPersonaje);
        txtPersonaje =(EditText) findViewById(R.id.txtPersonaje);
        Confirmar =(Button) findViewById(R.id.verificar);
        int id;

        mp_bien = MediaPlayer.create(this,R.raw.acierto);
        mp_mal = MediaPlayer.create(this,R.raw.fallo);

        imagenPersonaje(numero_aleatorio);
        txtPersonaje.setText(numero_aleatorio+" ");
        Confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(txtPersonaje.getWindowToken(), 0);
                String nomPersonaje = txtPersonaje.getText().toString().toLowerCase();

                if(nomPersonaje.equals(nom_personaje[numero_aleatorio])){
                    mp_bien.start();
                    puntos+= 1;
                    Puntos.setText("Puntos: " + puntos);
                    txtPersonaje.setText("");
                    if(puntos == 2){
                        startActivity(new Intent(JuegoWinnieActivity.this,EmergenteActivity.class));
                    }
                }else{
                    mp_mal.start();
                    vidas-= 1;
                    Vidas.setText("Vidas: " + vidas);
                    txtPersonaje.setText("");
                    if(vidas == 0){
                        startActivity(new Intent(JuegoWinnieActivity.this,PerdisteActivity.class));
                    }
                }
                if (vidas == 0 || puntos == 2){
                    finish();
                }
                regresiva();
            }
        });
        if (numero_aleatorio == 0 ){
            id =  getResources().getIdentifier(  "buho","drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 1 ){
            id =  getResources().getIdentifier("burro", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 2 ){
            id =  getResources().getIdentifier( "cangu","drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 3 ){
            id =  getResources().getIdentifier("christopher_robin", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 4 ){
            id =  getResources().getIdentifier("conejo", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 5){
            id =  getResources().getIdentifier("ghoper", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 6){
            id =  getResources().getIdentifier("tiger", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio ==7 ){
            id =  getResources().getIdentifier( "miel", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }else if (numero_aleatorio == 8){
            id =  getResources().getIdentifier("piglet", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }
    }
    void regresiva(){
        new CountDownTimer(2000,1){

            @Override
            public void onTick(long l) {
                Contador.setText("" +  l/1000);
                Confirmar.setVisibility(View.GONE);
                txtPersonaje.setVisibility(View.GONE);
            }

            @Override
            public void onFinish() {
                Confirmar.setVisibility(View.VISIBLE);
                txtPersonaje.setVisibility(View.VISIBLE);
                numero_aleatorio = (int)(Math.random()*9);
                Contador.setText("");
                imagenPersonaje(numero_aleatorio);

            }
        }.start();
    }
    void imagenPersonaje(int numero){
        int id = getResources().getIdentifier(img_personaje[numero],"drawable",getPackageName());
        iv_personaje.setImageResource(id);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            Intent intent = new Intent(JuegoWinnieActivity.this, PrincipalWinnieActivity.class);
            startActivity(intent);
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}