package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

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

    
}