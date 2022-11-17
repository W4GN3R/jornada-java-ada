package com.hotelCachorro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<RacaCachorro> hospedes = new ArrayList<>();

    public static void main(String[] args) {
        hospedes.add(new Pitbull("Rex"));
        hospedes.add(new PastorAlemao("Fred"));
        hospedes.add(new Pinscher("Bob"));

        Collections.sort(hospedes);
        hospedes.forEach((c) -> System.out.println(c));
    }
}
