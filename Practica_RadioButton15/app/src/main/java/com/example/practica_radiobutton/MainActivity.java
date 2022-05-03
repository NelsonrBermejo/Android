package com.example.practica_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;
    //Button onClick!
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        rbSumar = (RadioButton)findViewById(R.id.rb_sumar);
        rbRestar = (RadioButton)findViewById(R.id.rb_restar);
        rbMultiplicar = (RadioButton)findViewById(R.id.rb_multiplicar);
        rbDividir = (RadioButton)findViewById(R.id.rb_dividir);
        tvResultado = (TextView)findViewById(R.id.textView);
    }


    public void Calcular (View view) {
        String valorIngresado1_String = et1.getText().toString();
        String valorIngresado2_String = et2.getText().toString();

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debe introducir un valor en ambas casillas", Toast.LENGTH_LONG).show();
        }else{

        int valorIngresado1_Int = Integer.parseInt(valorIngresado1_String);
        int valorIngresado2_Int = Integer.parseInt(valorIngresado2_String);

        if (rbSumar.isChecked() == true) {
            int resultadoSuma_Int = valorIngresado1_Int + valorIngresado2_Int;
            String resultadoSuma_String = String.valueOf(resultadoSuma_Int);
            //Muestro resultado
            tvResultado.setText(resultadoSuma_String);

        } else if (rbRestar.isChecked() == true) {
            int resultadoResta_Int = valorIngresado1_Int - valorIngresado2_Int;
            String resultadoResta_String = String.valueOf(resultadoResta_Int);
            //Muestro resultado
            tvResultado.setText(resultadoResta_String);

        } else if (rbMultiplicar.isChecked() == true) {
            int resultadoMult_Int = valorIngresado1_Int * valorIngresado2_Int;
            String resultadoMult_String = String.valueOf(resultadoMult_Int);
            //Muestro resultado
            tvResultado.setText(resultadoMult_String);

        } else if (rbDividir.isChecked() == true) {
            if (valorIngresado1_Int == 0) {
                Toast.makeText(this, "No se puede dividir por Cero", Toast.LENGTH_LONG).show();
            } else if (valorIngresado2_Int == 0) {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();
            } else {
                int resultadoDiv_Int = valorIngresado1_Int / valorIngresado2_Int;
                String resultadoDiv_String = String.valueOf(resultadoDiv_Int);
                //Muestro resultado
                tvResultado.setText(resultadoDiv_String);
            }

        }
     }
    }
}