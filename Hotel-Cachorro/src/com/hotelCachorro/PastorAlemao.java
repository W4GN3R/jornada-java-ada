package com.hotelCachorro;

public class PastorAlemao extends RacaCachorro {

    public PastorAlemao(String nome) {
        super(nome, "hufhufuhuf");
    }

    @Override
    public String toString() {
        return "Pastor Alemão: { " + "latido: '" + this.latir() +
                "', nome: '" + this.getNome() + "'}";
    }
}
