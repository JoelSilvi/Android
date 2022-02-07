package com.example.farmacia_aguilar_silvi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class mejores_vendedores extends AppCompatActivity{
    ListView listavendedores;
    String[] nombres = {
            "Sonia Diaz",
            "Camilo Perez",
            "Juan Gonzalez",
    };

    int[] imagenes = {
            R.drawable.farma1,
            R.drawable.farma2,
            R.drawable.farma3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mejores_vendedores);

        listavendedores = (ListView) findViewById(R.id.listavendedores);
        listavendedores.setAdapter(new listadaptador(this, nombres,imagenes));
    }

}
