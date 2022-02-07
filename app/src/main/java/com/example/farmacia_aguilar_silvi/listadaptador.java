package com.example.farmacia_aguilar_silvi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listadaptador extends BaseAdapter {

    private static LayoutInflater layoutInflater;

    Context context;

    String[] nombresvendedores;

    int[] imagenesvendedores;


    public listadaptador(Context context, String[] nombres, int[] imagenes) {
        this.context = context;
        this.nombresvendedores = nombres;
        this.imagenesvendedores = imagenes;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View currentView = layoutInflater.inflate(R.layout.activity_listadaptador, null);
        TextView nombrevendedor = (TextView) currentView.findViewById(R.id.nombrevendedor);
        ImageView imagenvendedor = (ImageView) currentView.findViewById(R.id.imagenvendedor);

        nombrevendedor.setText(nombresvendedores[i]);
        imagenvendedor.setImageResource(imagenesvendedores[i]);
        return currentView;
    }


    @Override
    public int getCount() {
        return nombresvendedores.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
