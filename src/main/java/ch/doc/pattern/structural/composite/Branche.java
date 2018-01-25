package ch.doc.pattern.structural.composite;

import java.util.HashSet;
import java.util.Set;

public class Branche implements Inflammable {

private final Set<? extends Inflammable> composantes;
	
	public Branche(Set<? extends Inflammable> composantes) {
		this.composantes = new HashSet<Inflammable>(composantes);
	}
	
	public void brule(Flamme flamme) {
		flamme.brule(this);
		for (Inflammable composant : composantes) {
			composant.brule(flamme);
		}
	}
}
