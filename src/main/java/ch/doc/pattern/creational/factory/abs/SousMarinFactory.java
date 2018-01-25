package ch.doc.pattern.creational.factory.abs;

import ch.doc.pattern.creational.factory.Logement;
import ch.doc.pattern.creational.factory.Vehicule;

public class SousMarinFactory implements Factory {

	@Override
	public Logement createLogement() {
		return Logement.Ile;
	}

	@Override
	public Vehicule createVehicule() {
		return new Vehicule.SousMarin();
	}
}
