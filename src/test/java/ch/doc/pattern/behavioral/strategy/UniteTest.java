package ch.doc.pattern.behavioral.strategy;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import ch.doc.pattern.behavioral.strategy.Carte.Deplacement;
import ch.doc.pattern.behavioral.strategy.Cible.Coup;

public class UniteTest {

    private final Batiment batiment = new Batiment();

    private Cible cible;
    private Carte carte;

    @Before
    public void setUp() {
        cible = new Cible();
        carte = new Carte();
    }

    @Test
    public void testChevalier() {
        Unite unite = batiment.creerChevalier();
        assertThat(unite).isNotNull();
        unite.attaque(cible).avance(carte);
        assertThat(cible.getCoupsSubi()).contains(Coup.Coupure);
        assertThat(carte.getDeplacements()).contains(Deplacement.Galop);
    }

    @Test
    public void testFantassin() {
        Unite unite = batiment.creerFantassin();
        assertThat(unite).isNotNull();
        unite.attaque(cible).avance(carte);
        assertThat(cible.getCoupsSubi()).contains(Coup.Coupure);
        assertThat(carte.getDeplacements()).contains(Deplacement.Pas);
    }

    @Test
    public void testArcher() {
        Unite unite = batiment.creerArcher();
        assertThat(unite).isNotNull();
        unite.attaque(cible).avance(carte);
        assertThat(cible.getCoupsSubi()).contains(Coup.Fleche);
        assertThat(carte.getDeplacements()).contains(Deplacement.Pas);
    }

    @Test
    public void testArcherACheval() {
        Unite unite = batiment.creerArcherACheval();
        assertThat(unite).isNotNull();
        unite.attaque(cible).avance(carte);
        assertThat(cible.getCoupsSubi()).contains(Coup.Fleche);
        assertThat(carte.getDeplacements()).contains(Deplacement.Galop);
    }

    @Test
    public void testLancier() {
        Unite unite = batiment.creerLancier();
        assertThat(unite).isNotNull();
        unite.attaque(cible).avance(carte);
        assertThat(cible.getCoupsSubi()).contains(Coup.Trou);
        assertThat(carte.getDeplacements()).contains(Deplacement.Pas);
    }

}
