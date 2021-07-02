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

public class JuegoAvengersActivity extends AppCompatActivity {
    private TextView Puntos, Contador, Vidas;
    private ImageView iv_personaje;
    private EditText txtPersonaje;
    private Button Confirmar;
    int numero_aleatorio = (int) (Math.random() * 20);
    int puntos = 0;
    int contador = 0;
    int vidas = 3;
    private MediaPlayer mp_bien, mp_mal;

    String nom_personaje[] = {"antman", "capitan america", "capitana marvel", "doctor strange", "falcon", "groot", "hulk", "ironman", "loki", "maquina de guerra", "nebula", "ojo de halcon", "pantera negra", "peter quill", "rocket", "spiderman", "thanos", "thor", "vision", "viuda negra", "wanda"};
    String img_personaje[] = {"antman", "capitan_america", "capitana", "doctor", "falcon", "groot", "hulk", "ironman", "loki", "maquina_de_guerra", "nebula", "ojo_alcon", "pantera_negra", "peter", "rocket", "spiderman", "thanos", "thor", "vision", "viuda_negra", "wanda"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_avengers);

        Puntos = (TextView) findViewById(R.id.txtPuntos);
        Contador = (TextView) findViewById(R.id.txtContador);
        Vidas = (TextView) findViewById(R.id.txtVidas);
        iv_personaje = (ImageView) findViewById(R.id.ivPersonaje);
        txtPersonaje = (EditText) findViewById(R.id.txtPersonaje);
        Confirmar = (Button) findViewById(R.id.verificar);

        mp_bien = MediaPlayer.create(this, R.raw.acierto);
        mp_mal = MediaPlayer.create(this, R.raw.fallo);
        int id;
        imagenPersonaje(numero_aleatorio);
        Confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(txtPersonaje.getWindowToken(), 0);
                String nomPersonaje = txtPersonaje.getText().toString().toLowerCase();
                if (nomPersonaje.equals(nom_personaje[numero_aleatorio])) {
                    mp_bien.start();
                    puntos += 1;
                    Puntos.setText("Puntos: " + puntos);
                    txtPersonaje.setText("");
                    if (puntos == 2) {
                        startActivity(new Intent(JuegoAvengersActivity.this, EmergenteActivity.class));
                    }
                } else {
                    mp_mal.start();
                    vidas -= 1;
                    Vidas.setText("Vidas: " + vidas);
                    txtPersonaje.setText("");
                    if (vidas == 0) {
                        startActivity(new Intent(JuegoAvengersActivity.this, PerdisteActivity.class));
                    }
                }if (vidas == 0 || puntos == 2) {
                    finish();
                }

                regresiva();
            }
        });
        if (numero_aleatorio == 0) {
            id = getResources().getIdentifier("falcon", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 1) {
            id = getResources().getIdentifier("doctor", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 2) {
            id = getResources().getIdentifier("groot", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 3) {
            id = getResources().getIdentifier("loki", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 4) {
            id = getResources().getIdentifier("nebula", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 5) {
            id = getResources().getIdentifier("antman", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 6) {
            id = getResources().getIdentifier("capitan_america", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 7) {
            id = getResources().getIdentifier("capitana", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 8) {
            id = getResources().getIdentifier("hulk", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 9) {
            id = getResources().getIdentifier("ironman", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 10) {
            id = getResources().getIdentifier("maquina_de_guerra", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 11) {
            id = getResources().getIdentifier("ojo_alcon", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 12) {
            id = getResources().getIdentifier("pantera_negra", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 13) {
            id = getResources().getIdentifier("peter", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 14) {
            id = getResources().getIdentifier("rocket", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 15) {
            id = getResources().getIdentifier("spiderman", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 16) {
            id = getResources().getIdentifier("thanos", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 17) {
            id = getResources().getIdentifier("thor", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 18) {
            id = getResources().getIdentifier("vision", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        } else if (numero_aleatorio == 19) {
            id = getResources().getIdentifier("viuda_negra", "drawable", getPackageName());
            iv_personaje.setImageResource(id);
        }
    }

    void regresiva() {
        new CountDownTimer(2000, 1) {

            @Override
            public void onTick(long l) {
                Contador.setText("" + l / 100);
                Confirmar.setVisibility(View.GONE);
                txtPersonaje.setVisibility(View.GONE);
            }

            @Override
            public void onFinish() {
                Confirmar.setVisibility(View.VISIBLE);
                txtPersonaje.setVisibility(View.VISIBLE);
                numero_aleatorio = (int) (Math.random() * 20);
                Contador.setText("");
                imagenPersonaje(numero_aleatorio);

            }
        }.start();
    }

    void imagenPersonaje(int numero) {
        int id = getResources().getIdentifier(img_personaje[numero], "drawable", getPackageName());
        iv_personaje.setImageResource(id);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK) {
            Intent intent = new Intent(JuegoAvengersActivity.this, PrincipalAvengersActivity.class);
            startActivity(intent);
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}