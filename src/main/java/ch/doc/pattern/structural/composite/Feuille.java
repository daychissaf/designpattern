package ch.doc.pattern.structural.composite;


public class Feuille implements Inflammable {

	public void brule(Flamme flamme) {
		flamme.brule(this);
	}
}
