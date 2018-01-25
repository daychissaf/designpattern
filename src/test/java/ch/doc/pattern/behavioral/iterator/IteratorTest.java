package ch.doc.pattern.behavioral.iterator;

import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void testIteration() {
		List<String> chaine = new ArrayList<>(Arrays.asList("Bonjour à tous, c'est un plaisir de vous rencontrer".split(" ")));
		int count = chaine.size();
		Iterator<String> iterator = chaine.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" ");
		}
		
		System.out.println();
		
		iterator = chaine.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("vous")) {
				iterator.remove();
			}
		}
		
		iterator = chaine.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" ");
		}
		
		System.out.println();
		
		assertThat(chaine).hasSize(count-1);
		assertThat(chaine).excludes("vous");
	}

}
