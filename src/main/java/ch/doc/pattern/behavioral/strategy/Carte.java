package ch.doc.pattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Carte {

    private final List<Deplacement> deplacements = new ArrayList<>();

    public void avance(Deplacement deplacement) {
        deplacements.add(deplacement);
    }

    public List<Deplacement> getDeplacements() {
        return deplacements;
    }

    public enum Deplacement {
        Galop, Pas;
    }
}
