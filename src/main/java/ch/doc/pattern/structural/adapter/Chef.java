package ch.doc.pattern.structural.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Chef {

	public List<String> dirige(Collection<? extends Travailleur> travailleurs) {
		List<String> production = new ArrayList<String>();
		for (Travailleur travailleur : travailleurs) {
			production.add(travailleur.travail());
		}
		return production;
	}
}

