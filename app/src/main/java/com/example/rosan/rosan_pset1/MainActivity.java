package com.example.rosan.rosan_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import static android.view.View.VISIBLE;


public class MainActivity extends AppCompatActivity {

    private CheckBox checkHat;
    private CheckBox checkEars;
    private CheckBox checkEyes;
    private CheckBox checkArms;
    private CheckBox checkEyebrows;
    private CheckBox checkGlasses;
    private CheckBox checkMouth;
    private CheckBox checkMustache;
    private CheckBox checkNose;
    private CheckBox checkShoes;

    private ImageView hat;
    private ImageView ears;
    private ImageView eyes;
    private ImageView arms;
    private ImageView eyebrows;
    private ImageView glasses;
    private ImageView mouth;
    private ImageView mustache;
    private ImageView nose;
    private ImageView shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Stuff
        checkHat = (CheckBox) findViewById(R.id.checkBox1);

        checkEars = (CheckBox) findViewById(R.id.checkBox9);
        checkEyes = (CheckBox) findViewById(R.id.checkBox5);
        checkArms = (CheckBox) findViewById(R.id.checkBox8);
        checkEyebrows = (CheckBox) findViewById(R.id.checkBox3);
        checkGlasses = (CheckBox) findViewById(R.id.checkBox7);
        checkMouth = (CheckBox) findViewById(R.id.checkBox6);
        checkMustache = (CheckBox) findViewById(R.id.checkBox4);
        checkNose = (CheckBox) findViewById(R.id.checkBox2);
        checkShoes = (CheckBox) findViewById(R.id.checkBox10);

        hat = (ImageView) findViewById(R.id.Hat);
        ears = (ImageView) findViewById(R.id.Ears);
        eyes = (ImageView) findViewById(R.id.Eyes);
        arms = (ImageView) findViewById(R.id.Arms);
        eyebrows = (ImageView) findViewById(R.id.Eyebrows);
        glasses = (ImageView) findViewById(R.id.Glasses);
        mouth = (ImageView) findViewById(R.id.Mouth);
        mustache = (ImageView) findViewById(R.id.Mustache);
        nose = (ImageView) findViewById(R.id.Nose);
        shoes = (ImageView) findViewById(R.id.Shoes);
    }

    // When onSaveInstanceState is called "Bewaren"
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        int hatValue = hat.getVisibility();
        int noseValue = nose.getVisibility();
        int earsValue = ears.getVisibility();
        int eyesValue = eyes.getVisibility();
        int armsValue = arms.getVisibility();
        int browsValue = eyebrows.getVisibility();
        int glassesValue = glasses.getVisibility();
        int mouthValue = mouth.getVisibility();
        int mustacheValue = mustache.getVisibility();
        int shoesValue = shoes.getVisibility();

        outState.putInt("hatValue", hatValue);
        outState.putInt("noseValue", noseValue);
        outState.putInt("earsValue", earsValue);
        outState.putInt("eyesValue", eyesValue);
        outState.putInt("armsValue", armsValue);
        outState.putInt("browsValue", browsValue);
        outState.putInt("glassesValue", glassesValue);
        outState.putInt("mouthValue", mouthValue);
        outState.putInt("mustacheValue", mustacheValue);
        outState.putInt("shoesValue", shoesValue);
    }

    // To do when state is restored
    @Override
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);

        int hatRestored = inState.getInt("hatValue");
        int noseRestored = inState.getInt("noseValue");
        int earsRestored = inState.getInt("earsValue");
        int eyesRestored = inState.getInt("eyesValue");
        int armsRestored = inState.getInt("armsValue");
        int browsRestored = inState.getInt("browsValue");
        int glassesRestored = inState.getInt("glassesValue");
        int mouthRestored = inState.getInt("mouthValue");
        int mustacheRestored = inState.getInt("mustacheValue");
        int shoesRestored = inState.getInt("shoesValue");

        if (hatRestored == VISIBLE) {
            hat.setVisibility(VISIBLE);
        } else {
            hat.setVisibility(View.INVISIBLE);
        }

        if (noseRestored == VISIBLE) {
            nose.setVisibility(VISIBLE);
        } else {
            nose.setVisibility(View.INVISIBLE);
        }

        if (earsRestored == VISIBLE) {
            ears.setVisibility(VISIBLE);
        } else {
            ears.setVisibility(View.INVISIBLE);
        }

        if (eyesRestored == VISIBLE) {
            eyes.setVisibility(VISIBLE);
        } else {
            eyes.setVisibility(View.INVISIBLE);
        }

        if (armsRestored == VISIBLE) {
            arms.setVisibility(VISIBLE);
        } else {
            arms.setVisibility(View.INVISIBLE);
        }

        if (browsRestored == VISIBLE) {
            eyebrows.setVisibility(VISIBLE);
        } else {
            eyebrows.setVisibility(View.INVISIBLE);
        }

        if (glassesRestored == VISIBLE) {
            glasses.setVisibility(VISIBLE);
        } else {
            glasses.setVisibility(View.INVISIBLE);
        }

        if (mouthRestored == VISIBLE) {
            mouth.setVisibility(VISIBLE);
        } else {
            mouth.setVisibility(View.INVISIBLE);
        }

        if (mustacheRestored == VISIBLE) {
            mustache.setVisibility(VISIBLE);
        } else {
            mustache.setVisibility(View.INVISIBLE);
        }

        if (shoesRestored == VISIBLE) {
            shoes.setVisibility(VISIBLE);
        } else {
            shoes.setVisibility(View.INVISIBLE);
        }
    }


    public void HatChecked(View view) {
        if (checkHat.isChecked()) {
            hat.setVisibility(VISIBLE);
        } else {
            hat.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void NoseChecked(View view){
            if (checkNose.isChecked()) {
                nose.setVisibility(VISIBLE);
            } else {
                nose.setVisibility(ImageView.INVISIBLE);
            }
        }

    public void EarsChecked(View view) {
        if (checkEars.isChecked()) {
            ears.setVisibility(VISIBLE);
        } else {
            ears.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void EyesChecked(View view) {
        if (checkEyes.isChecked()) {
            eyes.setVisibility(VISIBLE);
        } else {
            eyes.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void ArmsChecked(View view) {
        if (checkArms.isChecked()) {
            arms.setVisibility(VISIBLE);
        } else {
            arms.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void BrowsChecked(View view) {
        if (checkEyebrows.isChecked()) {
            eyebrows.setVisibility(VISIBLE);
        } else {
            eyebrows.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void GlassesChecked(View view) {
        if (checkGlasses.isChecked()) {
            glasses.setVisibility(VISIBLE);
        } else {
            glasses.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void MouthChecked(View view) {
        if (checkMouth.isChecked()) {
            mouth.setVisibility(VISIBLE);
        } else {
            mouth.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void MustacheChecked(View view) {
        if (checkMustache.isChecked()) {
            mustache.setVisibility(VISIBLE);
        } else {
            mustache.setVisibility(ImageView.INVISIBLE);
        }
    }

    public void ShoesChecked(View view) {
        if (checkShoes.isChecked()) {
            shoes.setVisibility(VISIBLE);
        } else {
            shoes.setVisibility(ImageView.INVISIBLE);
        }
    }
}

