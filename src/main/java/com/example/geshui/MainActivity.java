package com.example.geshui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText gongzi;
    private EditText gjj;
    private RadioGroup mrb1;
    private RadioGroup mrb2;
    private RadioGroup mrb3;
    private RadioGroup mrb4;
    private Button jisuan;
    private Button qignchu;
    private double geshui=0;
    private double geshui1=0;
    private TextView jieguo;



    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrb1=findViewById(R.id.rg_1);
        mrb2=findViewById(R.id.rg_2);
        mrb3=findViewById(R.id.rg_3);
        mrb4=findViewById(R.id.rg_4);
        qignchu=findViewById(R.id.qc);
        final String sa=new String();

        mrb1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=radioGroup.findViewById(i);
                switch (radioButton.getId()){
                    case R.id.rbzn_1:
                        geshui=geshui+1000;
                        break;

                }
            }
        });
        mrb2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=radioGroup.findViewById(i);
                switch (radioButton.getId()){
                    case R.id.rbjx_1:
                        geshui=geshui+400;
                        break;

                }
            }
        });
        mrb3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=radioGroup.findViewById(i);
                switch (radioButton.getId()){
                    case R.id.rbdk_1:
                        geshui=geshui+1000;
                        break;

                }
            }
        });
        mrb4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=radioGroup.findViewById(i);
                switch (radioButton.getId()){
                    case R.id.rblr_1:
                        geshui=geshui+2000;
                        break;

                }
            }
        });

        gjj=findViewById(R.id.gjj);
        gongzi=findViewById(R.id.gonzi);
        jisuan=findViewById(R.id.js);
        jieguo=findViewById(R.id.jieguo);
        jisuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String gz=gongzi.getText().toString();
                final String gj=gjj.getText().toString();
                double d2=Double.parseDouble(gj);
                double d1=Double.parseDouble(gz);

                geshui1=d1-d2-geshui-5000;
                if (geshui<=0){
                    geshui1=0;
                }
                if (geshui1>5000&&geshui1<=8000){
                    geshui1=geshui1*0.03;
                }
                if(geshui1>8000&&geshui1<=17000){
                    geshui1=geshui1*0.1;
                }
                if (geshui1>17000&&geshui1<=30000){
                    geshui1=geshui1*0.2;

                }
                if (geshui1>30000&&geshui1<=40000){
                    geshui1=geshui1*25;
                }
                if (geshui1>40000&&geshui1<=60000){
                    geshui1=geshui1*0.3;
                }
                if (geshui1>60000&&geshui1<=85000){
                    geshui1=geshui1*0.35;
                }
                if (geshui1>85000){
                    geshui1=geshui1*0.45;
                }


                jieguo.setText(String.valueOf(geshui1));



            }
        });
        qignchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jieguo.setText("");
                gongzi.setText("");
                gjj.setText("");


            }
        });


    }


}
