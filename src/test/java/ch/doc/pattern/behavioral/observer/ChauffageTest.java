package ch.doc.pattern.behavioral.observer;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import ch.doc.pattern.behavioral.observer.Chauffage.Allume;
import ch.doc.pattern.behavioral.observer.Chauffage.Etat;
import ch.doc.pattern.behavioral.observer.Chauffage.Eteint;

public class ChauffageTest {

	@Test
	public void testChauffage() {
		Thermometre thermometre = new Thermometre(10);
		Chauffage chauffage = new Chauffage(thermometre);
		assertThat(chauffage.getEtat()).isEqualTo(Etat.allume);
        assertThat(chauffage.getStatut()).isInstanceOf(Allume.class);
		thermometre.setTemperature(22);
		assertThat(chauffage.getEtat()).isEqualTo(Etat.eteint);
        assertThat(chauffage.getStatut()).isInstanceOf(Eteint.class);
		thermometre.setTemperature(21);
		assertThat(chauffage.getEtat()).isEqualTo(Etat.eteint);
        assertThat(chauffage.getStatut()).isInstanceOf(Eteint.class);
		thermometre.setTemperature(19);
		assertThat(chauffage.getEtat()).isEqualTo(Etat.allume);
        assertThat(chauffage.getStatut()).isInstanceOf(Allume.class);
	}

}
