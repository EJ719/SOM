package com.example.som_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.ScrollView;

public class som_reservation extends AppCompatActivity {
    RadioButton rdoCal, rdoTime;
    Button BtnEnd;
    CheckBox Chk1, Chk2, Chk3, Chk4, Chk5;
    CalendarView calView1;
    ScrollView scrollView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som_reservation);

        rdoCal = (RadioButton)findViewById(R.id.rdoCal);
        rdoTime = (RadioButton)findViewById(R.id.rdoTime);
        calView1 = (CalendarView)findViewById(R.id.calendarView1);
        Chk1 = (CheckBox)findViewById(R.id.Chk1);
        Chk2 = (CheckBox)findViewById(R.id.Chk2);
        Chk3 = (CheckBox)findViewById(R.id.Chk3);
        Chk4 = (CheckBox)findViewById(R.id.Chk4);
        Chk5 = (CheckBox)findViewById(R.id.Chk5);
        BtnEnd = (Button)findViewById(R.id.BtnEnd);
        scrollView1 = (ScrollView)findViewById(R.id.scrollView1);

        calView1.setVisibility(View.INVISIBLE);
        scrollView1.setVisibility(View.INVISIBLE);

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView1.setVisibility(View.VISIBLE);
                scrollView1.setVisibility(View.INVISIBLE);
            }
        });
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView1.setVisibility(View.INVISIBLE);
                scrollView1.setVisibility(View.VISIBLE);
            }
        });
        Chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                            @Override
                                            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                if (Chk1.isChecked() == true) {
                                                    BtnEnd.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Intent intent = new Intent(getApplicationContext(), som_reservfinish.class);
                                                            startActivity(intent);
                                                        }
                                                    });
                                                }
                                            }
                                        });
        Chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                            @Override
                                            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                if (Chk2.isChecked() == true) {
                                                    BtnEnd.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Intent intent = new Intent(getApplicationContext(), som_reservfinish.class);
                                                            startActivity(intent);
                                                        }
                                                    });
                                                }
                                            }
                                        });
        Chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (Chk3.isChecked() == true) {
                                                            BtnEnd.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    Intent intent = new Intent(getApplicationContext(), som_reservfinish.class);
                                                                    startActivity(intent);
                                                                }
                                                            });
                                                        }
                                                    }
                                                });
        Chk4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                if (Chk4.isChecked() == true) {
                                    BtnEnd.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getApplicationContext(), som_reservfinish.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            }
                        });
        Chk5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                    @Override
                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                        if (Chk5.isChecked() == true) {
                                            BtnEnd.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent = new Intent(getApplicationContext(), som_reservfinish.class);
                                                    startActivity(intent);
                                                }
                                            });
                                        }
                                    }
                                });

    }}

