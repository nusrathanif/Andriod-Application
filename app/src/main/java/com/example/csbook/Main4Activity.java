package com.example.csbook;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Main4Activity extends AppCompatActivity {
PDFView book3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        book3=(PDFView) findViewById(R.id.pdf6);

        book3.fromAsset("dd.pdf").load();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
