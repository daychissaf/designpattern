package ch.doc.pattern.behavioral.strategy;

public class Batiment {

    public Unite creerChevalier() {
        return new Chevalier();
    }

    public Unite creerFantassin() {
        return new Fantassin();
    }

    public Unite creerArcher() {
        return new Archer();
    }

    public Unite creerArcherACheval() {
        return new ArcherACheval();
    }

    public Unite creerLancier() {
        return new Lancier();
    }
}
