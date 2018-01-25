/**
 * 
 */
package ch.doc.pattern.creational.factory.method;

import ch.doc.pattern.creational.factory.Resource;
import ch.doc.pattern.creational.factory.Vehicule;

/**
 * @author user
 *
 */
public class VehiculeFactory {

	public Vehicule create(Resource ressource) {
		switch (ressource) {
		case Peu:
			return new VeloFactory().create();
		case Beaucoup:
			return new FerrariFactory().create();
		case Milliardaire:
			return new Vehicule.SousMarin();
		case Normal:
			return new Vehicule.Renault();
		default:
			throw new IllegalArgumentException(ressource.name());
			
		}

	}

}
