package com.example.team8_som;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View showDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] selectedItem = {0};

        showDialog = findViewById(R.id.click1);
        showDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String[] items = new String[]{"주 1회 진행 \n 월(오후 1:00 ~ 3:00)", "주 2회 진행 \n 화(오후 3:00 ~ 5:00), 금(오후 3:00 ~ 5:00)", "주 1회 진행 \n 토(오전 10:00 ~ 12:00)"};
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog .setTitle("원하시는 일정을 선택해주세요")
                        .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                selectedItem[0] = which;

                            }
                        })
                        .setPositiveButton("예약하기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, items[selectedItem[0]], Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "취소 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.create();
                dialog.show();
            }
        });
    }
}