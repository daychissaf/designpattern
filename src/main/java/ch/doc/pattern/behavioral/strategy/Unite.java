package ch.doc.pattern.behavioral.strategy;

public interface Unite {

    Unite attaque(Cible cible);

    Unite avance(Carte carte);
}
