package com.example.calificacin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText autoevaluacion;
    private EditText parcial;
    private EditText quices;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoevaluacion = (EditText) findViewById(R.id.txtautoevaluacion);
        parcial = (EditText) findViewById(R.id.txtparcial);
        quices = (EditText) findViewById(R.id.txtquices);
        resultado = (TextView) findViewById(R.id.txtresultado);
    }

    public void calcularNota(View view){
        String estado = "";
        float autoevaluacionNota = (float) (Float.parseFloat(autoevaluacion.getText().toString()) * 0.3);
        float parcialNota = (float) (Float.parseFloat(parcial.getText().toString()) * 0.4);
        float quicesNota = (float) (Float.parseFloat(quices.getText().toString()) * 0.3);
        float resultadoFinal = autoevaluacionNota+parcialNota+quicesNota;

        if(resultadoFinal > 3){
            estado = "EL estudiante aprobo con ";

            resultado.setTextColor(Color.rgb(76,175,80));
        }
        else{
            estado = "El estudiante reprobo con ";
            resultado.setTextColor(Color.rgb(244,67,54));
        }
        resultado.setText(String.valueOf(estado + resultadoFinal).toString());

    }
}