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
public class VeloFactory implements Factory {

	@Override
	public Logement createLogement() {
		return Logement.Villa;
	}

	@Override
	public Vehicule createVehicule() {
		return new Vehicule.Velo();
	}

}
