package com.isoft.practica52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText h1,h2,h3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h1 = (EditText) findViewById(R.id.h1);
        h2 = (EditText) findViewById(R.id.h2);
        h3 = (EditText) findViewById(R.id.h3);

    }
    public void calcular(View view)
    {
        String hora1 = h1.getText().toString();
        String hora2 = h2.getText().toString();

        String[] h1 = hora1.split(":");
        String[] h2 = hora2.split(":");
        int resto = 0;

        int segundo = Integer.parseInt(h2[2])-Integer.parseInt(h1[2]);
        if (segundo < 0){
            resto = -1;
            segundo = 60 - segundo;
        }

        int minuto = (Integer.parseInt(h2[1])-Integer.parseInt(h1[1])) - resto;
        resto = 0;
        if (minuto < 0){
            minuto = 60 - minuto;
            resto = -1;
        }
        int hora = (Integer.parseInt(h2[0])-Integer.parseInt(h1[0])) - resto;
        h3.setText(hora+":"+minuto+":"+segundo);
    }
}
