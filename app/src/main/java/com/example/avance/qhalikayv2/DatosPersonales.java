package com.example.avance.qhalikayv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DatosPersonales extends AppCompatActivity implements View.OnClickListener {
    private ImageButton botonInicio;
    private ImageButton botonCalorias;
    private ImageButton botonComidas;
    private ImageButton botonEjercicios;
    private ImageButton botonAyuda;
    private ImageButton botonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales);

        botonInicio = (ImageButton)findViewById(R.id.botonInicio);
        botonInicio.setOnClickListener(this);

        botonCalorias = (ImageButton)findViewById(R.id.botonCalorias);
        botonCalorias.setOnClickListener(this);

        botonComidas = (ImageButton)findViewById(R.id.botonComidas);
        botonComidas.setOnClickListener(this);

        botonEjercicios = (ImageButton)findViewById(R.id.botonEjercicios);
        botonEjercicios.setOnClickListener(this);

        botonAyuda = (ImageButton)findViewById(R.id.botonAyuda);
        botonAyuda.setOnClickListener(this);

        botonSalir = (ImageButton)findViewById(R.id.botonSalir);
        botonSalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.botonInicio : //Definir
                                    break;
            case R.id.botonCalorias :   intent = new Intent(this, Calorias.class);
                                        startActivity(intent);
                                        break;
        }
    }
}
