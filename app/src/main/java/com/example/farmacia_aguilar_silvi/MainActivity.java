package com.example.farmacia_aguilar_silvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciar_activity_camara (View view){
        Intent ingreso = new Intent(this, tomar_foto.class);
        startActivity(ingreso);
    }

    public void activity_vendedores (View view){
        Intent ingreso = new Intent(this, mejores_vendedores.class);
        startActivity(ingreso);
    }

    public void activity_graficos (View view){
        Intent ingreso = new Intent(this, graficos.class);
        startActivity(ingreso);
    }



}