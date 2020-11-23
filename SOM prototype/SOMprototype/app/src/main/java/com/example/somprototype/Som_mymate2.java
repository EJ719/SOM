package com.example.somprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Som_mymate2 extends AppCompatActivity {
    Button Btn2;
//    CheckBox Chk7,Chk8,Chk9,Chk10,Chk11,Chk12,;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_mymate2);
    Btn2 = (Button)findViewById(R.id.Btn2);
    Btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(
                    getApplicationContext(),
                    Som_mymate3.class);
            startActivity(intent);

        }
    });
    }
}


