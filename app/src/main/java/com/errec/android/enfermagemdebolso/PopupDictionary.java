package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

import static com.errec.android.enfermagemdebolso.MedicalDictionary.KEY_DESCRIPTION;
import static com.errec.android.enfermagemdebolso.MedicalDictionary.KEY_NAME;

public class PopupDictionary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_dictionary);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8), (int)(height*0.7) );

        String name = "";
        String description = "";

        Intent intent = getIntent();
        if (null != intent) {
            name = intent.getStringExtra(KEY_NAME);
            description = intent.getStringExtra(KEY_DESCRIPTION);
        }

        TextView popupName = (TextView) findViewById(R.id.popup_headline_Text);
        popupName.setText(name);

        TextView popupDescription = (TextView) findViewById(R.id.popup_body_Text);
        popupDescription.setText(description);

    }
}
//TODO: icon on top?