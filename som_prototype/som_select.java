package com.example.som_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class som_select extends AppCompatActivity {

    Button Btn_jj, Btn_ya, Btn_bb, Btn_mr, Btn_di, Btn_etc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_select);

        Btn_jj = (Button)findViewById(R.id.Btn_jj);
        Btn_bb = (Button)findViewById(R.id.Btn_bb);
        Btn_ya = (Button)findViewById(R.id.Btn_ya);
        Btn_mr = (Button)findViewById(R.id.Btn_mr);
        Btn_di = (Button)findViewById(R.id.Btn_di);
        Btn_etc = (Button)findViewById(R.id.Btn_etc);

        Btn_jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
        Btn_bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
        Btn_ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
        Btn_mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
        Btn_di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
        Btn_etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),som_proasking.class);
                startActivity(intent);
            }
        });
    }
}
