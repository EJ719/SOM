package com.example.somprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class Som_mymate1 extends AppCompatActivity {
    Button Btn1;
//  CheckBox Chk7,Chk8,Chk9,Chk10,Chk11,Chk12,;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1 = (Button)findViewById(R.id.Btn1);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        Som_mymate2.class);
                startActivity(intent);
            }
        });
    }
}

//            @Override
//            public void onCreate (Bundle savedInstanceState)
//            {
//                super.onCreate(savedInstanceState);
//                setContentView(R.layout.activity_main);
//
//
//                Chk1 = (CheckBox) findViewById(R.id.Chk1);
//                Chk1.setOnCheckedChangeListener(this);
//                Chk2 = (CheckBox) findViewById(R.id.Chk2);
//                Chk2.setOnCheckedChangeListener(this);
//                Chk3 = (CheckBox) findViewById(R.id.Chk3);
//                Chk3.setOnCheckedChangeListener(this);
//                Chk4 = (CheckBox) findViewById(R.id.Chk4);
//                Chk4.setOnCheckedChangeListener(this);
//                Chk5 = (CheckBox) findViewById(R.id.Chk5);
//                Chk5.setOnCheckedChangeListener(this);
//                Chk6 = (CheckBox) findViewById(R.id.Chk6);
//                Chk6.setOnCheckedChangeListener(this);
//            }
////
//
//            @Override
//            public void onCheckedChanged (CompoundButton buttonView;
//            buttonView,boolean isChecked)
//            {
//                //어레이 4개짜리 만들어서 1번 if 구문 만족하면 (체크하면) 첫번째 어레이 1 체크안하면 0 넣는 식으로 해서 16개로 나누는게 제일 최소이다.
//                // [0,0,0,0] = INTP , [0,1,1,1] = ISFJ , [0,0,1,1] = INFJ , [0,0,0,1] = INTJ
//                // [0,1,0,0] = ISTP , [0,1,1,0] = ISFP , [0,0,1,0] = INFP , [1,0,0,0] = ENTP
//                // [1,1,0,0] = ESTP , [1,1,1,0] = ESFP , [1,1,1,1] = ESFJ , [1,0,0,1] = ENTJ
//                // [1,0,1,0] = ENFP , [1,0,1,1] = ENFJ , [1,1,0,1] = ESTJ , [0,1,0,1] = ISTJ
//                // 유형별 미술도구와 잘 맞는 친구 설정만 하면 됨
//                } else if (buttonView.getId() == R.id.Chk3,R.id.Chk11,R.id.Chk12)
//                { if (isChecked) { //체크박스 체크경우 }
//                                  else { //체크박스 체크 풀 경우 }
//                    }
//                } else if (buttonView.getId() == R.id.Chk2,R.id.Chk8)
//                    { if (isChecked) { //체크박스 체크경우 }
//                                  else { //체크박스 체크 풀 경우 }
//                        }
//                } else if (buttonView.getId() == R.id.Chk1,R.id.Chk4,R.id.Chk6)
//                    { if (isChecked) { //체크박스 체크경우 }
//                              else { //체크박스 체크 풀 경우 }
//                        }
//                } else if (buttonView.getId() == R.id.Chk5 and buttonView.getId() == R.id.Chk10)
//                    { if (isChecked) { //체크박스 체크경우 }
//                          else { //체크박스 체크 풀 경우 }
//                        }
//                } else if (buttonView.getId() == R.id.Chk7,R.id.Chk9) //이것만 반대로 적용, 체크하면 0, 안하면 1
//                    { if (isChecked) { //체크박스 체크경우 }
//                      else { //체크박스 체크 풀 경우 }
//                    }
//        }
//
//    }}
//}

