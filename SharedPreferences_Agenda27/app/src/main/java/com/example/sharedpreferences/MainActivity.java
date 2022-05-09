package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
    public void GUARDAR (View view) {

        String nombre = et_nombre.getText().toString();
        String datos = et_datos.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString(nombre,datos);
        obj_editor.commit();

        Toast.makeText(this, "El contacto ha sido guardado", Toast.LENGTH_SHORT).show();
    }

    public void BUSCAR (View view) {

        String buscarNombre = et_nombre.getText().toString();
        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String datos = preferencias.getString(buscarNombre,"");

        //si el contacto no existe = Toast de lo contrario lo muestro
        if(datos.length()==0){
            Toast.makeText(this, "No se encontro ningún registro", Toast.LENGTH_SHORT).show();
        } else {
            et_datos.setText(datos);
        }
    }

}