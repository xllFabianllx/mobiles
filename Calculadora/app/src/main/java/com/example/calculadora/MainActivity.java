package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero_1;
    private EditText numero_2;

    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero_1 = findViewById(R.id.numero_1);
        numero_2 = findViewById(R.id.numero_2);
        resultado = findViewById(R.id.resultado);

    }
    public void sumar(View view){
        int suma = Integer.parseInt(numero_1.getText().toString()) + Integer.parseInt(numero_2.getText().toString());
        resultado.setText(suma+"");
    }
    public void resta(View view){
        int res = Integer.parseInt(numero_1.getText().toString()) - Integer.parseInt(numero_2.getText().toString());
        resultado.setText(res+"");
    }
    public void multi(View view){
        int mul = Integer.parseInt(numero_1.getText().toString()) * Integer.parseInt(numero_2.getText().toString());
        resultado.setText(mul+"");
    }
    public void divi(View view){
        int div = Integer.parseInt(numero_1.getText().toString()) / Integer.parseInt(numero_2.getText().toString());
        resultado.setText(div+"");
    }

    public int potencia(int base, int expo) {
        if (expo == 0) {
            return 1;
        }
        return base * potencia(base, expo - 1);
    }
    public void potencia(View view) {
        int base = Integer.parseInt(numero_1.getText().toString());
        int expo = Integer.parseInt(numero_2.getText().toString());
        int potencia = (int) Math.pow(base, expo);
        resultado.setText(potencia+"");
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void fibonacci(View view) {
        int n = Integer.parseInt(numero_1.getText().toString());
        int fibonacci = fibonacci(n);
        resultado.setText(String.valueOf(fibonacci));
    }


}
