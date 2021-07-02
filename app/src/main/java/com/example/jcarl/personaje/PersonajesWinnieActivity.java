package com.example.jcarl.personaje;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class PersonajesWinnieActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Buho")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.buho)
                .build());
        addFragment(new Step.Builder().setTitle("Igor")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.burro)
                .build());
        addFragment(new Step.Builder().setTitle("Cangu")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.cangu)
                .build());
        addFragment(new Step.Builder().setTitle("Christopher Robin")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.christopher_robin)
                .build());
        addFragment(new Step.Builder().setTitle("Conejo")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.conejo)
                .build());
        addFragment(new Step.Builder().setTitle("Gopher")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.ghoper)
                .build());
        addFragment(new Step.Builder().setTitle("Winnie Pooh")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.miel)
                .build());
        addFragment(new Step.Builder().setTitle("Piglet")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.piglet)
                .build());
        addFragment(new Step.Builder().setTitle("Rito")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.rito)
                .build());
        addFragment(new Step.Builder().setTitle("Tiger")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#f57904"))
                .setDrawable(R.drawable.tiger)
                .build());

        setPrevText("");
        setNextText("");
        setFinishText("");
        setCancelText("");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            Intent intent = new Intent(PersonajesWinnieActivity.this, PrincipalWinnieActivity.class);
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