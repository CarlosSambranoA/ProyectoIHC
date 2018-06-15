package com.example.avance.qhalikayv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private TextView usuarioNuevo;
    private Button botonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuarioNuevo = (TextView)findViewById(R.id.registrarse);
        usuarioNuevo.setOnClickListener(this);

        botonRegistrar = (Button)findViewById(R.id.botonIngresar);
        botonRegistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.botonIngresar :   intent = new Intent(this, DatosPersonales.class);
                                        startActivity(intent);
                                        break;

            case R.id.registrarse :     intent = new Intent(this, Registrar.class);
                                        startActivity(intent);
                                        break;
        }
    }
}
