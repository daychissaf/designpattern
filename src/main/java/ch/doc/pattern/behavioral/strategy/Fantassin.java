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
public class Fantassin implements Unite {

	@Override
	public Unite attaque(Cible cible) {
		cible.attaque(Coup.Coupure);
		return this;
	}

	@Override
	public Unite avance(Carte carte) {
		carte.avance(Deplacement.Pas);
		return this;
	}

}
