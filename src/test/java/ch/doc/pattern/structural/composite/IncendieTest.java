package ch.doc.pattern.structural.composite;

import java.util.HashSet;
import java.util.Set;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class IncendieTest {

	@Test
	public void incendie() {
		Flamme flamme = new Flamme();
		arbre().brule(flamme);
		Assertions.assertThat(flamme.elementsBrules()).isEqualTo(21);
	}
	
	/**
	 * 1 arbre :
	 * 	- 3 feuilles
	 * 	- 1 branche
	 * 		- 5 feuilles
	 * 		- 1 branche
	 * 			-10 feuilles
	 * 
	 * total elements : 21
	 * 
	 * @return
	 */
	public Arbre arbre() {
		Set<Inflammable> contenuBranche = new HashSet<Inflammable>();
		contenuBranche.add(new Branche(createFeuille(10)));
		contenuBranche.addAll(createFeuille(5));
		Branche branche = new Branche(contenuBranche);
		
		Set<Inflammable> contenuArbre = new HashSet<Inflammable>();
		contenuArbre.add(branche);
		contenuArbre.addAll(createFeuille(3));
		return new Arbre(contenuArbre);
	}
	
	public Set<Feuille> createFeuille(int count) {
		Set<Feuille> feuilles = new HashSet<Feuille>();
		for (int i = 0; i < count; i++) {
			feuilles.add(new Feuille());
		}
		return feuilles;
	}

}
