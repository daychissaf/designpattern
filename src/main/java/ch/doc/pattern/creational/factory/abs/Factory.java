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
public interface Factory {

	public Logement createLogement();

	public Vehicule createVehicule();

}
