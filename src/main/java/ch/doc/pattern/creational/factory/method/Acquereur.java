package ch.doc.pattern.creational.factory.method;

import ch.doc.pattern.creational.factory.Resource;
import ch.doc.pattern.creational.factory.Vehicule;

public class Acquereur {

    private final Resource resource;
	private final VehiculeFactory object;

	public Acquereur(Resource resource, VehiculeFactory object) {
		this.resource = resource;
		this.object = object;
	}

	public Vehicule acheterVehicule() {
		return this.object.create(this.resource);
	}

}
