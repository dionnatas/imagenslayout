package com.dionnatas.imagenslayout.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dionnatas.imagenslayout.R;

public class lista_imagens_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_imagens);
        setTitle("Imagens");
    }
}