package com.example.som_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class som_proasking2 extends AppCompatActivity {
    Button BtnPro, BtnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_proasking2);
        BtnRandom = (Button)findViewById(R.id.BtnRandom);
        BtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), som_reservation.class);
                startActivity(intent);
            }
        });
    }
}
