package com.hotelCachorro;

public class Pinscher extends RacaCachorro {

    public Pinscher(String nome) {
        super(nome, "iaiaiaiaa");
    }

    @Override
    public String toString() {
        return "Pinscher: { " + "latido: '" + this.latir() +
                "', nome: '" + this.getNome() + "'}";
    }

}
