package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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

    //Método para el button Guardar
    public void Guardar (View view) {
        SharedPreferences preferencias = getSharedPreferences("datoMail", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
    }

}