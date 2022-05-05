package com.example.parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etxNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etxNombre = (EditText)findViewById(R.id.txt_nombre);
    }

    //Método para el botón enviar dato
    public void EnviarDato (View view) {
        Intent i = new Intent(this,MainActivity2.class);
        //Pasamos por parametros el valor recibido del usuario.
        //"dato" llave a usar en mi otra Activity para identificar el nombre
        i.putExtra("dato",etxNombre.getText().toString());
    }
}