package com.example.jcarl.personaje;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class PersonajesDoraActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPrevText("");
        setNextText("");
        setFinishText("");
        setCancelText("");
        addFragment(new Step.Builder().setTitle("Benny")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.benny)
                .build());
        addFragment(new Step.Builder().setTitle("Botas")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.botas)
                .build());
        addFragment(new Step.Builder().setTitle("Caracol")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.caracol)
                .build());
        addFragment(new Step.Builder().setTitle("Diego")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.diego)
                .build());
        addFragment(new Step.Builder().setTitle("Dora")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.dorasf)
                .build());
        addFragment(new Step.Builder().setTitle("Grillo")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.grillo)
                .build());
        addFragment(new Step.Builder().setTitle("Isa")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.isa)
                .build());
        addFragment(new Step.Builder().setTitle("Leon")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.leon)
                .build());
        addFragment(new Step.Builder().setTitle("Mapa")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.mapa)
                .build());
        addFragment(new Step.Builder().setTitle("Mochila")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.mochila)
                .build());
        addFragment(new Step.Builder().setTitle("Sapo")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.sapo)
                .build());
        addFragment(new Step.Builder().setTitle("Tico")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.tico)
                .build());
        addFragment(new Step.Builder().setTitle("Troll")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.troll)
                .build());
        addFragment(new Step.Builder().setTitle("Tucan")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.tucan)
                .build());
        addFragment(new Step.Builder().setTitle("Zorro")
                //.setContent("")
                .setBackgroundColor(Color.parseColor("#bdaa3d"))
                .setDrawable(R.drawable.zorro)
                .build());


    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == event.KEYCODE_BACK){
            Intent intent = new Intent(PersonajesDoraActivity.this, PrincipalDoraActivity.class);
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