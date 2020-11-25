package com.example.som_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SomLogin extends AppCompatActivity {
    Button BtnLog, BtnSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_login);

        BtnLog =(Button)findViewById(R.id.BtnLog);
        BtnSign = (Button)findViewById(R.id.BtnSign);

        BtnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),som_RealMain.class);
                startActivity(intent);
            }
        });
        BtnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
    }
}
