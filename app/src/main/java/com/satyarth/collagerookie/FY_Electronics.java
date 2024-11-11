package com.satyarth.collagerookie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FY_Electronics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fy_electronics);

        PDFView pdfView = findViewById(R.id.electronics);
        pdfView.fromAsset("Electronics Quantum 1st Year.pdf").load();
    }
}