package com.example.jcarl.personaje;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class PersonajesSimpsonsActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(new Step.Builder().setTitle("Abuelo")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.abuelo)
                .build());
        addFragment(new Step.Builder().setTitle("Apu")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.apu)
                .build());
        addFragment(new Step.Builder().setTitle("Ayudante de santa")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.ayudante_de_santa)
                .build());
        addFragment(new Step.Builder().setTitle("Barney")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.barney)
                .build());
        addFragment(new Step.Builder().setTitle("Bart")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.bart)
                .build());
        addFragment(new Step.Builder().setTitle("Daly")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.daly)
                .build());
        addFragment(new Step.Builder().setTitle("Duffman")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.duffman)
                .build());
        addFragment(new Step.Builder().setTitle("flanders")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.flanders)
                .build());
        addFragment(new Step.Builder().setTitle("Krusty")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.krusty)
                .build());
        addFragment(new Step.Builder().setTitle("Maestra")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.maestra)
                .build());
        addFragment(new Step.Builder().setTitle("Maggie")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.magie)
                .build());
        addFragment(new Step.Builder().setTitle("Marge")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.marge)
                .build());
        addFragment(new Step.Builder().setTitle("Milhouse")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.milhouse)
                .build());
        addFragment(new Step.Builder().setTitle("Moe")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.moe)
                .build());
        addFragment(new Step.Builder().setTitle("Nelson")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.nelson)
                .build());
        addFragment(new Step.Builder().setTitle("Ralph")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.ralph)
                .build());
        addFragment(new Step.Builder().setTitle("Skinner")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.skinner)
                .build());
        addFragment(new Step.Builder().setTitle("Smithers")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.smithers)
                .build());
        addFragment(new Step.Builder().setTitle("Señor Berns")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.sr_berns)
                .build());
        addFragment(new Step.Builder().setTitle("Tomy")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#d4c707"))
                .setDrawable(R.drawable.tomy)
                .build());

        setPrevText("");
        setNextText("");
        setFinishText("");
        setCancelText("");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            Intent intent = new Intent(PersonajesSimpsonsActivity.this, PrincipalSimpsonsActivity.class);
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