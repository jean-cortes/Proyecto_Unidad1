package com.android.automotora;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Spinner extends AppCompatActivity {
    View spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra_vehiculos);
        spinner = findViewById(R.id.spinner);
    }
}
