package com.dionnatas.imagenslayout.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dionnatas.imagenslayout.R;
import com.dionnatas.imagenslayout.model.Pacotes;

import java.util.List;

public class ListaLocaisAdapter extends BaseAdapter {

    private final List<Pacotes> pacotes;
    private Context context;

    public ListaLocaisAdapter (List<Pacotes> pacotes, Context context){

        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacotes getItem(int posicao) {
        return pacotes.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lista_imagens, viewGroup, false);
        return viewCriada;
    }
}
