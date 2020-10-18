package com.example.my_1app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;


    public class Study3Activity extends AppCompatActivity {

        PDFView study1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_study3);

            study1=(PDFView) findViewById(R.id.pdfView1);
            study1.fromAsset("PHP.pdf").load();
        }
    }

