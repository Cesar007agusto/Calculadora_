package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton_division;
    private Button boton_resta;
    private Button boton_suma;
    private Button boton_multiplicacion;
    private Button boton_igual;
    private TextView resultado;
    private EditText numero1;
    private EditText numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = findViewById(R.id.respuesta);
        numero1 = findViewById(R.id.numero_1);
        numero2 = findViewById(R.id.numero_2);




        boton_division = findViewById(R.id.division);
        boton_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(dividir(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");
            }

        });



        boton_resta = findViewById(R.id.resta);
        boton_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(restar(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");

            }
        });

        boton_suma = findViewById(R.id.suma);
        boton_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(sumar(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        boton_multiplicacion = findViewById(R.id.multiplicacion);
        boton_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(multiplicar(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        boton_igual = findViewById(R.id.igual);

    }
    public int dividir (int a, int b){
        return a/b;
    }

    public int restar (int a, int b){
        return a-b;
    }
    public int sumar (int a, int b){
        return a+b;
    }
    public int multiplicar (int a, int b){
        return a*b;
    }



}