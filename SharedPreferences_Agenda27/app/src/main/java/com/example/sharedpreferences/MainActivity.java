package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre;
    private  EditText et_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    et_nombre = (EditText)findViewById(R.id.txt_nombre);
    et_datos = (EditText)findViewById(R.id.txt_datos);
    //acá se podría agregar el recordatorio de los ultimos datos ingresados
    //Utilizando SharedPreferences como en la App Anterior
    }

    //Método para el Botón GUARDAR
    private  void GUARDAR (View view) {

        String nombre 
    }

}