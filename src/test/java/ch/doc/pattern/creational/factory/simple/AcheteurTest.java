package ch.doc.pattern.creational.factory.simple;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import ch.doc.pattern.creational.factory.Vehicule;
import ch.doc.pattern.creational.factory.simple.Acheteur;
import ch.doc.pattern.creational.factory.simple.Collectionneur;

public class AcheteurTest {


    @Test
    public void testAcheteur() {
        Acheteur acheteur = new Acheteur();
        Vehicule voiture = acheteur.acheterVoiture();
        assertThat(voiture).isNotNull().isInstanceOf(Seat.class);
        assertThat(voiture.roule()).isEqualTo("Vroum");
    }

    @Test
    public void testCollectionneur() {
        Collectionneur acheteur = new Collectionneur();
        Vehicule voiture = acheteur.acheterVoiture();
        assertThat(voiture).isNotNull().isInstanceOf(Seat.class);
        assertThat(voiture.roule()).isEqualTo("Vroum");
    }

}
