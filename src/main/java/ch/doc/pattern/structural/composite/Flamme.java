package ch.doc.pattern.structural.composite;

public class Flamme {

	private int count = 0;
	
	public void brule(Inflammable inflammable) {
		increment();
	}
	
	public void increment() {
		count++;
	}
	
	public int elementsBrules() {
		return count;
	}
}
