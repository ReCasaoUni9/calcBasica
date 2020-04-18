package com.example.calcbasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somaNumeros(View view){
        EditText txtPNum =  findViewById(R.id.txtPrimeiroNumero);
        EditText txtSNum =  findViewById(R.id.txtSegundoNumero);
        EditText txtRes =  findViewById(R.id.txtResultado);

        int soma = Integer.parseInt(txtPNum.getText().toString()) + Integer.parseInt(txtSNum.getText().toString());
        txtRes.setText(String.valueOf(soma), TextView.BufferType.EDITABLE);


    }

    public void subtraiNumeros(View view){
        EditText txtPNum =  findViewById(R.id.txtPrimeiroNumero);
        EditText txtSNum =  findViewById(R.id.txtSegundoNumero);
        EditText txtRes =  findViewById(R.id.txtResultado);

        int subtracao = Integer.parseInt(txtPNum.getText().toString()) - Integer.parseInt(txtSNum.getText().toString());
        txtRes.setText(String.valueOf(subtracao), TextView.BufferType.EDITABLE);

    }

    public void multiplicaNumeros(View view){
        EditText txtPNum =  findViewById(R.id.txtPrimeiroNumero);
        EditText txtSNum =  findViewById(R.id.txtSegundoNumero);
        EditText txtRes =  findViewById(R.id.txtResultado);

        int multiplicacao = Integer.parseInt(txtPNum.getText().toString()) * Integer.parseInt(txtSNum.getText().toString());
        txtRes.setText(String.valueOf(multiplicacao), TextView.BufferType.EDITABLE);

    }

    public void divideNumeros(View view){
        EditText txtPNum =  findViewById(R.id.txtPrimeiroNumero);
        EditText txtSNum =  findViewById(R.id.txtSegundoNumero);
        EditText txtRes =  findViewById(R.id.txtResultado);

        int divisao = Integer.parseInt(txtPNum.getText().toString()) /Integer.parseInt(txtSNum.getText().toString());
        txtRes.setText(String.valueOf(divisao), TextView.BufferType.EDITABLE);

    }





}
