package com.example.listview20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private TextView tv1;
  private ListView lv1;

  //Vector que se encargará de mostrar los nombres
  private String nombres [] = {"Nelson","Anahi","Matheo","Lo","Fernando","Yanu","Leo","Miel","Fer","Isabel",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}