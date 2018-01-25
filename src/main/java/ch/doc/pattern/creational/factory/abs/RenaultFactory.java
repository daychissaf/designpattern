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
public class RenaultFactory implements Factory {

	@Override
	public Logement createLogement() {
		return Logement.Grotte;
	}

	@Override
	public Vehicule createVehicule() {
		return new Vehicule.Renault();
	}

}
