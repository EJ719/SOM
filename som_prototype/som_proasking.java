package com.example.som_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class som_proasking extends AppCompatActivity {
    Button BtnChat,  BtnVoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_proasking);
        BtnChat = (Button)findViewById(R.id.BtnChat);
        BtnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),som_proasking2.class);
                startActivity(intent);
            }
        });
    }
}
