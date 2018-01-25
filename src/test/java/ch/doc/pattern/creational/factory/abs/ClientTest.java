package ch.doc.pattern.creational.factory.abs;

import static ch.doc.pattern.creational.factory.Logement.Chateau;
import static ch.doc.pattern.creational.factory.Logement.Grotte;
import static ch.doc.pattern.creational.factory.Logement.Ile;
import static ch.doc.pattern.creational.factory.Logement.Villa;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import ch.doc.pattern.creational.factory.Resource;
import ch.doc.pattern.creational.factory.Vehicule.Ferrari;
import ch.doc.pattern.creational.factory.Vehicule.Renault;
import ch.doc.pattern.creational.factory.Vehicule.SousMarin;
import ch.doc.pattern.creational.factory.Vehicule.Velo;

public class ClientTest {

	private final FactoryFactory object = new VehiculeFactory();

	@Test
	public void testPeu() {
		Client client = new Client(Resource.Peu, object);
		assertThat(client.achete()).isInstanceOf(Velo.class);
		assertThat(client.emmenage()).isEqualTo(Grotte);
	}

	@Test
	public void testNormal() {
		Client client = new Client(Resource.Normal, object);
		assertThat(client.achete()).isInstanceOf(Renault.class);
		assertThat(client.emmenage()).isEqualTo(Villa);
	}

	@Test
	public void testRiche() {
		Client client = new Client(Resource.Beaucoup, object);
		assertThat(client.achete()).isInstanceOf(Ferrari.class);
		assertThat(client.emmenage()).isEqualTo(Chateau);
	}

	@Test
	public void testMilliardaire() {
		Client client = new Client(Resource.Milliardaire, object);
		assertThat(client.achete()).isInstanceOf(SousMarin.class);
		assertThat(client.emmenage()).isEqualTo(Ile);
	}
}
