package ch.doc.pattern.creational.factory.abs;

import ch.doc.pattern.creational.factory.Logement;
import ch.doc.pattern.creational.factory.Resource;
import ch.doc.pattern.creational.factory.Vehicule;

public class Client {

	private final Resource resource;
	private final FactoryFactory object;

	public Client(Resource resource, FactoryFactory object) {
		this.resource = resource;
		this.object = null;
	}

	public Vehicule achete() {
		// return this.object.
		return null;
	}

	public Logement emmenage() {
		return null;// this.object.createLogement();
	}
}
