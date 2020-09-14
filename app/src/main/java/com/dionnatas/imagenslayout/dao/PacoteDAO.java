package com.dionnatas.imagenslayout.dao;

import com.dionnatas.imagenslayout.model.Pacotes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteDAO {

    public List<Pacotes> lista(){
        List<Pacotes> pacotes = new ArrayList<>(Arrays.asList(
                new Pacotes("São Paulo", "sao_paulo_sp", "Cidade de São Paulo, etc, etc, etc......"),
                new Pacotes("Belo Horizonte", "belo_horizonte_mg", "Cidade de Foz de Belo Horizonte, etc, etc, etc......"),
                new Pacotes("Recife", "recife_pe", "Cidade de Recife, etc, etc, etc......"),
                new Pacotes("Rio de Janeiro", "rio_de_janeiro_rj", "Cidade do Rio de Janeiro, etc, etc, etc......"),
                new Pacotes("Salvador", "salvador_ba", "Cidade de Salvador, etc, etc, etc......"),
                new Pacotes("Foz do Iguaçu", "foz_do_iguacu_pr", "Cidade de Foz do Iguaçu, etc, etc, etc......")
        ));
        return pacotes;
    }
}
