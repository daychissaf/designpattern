package ch.doc.pattern.structural.adapter;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ChefTest {

	@Test
	public void testDirection() {
		List<? extends Travailleur> travailleurs = embaucher();
		Chef chef = new Chef();
		List<String> production = chef.dirige(travailleurs);
		assertThat(production).hasSize(3);
		assertThat(production).contains(Worker.WORK);
	}

	private List<? extends Travailleur> embaucher() {
		return Arrays.asList(new Employee(), new Employee()/*, new Worker()*/);
	}

}
