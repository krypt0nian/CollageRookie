package com.satyarth.collagerookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSEngineering extends AppCompatActivity {
    private Button electronics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csengineering);
        electronics = findViewById(R.id.electronics);

        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(CSEngineering.this,FY_Electronics.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}