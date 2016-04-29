package com.errec.android.enfermagemdebolso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MedicalDictionary extends AppCompatActivity {

    private List<Dictionary> medicalDictionary = new ArrayList<Dictionary>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_dictionary);

        populateDictionaryList();
//        ListView list1 = (ListView) findViewById(R.id.dictionary_list);
    }

    private void populateDictionaryList() {

        medicalDictionary.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid,"Curativo" ));
        medicalDictionary.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure,"Medicao" ));
        medicalDictionary.add(new Dictionary("Soro", R.drawable.dic_bottle,"Medicamento" ));
        medicalDictionary.add(new Dictionary("Viagra", R.drawable.dic_capsule,"Medicamento" ));
        medicalDictionary.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse,"Especialidade" ));
        medicalDictionary.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope,"Instrumento" ));

    }

}
