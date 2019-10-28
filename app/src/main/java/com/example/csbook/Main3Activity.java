package com.example.csbook;

        import android.os.Bundle;

        import com.github.barteksc.pdfviewer.PDFView;
        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import com.google.android.material.snackbar.Snackbar;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;

        import android.view.View;

public class Main3Activity extends AppCompatActivity {
    PDFView book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        book2=(PDFView) findViewById(R.id.pdf6);

        book2.fromAsset("M.Sc. Computer Science   (For Colleges)_23.072019 (1).pdf").load();

    }

}
