package com.example.jcarl.personaje;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class PersonajesAvengersActivity extends TutorialActivity {
    ImageView slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        addFragment(new Step.Builder().setTitle("Antman")
                .setContent("El hombre hormiga, es un vengador")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.antman)
                .build());
        addFragment(new Step.Builder().setTitle("Capitan America")
                .setContent("El hombre hormiga, es un vengador")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.capitan_america)
                .build());
        addFragment(new Step.Builder().setTitle("Capitana Marvel")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.capitana)
                .build());
        addFragment(new Step.Builder().setTitle("Doctor Strange")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.doctor)
                .build());
        addFragment(new Step.Builder().setTitle("Falcon")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.falcon)
                .build());
        addFragment(new Step.Builder().setTitle("Groot")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.groot)
                .build());
        addFragment(new Step.Builder().setTitle("Hulk")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.hulk)
                .build());
        addFragment(new Step.Builder().setTitle("Ironman")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.ironman)
                .build());
        addFragment(new Step.Builder().setTitle("Loki")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.loki)
                .build());
        addFragment(new Step.Builder().setTitle("Maquina de guerra")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.maquina_de_guerra)
                .build());
        addFragment(new Step.Builder().setTitle("Nebula")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.nebula)
                .build());
        addFragment(new Step.Builder().setTitle("Ojo de Halcon")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.ojo_alcon)
                .build());
        addFragment(new Step.Builder().setTitle("Pantera Negra")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.pantera_negra)
                .build());
        addFragment(new Step.Builder().setTitle("Peter Quill")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.peter)
                .build());
        addFragment(new Step.Builder().setTitle("Rocket")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.rocket)
                .build());
        addFragment(new Step.Builder().setTitle("Spiderman")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.spiderman)
                .build());
        addFragment(new Step.Builder().setTitle("Thanos")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.thanos)
                .build());
        addFragment(new Step.Builder().setTitle("Thor")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.thor)
                .build());
        addFragment(new Step.Builder().setTitle("Vision")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.vision)
                .build());
        addFragment(new Step.Builder().setTitle("Viuda Negra")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#8f8b8b"))
                .setDrawable(R.drawable.viuda_negra)
                .build());

        setPrevText("");
        setNextText("");
        setFinishText("");
        setCancelText("");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){

            Intent intent = new Intent(PersonajesAvengersActivity.this, PrincipalAvengersActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);

    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}