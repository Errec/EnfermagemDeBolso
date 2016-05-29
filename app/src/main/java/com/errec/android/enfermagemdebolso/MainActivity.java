package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        setupDropCalcButton();
        setupDictionaryButton();
        setupQuizButton();
        setupNewsButton();
        setupLegisButton();
        setupVideoButton();
    }

    private void setupDropCalcButton() {
        ImageButton messageButton = (ImageButton)findViewById(R.id.bt_drop);
        messageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DropCalc.class));
            }
        });
    }

    private void setupDictionaryButton() {
        ImageButton messageButton = (ImageButton)findViewById(R.id.bt_dictionary);
        messageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MedicalDictionary.class));
            }
        });
    }

    private void setupQuizButton() {
        ImageButton messageButton = (ImageButton)findViewById(R.id.bt_quiz);
        messageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Quiz.class));
            }
        });
    }

    private void setupNewsButton() {
        Button messageButton = (Button)findViewById(R.id.bt_news);
        messageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, News.class));
            }
        });
    }

    private void setupLegisButton() {
        ImageButton messageButton = (ImageButton) findViewById(R.id.bt_legis);
        messageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Legis.class));
            }
        });
    }

    private void setupVideoButton() {
        ImageButton messageButton = (ImageButton)findViewById(R.id.bt_video);
        messageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, YouTubeVideo.class));
            }
        });
    }

}
