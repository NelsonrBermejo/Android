package com.example.spinnermenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Spinner esp1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_valor1);
        et2 = (EditText) findViewById(R.id.txt_valor2);
        tv1 = (TextView) findViewById(R.id.textView);
        esp1 = (Spinner) findViewById(R.id.spinner);

        String opcionesEsp1[] = {"sumar", "restar", "multiplicar", "dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_operaciones, opcionesEsp1);

        esp1.setAdapter(adapter);
    }

    public void Calcular(View view) {
        String valorIngresado1_String = et1.getText().toString();
        String valorIngresado2_String = et2.getText().toString();

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debe introducir un valor en ambas casillas", Toast.LENGTH_LONG).show();
        } else {

            int valorIngresado1_Int = Integer.parseInt(valorIngresado1_String);
            int valorIngresado2_Int = Integer.parseInt(valorIngresado2_String);

            String seleccionSpinnerUsuario = esp1.getSelectedItem().toString();

            if(seleccionSpinnerUsuario.equals("sumar")){
                int suma = valorIngresado1_Int + valorIngresado2_Int;
                String resultado = String.valueOf(suma);
                tv1.setText(resultado);

            } else if(seleccionSpinnerUsuario.equals("restar")){
                int resta = valorIngresado1_Int - valorIngresado2_Int;
                String resultado = String.valueOf(resta);
                tv1.setText(resultado);

            } else if(seleccionSpinnerUsuario.equals("multiplicar")){
                int multi = valorIngresado1_Int * valorIngresado2_Int;
                String resultado = String.valueOf(multi);
                tv1.setText(resultado);

            } else if(seleccionSpinnerUsuario.equals("dividir")){

                if(valorIngresado2_Int != 0){
                    int div = valorIngresado1_Int / valorIngresado2_Int;
                    String resultado = String.valueOf(div);
                    tv1.setText(resultado);
                }else {

                    Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
                }
            }

        }
    }
}