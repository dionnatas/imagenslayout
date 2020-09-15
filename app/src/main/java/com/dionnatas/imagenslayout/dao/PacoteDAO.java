package com.dionnatas.imagenslayout.dao;

import com.dionnatas.imagenslayout.model.Local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteDAO {

    public List<Local> lista(){
        List<Local> pacotes = new ArrayList<>(Arrays.asList(
                new Local("São Paulo", "sao_paulo_sp"
                        , "Cidade de São Paulo, Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a " +
                        "galley of type and scrambled it to make a type specimen book."),
                new Local("Belo Horizonte", "belo_horizonte_mg", "Cidade de Belo Horizonte, etc, etc, etc......"),
                new Local("Recife", "recife_pe", "Cidade de Recife, etc, etc, etc......"),
                new Local("Rio de Janeiro", "rio_de_janeiro_rj", "Cidade do Rio de Janeiro, etc, etc, etc......"),
                new Local("Salvador", "salvador_ba", "Cidade de Salvador, etc, etc, etc......"),
                new Local("Foz do Iguaçu", "foz_do_iguacu_pr", "Cidade de Foz do Iguaçu, etc, etc, etc......")
        ));
        return pacotes;
    }
}
