package com.example.akash.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    EditText email;
    String name1,email1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        Button button= findViewById(R.id.button);
        button.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        name1 = name.getText().toString();
        email1 = email.getText().toString();

        Intent i = new Intent(MainActivity.this,Main2Activity.class);

        Bundle bundle=new Bundle();
        bundle.putString("Name",name1);
        bundle.putString("Email",email1);

        i.putExtras(bundle);
        startActivity(i);


    }
}
