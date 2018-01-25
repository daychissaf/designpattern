package ch.doc.pattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Cible {

    private List<Coup> coupsSubi = new ArrayList<>();

    public Cible attaque(Coup coup) {
        coupsSubi.add(coup);
        return this;
    }

    public List<Coup> getCoupsSubi() {
        return coupsSubi;
    }

    public enum Coup {
        Fleche, Coupure, Trou;
    }

}
