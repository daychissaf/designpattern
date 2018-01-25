package ch.doc.pattern.creational.singleton;

import static java.lang.reflect.Modifier.isPrivate;
import static org.fest.assertions.Assertions.assertThat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import ch.doc.pattern.creational.singleton.Singleton;

public class SingletonTest {

	@Test
	public void testIdentity() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		assertThat(instance1).isSameAs(instance2);
	}
	
	@Test
	public void testVisibility() {
		for (Constructor<?> constructor : Singleton.class.getConstructors()) {
			assertThat(isPrivate(constructor.getModifiers())).isTrue();
		}
	}

}
