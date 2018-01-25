/**
 * 
 */
package ch.doc.pattern.creational.factory.abs;

import ch.doc.pattern.creational.factory.Logement;
import ch.doc.pattern.creational.factory.Vehicule;

/**
 * @author user
 *
 */
public class FerrariFactory implements Factory {

	@Override
	public Logement createLogement() {
		return Logement.Chateau;
	}

	@Override
	public Vehicule createVehicule() {
		return new Vehicule.Ferrari();
	}

}
