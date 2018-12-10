package com.example.akash.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String name;
    String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView=findViewById(R.id.text);
        Bundle bundle =getIntent().getExtras();

        name = bundle.getString("Name");
        email = bundle.getString("Email");


       textView.setText(name + "\n" + email);

    }
}
