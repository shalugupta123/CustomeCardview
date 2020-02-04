package com.droid.cardviewlib.Cardview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.droid.cardviewlib.R;


public class Card_Activity_Demo extends AppCompatActivity {

    Cardview_activity mcardaction;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cardview_activity);
        mcardaction=findViewById(R.id.cardaction);

        mcardaction.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
        mcardaction.setCardElevation(200);
        mcardaction.setOutlineAmbientShadowColor(getResources().getColor(R.color.black_overlay));
        mcardaction.setOutlineAmbientShadowColor(getResources().getColor(R.color.colorAttenDetail));
        mcardaction.setRadius(0);
    }
}
