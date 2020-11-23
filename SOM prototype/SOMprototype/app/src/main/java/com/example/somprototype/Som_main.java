package com.example.somprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class Som_main extends AppCompatActivity {
    Button Btn_message, Btn_theme, Btn_color, Btn_mate, Btn_movie;
    QuickContactBadge  profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_main);
    }
}
