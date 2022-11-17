package com.hotelCachorro;

public class RacaCachorro implements Cachorro, Comparable<RacaCachorro> {

    private String latido;

    private String nome;

    public RacaCachorro(String nome, String latido) {
        this.nome = nome;
        this.latido = latido;
    }

    @Override
    public String latir() {
        return this.latido;
    }

    @Override
    public int compareTo(RacaCachorro racaCachorro) {
        return this.nome.compareTo(racaCachorro.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public String getLatido() {
        return this.latido;
    }

}
