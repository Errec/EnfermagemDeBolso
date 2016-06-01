package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.errec.android.enfermagemdebolso.Quiz.KEY_ANSWER;

public class PopupAnswer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_answer);

        boolean checkAnswer = false;
        String result = "";

        Intent intent = getIntent();

        if (null != intent) {
            checkAnswer = getIntent().getExtras().getBoolean(KEY_ANSWER);
        }

        if (checkAnswer) {
            result = "Correto";
        } else {
            result = "Errado";
        }

        TextView popupAnswer = (TextView) findViewById(R.id.popup_answer_text);
        popupAnswer.setText(result);

    }
}
