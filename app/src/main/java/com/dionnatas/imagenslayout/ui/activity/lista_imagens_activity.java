package com.dionnatas.imagenslayout.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.dionnatas.imagenslayout.R;
import com.dionnatas.imagenslayout.dao.PacoteDAO;
import com.dionnatas.imagenslayout.model.Local;
import com.dionnatas.imagenslayout.ui.adapter.ListaLocaisAdapter;

import java.util.List;

public class lista_imagens_activity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Imagens";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_imagens);
        setTitle(TITULO_APPBAR);
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDeLocais = findViewById(R.id.lista_imagens_listview);
        List<Local> locais = new PacoteDAO().lista();
        listaDeLocais.setAdapter(new ListaLocaisAdapter(locais, this));
    }
}