package com.example.somprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Som_mymate4 extends AppCompatActivity {
    Button Btn_copy ,Btn_face , Btn_twit, Btn_insta, Btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_mymate4);
        Btn_home = (Button)findViewById(R.id.Btn_home);
        Btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        Som_main.class);
                startActivity(intent);
            }
        });
        Btn_twit = (ImageButton)findViewById(R.id.Btn_twit);
            public void sharetwitter() {
                String strLink = null;
                try {
                    strLink = String.format("http://twitter.com/intent/tweet?text=%s",
                            URLEncoder.encode("공유할 텍스트를 입력하세요","utf-8"));//my mate ativity 4번창 이미지 캡쳐로 넘겨서 공유해야됨
                } catch (UnsupportedEncodingException e1){
                    e1.printStackTrace();
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strLink));
                startActivity(intent);
            }
        };
        // facebook 공유로 바꿔야함
        Btn_face = (ImageButton)findViewById(R.id.Btn_face);
        public void sharefacebook() {
            String strLink = null;
            try {
                strLink = String.format("http://twitter.com/intent/tweet?text=%s",
                        URLEncoder.encode("공유할 텍스트를 입력하세요","utf-8"));//my mate ativity 4번창 이미지 캡쳐로 넘겨서 공유해야됨
            } catch (UnsupportedEncodingException e1){
                e1.printStackTrace();
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strLink));
            startActivity(intent);
        };
        // facebook 공유로 바꿔야함
        Btn_insta = (ImageButton)findViewById(R.id.Btn_insta);
        public void shareinstagram() {
            String strLink = null;
            try {
                strLink = String.format("http://twitter.com/intent/tweet?text=%s",
                        URLEncoder.encode("공유할 텍스트를 입력하세요","utf-8"));//my mate ativity 4번창 이미지 캡쳐로 넘겨서 공유해야됨
            } catch (UnsupportedEncodingException e1){
                e1.printStackTrace();
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strLink));
            startActivity(intent);
        };
        // 링크 공유로 바꿔야함
        Btn_copy = (ImageButton)findViewById(R.id.Btn_copy);
        public void sharecopylink() {
            String strLink = null;
            try {
                strLink = String.format("http://twitter.com/intent/tweet?text=%s",
                        URLEncoder.encode("공유할 텍스트를 입력하세요","utf-8"));//my mate ativity 4번창 이미지 캡쳐로 넘겨서 공유해야됨
            } catch (UnsupportedEncodingException e1){
                e1.printStackTrace();
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strLink));
            startActivity(intent);
        };
    };


