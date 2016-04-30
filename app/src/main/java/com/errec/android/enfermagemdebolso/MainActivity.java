package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDropCalcButton();
        setupDictionaryButton();
    }

    private void setupDropCalcButton() {

        startActivity(new Intent(MainActivity.this, DropCalc.class));
    }

    private void setupDictionaryButton() {

        startActivity(new Intent(MainActivity.this, MedicalDictionary.class));
    }


}
