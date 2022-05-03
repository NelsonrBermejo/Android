package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox cbSumar, cbRestar;
    //ButonOnclick
    private TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        cbSumar = (CheckBox)findViewById(R.id.check_suma);
        cbRestar = (CheckBox)findViewById(R.id.check_resta);
        tvResultado = (TextView)findViewById(R.id.tv_resultado);
    }

    public void Calcular (View view) {
        String valorIngresado1_String = et1.getText().toString();
        String valorIngresado2_String = et2.getText().toString();

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debe introducir un valor en ambas casillas", Toast.LENGTH_LONG).show();
        }else{

           int valorIngresado1_Int = Integer.parseInt(valorIngresado1_String);
           int valorIngresado2_Int = Integer.parseInt(valorIngresado2_String);

           //Creo variable para poder mostrar dos resultados
            String resultado = "";
            if(cbSumar.isChecked() == true){
                int suma = valorIngresado1_Int + valorIngresado2_Int;
                resultado = "El resultado de la suma es " + suma + " / ";
            }
            if(cbRestar.isChecked() == true){
                int resta = valorIngresado1_Int + valorIngresado2_Int;
                resultado = resultado + " La resta es " + resta + " / ";
            }

        }
    }
}