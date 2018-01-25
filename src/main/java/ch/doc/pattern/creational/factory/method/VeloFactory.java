/**
 * 
 */
package ch.doc.pattern.creational.factory.method;

import ch.doc.pattern.creational.factory.Vehicule;

/**
 * @author user
 *
 */
public class VeloFactory {
	public Vehicule create() {
		return new Vehicule.Velo();
	}

}
