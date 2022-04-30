package com.example.promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private EditText txt1;
    private EditText txt2;
    private EditText txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //puente
    tv1 = (TextView)findViewById(R.id.text_resultadoResultadoPromedio);
    txt1 = (EditText)findViewById(R.id.txt_num1);
    txt2 = (EditText)findViewById(R.id.txt_num2);
    txt3 = (EditText)findViewById(R.id.txt_num3);

    }

    public void Promedio (View view){
        String valorIngresado1 = txt1.getText().toString();
        String valorIngresado2 = txt2.getText().toString();
        String valorIngresado3 = txt3.getText().toString();

        int num1 = Integer.parseInt(valorIngresado1);
        int num2 = Integer.parseInt(valorIngresado2);
        int num3 = Integer.parseInt(valorIngresado3);

        int suma = num1 + num2 + num3;
        int promedio = suma/3;

        if(promedio < 6){
            String result = String.valueOf(promedio);
            //muestro
            tv1.setText(result + "Desaprobado");
        } else {
            String result = String.valueOf(promedio);
            tv1.setText(result + "Aprobado");
        }
    }
}