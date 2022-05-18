package com.example.a1922is_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPunto;
    Button btnSuma,btnResta,btnMultiplicacion,btnDivision,btnIgual,btnAC,btnDel;
    TextView resultado;
    public ConvertirCadena calculadora = new ConvertirCadena();
    public String cadena="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        resultado = (TextView) findViewById(R.id.tvResultado);
        btn0 = findViewById(R.id.bt0);
        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.bt2);
        btn3 = findViewById(R.id.bt3);
        btn4 = findViewById(R.id.bt4);
        btn5 = findViewById(R.id.bt5);
        btn6 = findViewById(R.id.bt6);
        btn7 = findViewById(R.id.bt7);
        btn8 = findViewById(R.id.bt8);
        btn9 = findViewById(R.id.bt9);
        btnPunto = findViewById(R.id.btPunto);

        btnSuma = findViewById(R.id.btSuma);
        btnResta = findViewById(R.id.btResta);
        btnMultiplicacion = findViewById(R.id.btMultiplicacion);
        btnDivision = findViewById(R.id.btDivision);
        btnIgual = findViewById(R.id.btIgual);
        btnAC = findViewById(R.id.btAC);
        btnDel = findViewById(R.id.btQuitar);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "0";
                resultado.setText(cadena);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "1";
                resultado.setText(cadena);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "2";
                resultado.setText(cadena);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "3";
                resultado.setText(cadena);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "4";
                resultado.setText(cadena);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "5";
                resultado.setText(cadena);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "6";
                resultado.setText(cadena);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "7";
                resultado.setText(cadena);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "8";
                resultado.setText(cadena);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "9";
                resultado.setText(cadena);
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += ".";
                resultado.setText(cadena);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "+";
                resultado.setText(cadena);
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "-";
                resultado.setText(cadena);
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "*";
                resultado.setText(cadena);
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena += "/";
                resultado.setText(cadena);
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadena = "";
                resultado.setText("0");
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (cadena.equals("") || cadena == null)
                        resultado.setText("0");

                    cadena = cadena.substring(0,cadena.length()-1);
                    resultado.setText(cadena);
                }catch (Exception e){
                    resultado.setText("0");
                    Toast toast = Toast.makeText(getApplicationContext(), "7w7", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
}