package com.dionnatas.imagenslayout.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dionnatas.imagenslayout.R;
import com.dionnatas.imagenslayout.model.Local;
import com.dionnatas.imagenslayout.ui.ResourceUtils;

import java.util.List;

public class ListaLocaisAdapter extends BaseAdapter {

    private final List<Local> locais;
    private final Context context;

    public ListaLocaisAdapter(List<Local> locais, Context context) {

        this.locais = locais;
        this.context = context;
    }

    @Override
    public int getCount() {
        return locais.size();
    }

    @Override
    public Local getItem(int posicao) {
        return locais.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lista_imagens, viewGroup, false);

        Local locals = locais.get(posicao);
        mostraLocal(viewCriada, locals);
        mostraImagem(viewCriada, locals);
        mostraDescricao(viewCriada, locals);

        return viewCriada;
    }

    private void mostraDescricao(View viewCriada, Local locals) {
        TextView desc = viewCriada.findViewById(R.id.descricao_local);
        desc.setText(locals.getDescricao());
    }

    private void mostraImagem(View viewCriada, Local locals) {
        ImageView imagem = viewCriada.findViewById(R.id.img_local);
        Drawable drawableImagem =  ResourceUtils.devolveDrawable(context, locals.getImagem());
        imagem.setImageDrawable(drawableImagem);
    }

    private void mostraLocal(View viewCriada, Local locals) {
        TextView local = viewCriada.findViewById(R.id.nome_local);
        local.setText(locals.getLocal());
    }
}
