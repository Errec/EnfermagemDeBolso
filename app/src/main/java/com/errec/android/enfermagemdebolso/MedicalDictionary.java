package com.errec.android.enfermagemdebolso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MedicalDictionary extends AppCompatActivity {

    private List<Dictionary> medicalTerm = new ArrayList<Dictionary>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_dictionary);

        populateDictionaryList();
        populateListView();
    }

    private void populateDictionaryList() {

        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid, "Curativo"));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao"));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento"));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento"));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));
        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid, "Curativo"));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao"));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento"));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento"));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));
        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid, "Curativo"));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao"));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento"));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento"));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));
        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid, "Curativo"));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao"));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento"));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento"));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));
        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid, "Curativo"));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao"));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento"));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento"));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));
        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid, "Curativo"));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao"));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento"));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento"));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade"));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento"));

    }

    private void populateListView() {
        ArrayAdapter<Dictionary> adapter = new listAdapter();
        ListView list = (ListView) findViewById(R.id.dictionaryListView);
        list.setAdapter(adapter);

    }

    private class listAdapter extends ArrayAdapter<Dictionary> {
        public listAdapter() {
            super(MedicalDictionary.this, R.layout.item_view, medicalTerm);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            //garantir que nao seja null e que sempre exista uma view para ser inserida
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
            }

            // encontrar o objeto a ser inserido
            Dictionary currentMedicalTerm = medicalTerm.get(position);

            //preencher a view
            ImageView imageView = (ImageView) itemView.findViewById(R.id.item_imgIconID);
            imageView.setImageResource(currentMedicalTerm.getIconID());

            TextView nameText = (TextView) itemView.findViewById(R.id.item_txtName);
            nameText.setText(currentMedicalTerm.getName());

            TextView categoryText = (TextView) itemView.findViewById(R.id.item_txtCategory);
            categoryText.setText(currentMedicalTerm.getCategory());

            return itemView;
        }
    }

}
