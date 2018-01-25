/**
 * 
 */
package ch.doc.pattern.behavioral.strategy;

import ch.doc.pattern.behavioral.strategy.Carte.Deplacement;
import ch.doc.pattern.behavioral.strategy.Cible.Coup;

/**
 * @author user
 *
 */
public class ArcherACheval implements Unite {

	@Override
	public Unite attaque(Cible cible) {
		cible.attaque(Coup.Fleche);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ch.doc.pattern.behavioral.strategy.Unite#avance(ch.doc.pattern.behavioral
	 * .strategy.Carte)
	 */
	@Override
	public Unite avance(Carte carte) {
		carte.avance(Deplacement.Galop);
		return this;
	}

}
