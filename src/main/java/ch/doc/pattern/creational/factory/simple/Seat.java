package ch.doc.pattern.creational.factory.simple;

import java.util.HashSet;
import java.util.Set;

import ch.doc.pattern.creational.factory.Vehicule;

public class Seat implements Vehicule {

	private Set<Seat.Roue> roues = new HashSet<>();
	private Seat.Moteur moteur;

	public void setMoteur(Seat.Moteur moteur) {
		this.moteur = moteur;
	}

	public void addRoue(Seat.Roue roue) {
		roues.add(roue);
	}

	@Override
	public String roule() {
		if (roues.size() == 4 && moteur != null) {
			return "Vroum";
		}
		return "Crash";
	}

	public static class Roue {
	}

	public static class Moteur {
	}
}