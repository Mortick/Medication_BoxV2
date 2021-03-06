package com.example.medicationbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Button;

public class DocumentView extends AppCompatActivity {
    private Button toTheInsuranceCardChoice;
    private Button toThePerscriptionChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_choice);

        toTheInsuranceCardChoice = findViewById(R.id.toinsurancecard);
        toThePerscriptionChoice = findViewById(R.id.toperscription);
        FloatingActionButton home = findViewById(R.id.AddDocChoiceHome);


        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(DocumentView.this, Homepage.class);
                startActivity(i);
            }
        });

        toTheInsuranceCardChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toincard = new Intent(DocumentView.this, insure_upload_choice.class);
                startActivity(toincard);
            }
        });

        toThePerscriptionChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toperscrip = new Intent(DocumentView.this, perscrip_upload_choice.class);
                startActivity(toperscrip);
            }
        });


    }
}
