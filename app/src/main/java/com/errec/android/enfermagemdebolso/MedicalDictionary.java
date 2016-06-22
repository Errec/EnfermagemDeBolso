package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class MedicalDictionary extends AppCompatActivity {

    public static final String KEY_NAME = "term_name";
    public static final String KEY_DESCRIPTION = "term_description";

    private List<Dictionary> medicalTerm = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_dictionary);

        populateDictionaryList();
        populateListView();
        itemOnClick();
    }

    private void populateDictionaryList() {

        String testString = "Isso é um teste, vamos ver se funciona aboasdhasj" +
                " aksdhakj ajsbdmsadhb madshbmad,ajsbmda hasdbmsa, teste" +
                " teste 1 2 3 teste tesahdaskj shdgashd absi opasdm as ikasd ,ka " +
                "nda? amidhai  napopas nmeso oa fppa aolk ks a asmkkl;am l";

        medicalTerm.add(new Dictionary("Bandaid 5000", R.drawable.dic_bandaid,"Medicamento", "item 0" + testString));
        medicalTerm.add(new Dictionary("Pressao Snaguinea", R.drawable.dic_blood_pressure, "Medicao", "item 1" + testString));
        medicalTerm.add(new Dictionary("Soro", R.drawable.dic_bottle, "Medicamento", "item 2" + testString));
        medicalTerm.add(new Dictionary("Viagra", R.drawable.dic_capsule, "Medicamento", testString));
        medicalTerm.add(new Dictionary("Socorrista de gatos", R.drawable.dic_nurse, "Especialidade", "item abacate" + testString));
        medicalTerm.add(new Dictionary("Estetpscopio", R.drawable.dic_sthetoscope, "Instrumento", "item 4" + testString));

    }

    private void populateListView() {
        ArrayAdapter<Dictionary> adapter = new listAdapter();
        ListView list = (ListView) findViewById(R.id.dictionaryListView);
        list.setAdapter(adapter);
    }

    private void itemOnClick(){

        ListView list = (ListView) findViewById(R.id.dictionaryListView);
        if(list != null){
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked,
                                    int position, long id) {

                Dictionary clickedTerm = medicalTerm.get(position);

                Intent intent = new Intent(getApplicationContext(), PopupDictionary.class);
                intent.putExtra(KEY_NAME, clickedTerm.getName());
                intent.putExtra(KEY_DESCRIPTION, clickedTerm.getDescription());

                startActivity(intent);
            }
        });}

    }

    private class listAdapter extends ArrayAdapter<Dictionary> {
        public listAdapter() {
            super(MedicalDictionary.this, R.layout.item_view, medicalTerm);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
            }

            Dictionary currentMedicalTerm = medicalTerm.get(position);

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

//TODO: database