package com.example.android.docplusplus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class Main5Activity extends AppCompatActivity {

    Spinner spinneruse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button subbtn =(Button)findViewById(R.id.subbtn);
        setContentView(R.layout.activity_main5);
        spinneruse = (Spinner) findViewById(R.id.spinner);
        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
