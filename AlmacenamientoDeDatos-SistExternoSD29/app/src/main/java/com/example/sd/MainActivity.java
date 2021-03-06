package com.example.sd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre, et_contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (EditText)findViewById(R.id.txt_nombre);
        et_contenido = (EditText)findViewById(R.id.txt_contenido);
    }

    public void GUARDAR (View view) {
        String nombre = et_nombre.getText().toString();
        String contenido = et_contenido.getText().toString();

        try {
            File tarjetaSD = Environment.getExternalStorageDirectory();
            Toast.makeText(this, tarjetaSD.getPath(), Toast.LENGTH_SHORT).show();
            File rutaArchivo = new File(tarjetaSD.getPath(),nombre);



            OutputStreamWriter crearArchivo = new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));
            crearArchivo.write(contenido);
            crearArchivo.flush();
            crearArchivo.close();

            Toast.makeText(this, "GUARDADO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            et_nombre.setText("");
            et_contenido.setText("");
        }catch (IOException e){
            Toast.makeText(this, "No se pudo guardar", Toast.LENGTH_SHORT).show();
        }
    }

    //Método consultar
    public void CONSULTAR (View view){
        //nombre de variable en la que voy a alojar el nombre del archivo que el usuario quiere consultar
        String nombre = et_nombre.getText().toString();


        try{
            File tarjetaSD = Environment.getExternalStorageDirectory();
            File rutaArchivo = new File(tarjetaSD.getPath(),nombre);
            InputStreamReader abrirArchivo = new InputStreamReader(openFileInput(nombre));

            //read
            BufferedReader leerArchivo = new BufferedReader(abrirArchivo);

            String linea = leerArchivo.readLine();
            String contenidoCompleto ="";


            while (linea != null){
                contenidoCompleto = contenidoCompleto + linea + "\n";
                linea = leerArchivo.readLine();
            }

            leerArchivo.close();
            abrirArchivo.close();
            et_contenido.setText(contenidoCompleto);


        }catch (IOException e){
            Toast.makeText(this, "Error al leer el archivo", Toast.LENGTH_SHORT).show();
        }
    }
}