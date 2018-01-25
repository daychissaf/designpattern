/**
 * 
 */
package ch.doc.pattern.creational.factory.abs;

import ch.doc.pattern.creational.factory.Resource;

/**
 * @author user
 *
 */
public class VehiculeFactory implements FactoryFactory {

	@Override
	public Factory createFactory(Resource ressource) {
		switch (ressource) {
		case Peu:
			return new VeloFactory();
		case Beaucoup:
			return new FerrariFactory();
		case Milliardaire:
			return new SousMarinFactory();
		case Normal:
			return new RenaultFactory();
		default:
			throw new IllegalArgumentException(ressource.name());

		}

	}
}
