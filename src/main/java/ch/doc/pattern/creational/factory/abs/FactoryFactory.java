/**
 * 
 */
package ch.doc.pattern.creational.factory.abs;

import ch.doc.pattern.creational.factory.Resource;

/**
 * @author user
 *
 */
public interface FactoryFactory {

	public Factory createFactory(Resource ressource);
}
