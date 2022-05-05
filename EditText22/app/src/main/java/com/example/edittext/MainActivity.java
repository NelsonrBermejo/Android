package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etname;
    private EditText etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = (EditText)findViewById(R.id.txt_nombre);
        etpassword = (EditText)findViewById(R.id.txt_password);
    }

    //Método
    public void Registrar (View view){
        String nombreIngresadoPorUsuario = etname.getText().toString();
        String passwordIngresadoPorUsuario = etpassword.getText().toString();

        //Verifico que la cantidad de caracteres sea mayor a 0;
        if(nombreIngresadoPorUsuario.length() == 0){
            Toast.makeText(this, "Ingrese nombre", Toast.LENGTH_LONG).show();
        }
        if(passwordIngresadoPorUsuario.length() == 0){
            Toast.makeText(this, "Ingrese password", Toast.LENGTH_LONG).show();
        }
        if(nombreIngresadoPorUsuario.length() != 0 && passwordIngresadoPorUsuario.length() != 0){
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show();
        }
    }
}