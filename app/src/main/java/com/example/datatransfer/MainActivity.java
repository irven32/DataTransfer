package com.example.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText firstname,lastname;
    RadioButton radiomale,radiofemale;
    Button second;
    Data objData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objData=new Data();
        firstName=(EditText)findViewById(R.id.firstname);
        lastName=(EditText)findViewById(R.id.lastname);
        radioFemale=(RadioButton)findViewById(R.id.radioFemale);
        radioMale=(RadioButton)findViewById(R.id.radioMale);


        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new.View{
            objData.firstName= firstname.getText().toString();
            objData.lastName= lastname.getText().toString();
        }



        second = (Button) findViewById(R.id.second);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = txt.getText().toString();
                if (TextUtils.isEmpty(txt1)) {
                    txt.setError("Enter Data");
                } else {
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("data",txt1);
                    startActivity(i);
                }
            }
        });
    }}
