package ch.doc.pattern.behavioral.template;

public abstract class PrendreRepas {

	public void prendreRepas() {
		preparatifDuRepas();
		System.out.println("manger");
		apresLeRepas();
	}
	
	public abstract void preparatifDuRepas();
	public abstract void apresLeRepas();
}
