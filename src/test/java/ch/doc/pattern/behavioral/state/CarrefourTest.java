package ch.doc.pattern.behavioral.state;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class CarrefourTest {

	@Test
	public void testChangementFeu() {
        Carrefour carrefour = new Carrefour();
		assertThat(carrefour.changerFeu()).isEqualTo("orange");
		assertThat(carrefour.changerFeu()).isEqualTo("vert");
		assertThat(carrefour.changerFeu()).isEqualTo("orange");
		assertThat(carrefour.changerFeu()).isEqualTo("rouge");
		assertThat(carrefour.changerFeu()).isEqualTo("orange");
		assertThat(carrefour.changerFeu()).isEqualTo("vert");
	}

}
