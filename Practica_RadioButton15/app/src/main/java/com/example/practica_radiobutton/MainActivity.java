package com.example.practica_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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
    }
}