package com.hotelCachorro;

public class Pitbull extends RacaCachorro {
    public Pitbull(String nome) {
        super(nome, "auauaua");
    }

    @Override
    public String toString() {
        return "Pitbull: { " + "latido: '" + this.latir() +
                "', nome: '" + this.getNome() + "'}";
    }
}
