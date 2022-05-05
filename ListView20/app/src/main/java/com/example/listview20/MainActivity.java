package com.example.listview20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
  private TextView tv1;
  private ListView lv1;

  //Vector que se encargará de mostrar los nombres
  private String nombres [] = {"Nelson","Anahi","Matheo","Lo","Fernando","Yanu","Leo","Miel","Ezequiel","Isabel",};
  //Muestra este elemento en nuestro ListView al seleccionar el nombre
  private String edades [] = {"33","34","5","11","31","32","33","2","31","61",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.textView);
        lv1 = (ListView)findViewById(R.id.LV1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_nombres,nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}