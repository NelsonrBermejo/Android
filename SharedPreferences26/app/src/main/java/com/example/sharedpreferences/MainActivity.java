package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText et1Mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1Mail = (EditText)findViewById(R.id.EditTextEMail);

        SharedPreferences preferences = getSharedPreferences("datoMail", Context.MODE_PRIVATE);
        //tener en cuenta "mail" y ""!
        et1Mail.setText(preferences.getString("mail",""));
    }
}