package com.errec.android.enfermagemdebolso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Legis extends AppCompatActivity {

    public static final String KEY_PNAB = "pdf_PNAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legis);

        pdfPNAB();
    }

    private void pdfPNAB() {
        ImageView imagePNAB = (ImageView) findViewById(R.id.pdf_image_PNAB);
        TextView textPNAB = (TextView) findViewById(R.id.pdf_text_PNAB);

        final String linkTo = "189.28.128.100/dab/docs/publicacoes/geral/pnab.pdf";

        imagePNAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Legis.this, PDF.class);
                intent.putExtra(KEY_PNAB, linkTo);

                startActivity(intent);
            }
        });

        textPNAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Legis.this, PDF.class);
                intent.putExtra(KEY_PNAB, linkTo);

                startActivity(intent);
            }
        });
    }


}

//TODO: arraylist string of links