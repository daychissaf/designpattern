package ch.doc.pattern.creational.factory.method;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import ch.doc.pattern.creational.factory.Resource;
import ch.doc.pattern.creational.factory.Vehicule.Ferrari;
import ch.doc.pattern.creational.factory.Vehicule.Renault;
import ch.doc.pattern.creational.factory.Vehicule.SousMarin;
import ch.doc.pattern.creational.factory.Vehicule.Velo;

public class AcquereurTest {

    private final VehiculeFactory object = new VehiculeFactory();

    @Test
    public void testPeu() {
        Acquereur acquereur = new Acquereur(Resource.Peu, object);
        assertThat(acquereur.acheterVehicule()).isInstanceOf(Velo.class);
    }

    @Test
    public void testStandard() {
        Acquereur acquereur = new Acquereur(Resource.Normal, object);
        assertThat(acquereur.acheterVehicule()).isInstanceOf(Renault.class);
    }

    @Test
    public void testRiche() {
        Acquereur acquereur = new Acquereur(Resource.Beaucoup, object);
        assertThat(acquereur.acheterVehicule()).isInstanceOf(Ferrari.class);
    }
    @Test
    public void testMilliardaire() {
        Acquereur acquereur = new Acquereur(Resource.Milliardaire, object);
        assertThat(acquereur.acheterVehicule()).isInstanceOf(SousMarin.class);
    }

}
