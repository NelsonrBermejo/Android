package com.example.almacenamientodedatosficheros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_bitacora);
        //RecuperaDatos
        fileList();

        String archivos[] = fileList();

        if (ArchivoExiste(archivos, "bitacora.txt")) {
            try {//OpenFile
                InputStreamReader archivo = new InputStreamReader(openFileInput("bitacora.txt"));
                //read
                BufferedReader br = new BufferedReader(archivo);
                //see first line
                String linea = br.readLine();
                String bitacoraCompleta = "";
                //if first line it is't  empty
                while (linea != null) {
                    bitacoraCompleta = bitacoraCompleta + linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(bitacoraCompleta);
            } catch (IOException e) {

            }
        }
    }

    private boolean ArchivoExiste (String archivos[], String NombreArchivo) {
        for (int i = 0; i < archivos.length; i++)
            if (NombreArchivo.equals(archivos[i]))
                return true;
             return false;

    }


}