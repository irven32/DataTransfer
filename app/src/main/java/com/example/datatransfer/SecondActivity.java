package com.example.datatransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt=(EditText)findViewById(R.id.txt);

        Bundle extras=getIntent().getExtras();
        String txt1=extras.getString("data");

        txt.setText(txt1);
    }
}
