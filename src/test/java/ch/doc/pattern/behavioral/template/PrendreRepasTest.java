package ch.doc.pattern.behavioral.template;

import org.junit.Test;

public class PrendreRepasTest {

	@Test
	public void testPrendreRepasMcDo() {
		System.out.println("Prendre repas McDo");
		System.out.println("==================");
		new PrendreRepasMcDo().prendreRepas();
		System.out.println();
	}
	
	@Test
	public void testPrendreRepasMaison() {
		System.out.println("Prendre repas Maison");
		System.out.println("====================");
		new PrendreRepasMaison().prendreRepas();
	}
}
