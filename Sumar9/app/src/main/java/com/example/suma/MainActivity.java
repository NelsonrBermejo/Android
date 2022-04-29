package com.example.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //componentes u objetos que utilizamos EditText num1 y num2
    //defino et1 como tipo de objeto EditText
    private EditText et1;
    private EditText et2;
    //componentes que utilizamos TextVie Resultado
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //R:comunica con xml
    //find..:busca en la vista componente mediante ID
    et1 = (EditText)findViewById(R.id.txt_num1);
    et2 = (EditText)findViewById(R.id.txt_num2);
    tv1 = (TextView)findViewById(R.id.txt_resultado);
    }

    public void Sumar(View view){
        //getText():Valores ingresados por el usuario
        String valorIngresado1 = et1.getText().toString();
        String valorIngresado2 = et2.getText().toString();

        int num1 = Integer.parseInt(valorIngresado1);
        int num2 = Integer.parseInt(valorIngresado2);
        int suma = num1 + num2;

        //parseo a String para poder mostrarlo
        String resultado;
        resultado = String.valueOf(suma);

        //muestro resultado
        tv1.setText(resultado);

    }
}