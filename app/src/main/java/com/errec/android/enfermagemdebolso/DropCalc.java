package com.errec.android.enfermagemdebolso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DropCalc extends AppCompatActivity {

    EditText etVolInput;
    EditText etTimeInput;
    EditText focusedView;
    private View.OnFocusChangeListener focusListener = new View.OnFocusChangeListener(){

        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus){
                focusedView = (EditText)v;
            } else {
                focusedView  = null;
            }
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_calc);

        etVolInput = (EditText) findViewById(R.id.edittext_volume);
        etTimeInput = (EditText) findViewById(R.id.edittext_time);

        ((EditText) findViewById(R.id.edittext_time)).setInputType(InputType.TYPE_NULL);
        ((EditText) findViewById(R.id.edittext_volume)).setInputType(InputType.TYPE_NULL);

        etVolInput.setOnFocusChangeListener(focusListener);
        etTimeInput.setOnFocusChangeListener(focusListener);

    }

    public void numClicked(View sender){
        Button bt = (Button) sender;
        focusedView.append(bt.getText());
    }

}
