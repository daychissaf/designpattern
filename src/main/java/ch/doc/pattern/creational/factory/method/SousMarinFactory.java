package ch.doc.pattern.creational.factory.method;

import ch.doc.pattern.creational.factory.Vehicule;

public class SousMarinFactory {

	static public Vehicule create() {
		return new Vehicule.SousMarin();
	}
}
