package ch.doc.pattern.creational.singleton;

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	// une method static qui instancie instance
	static private Singleton LazyHolder(){
		return null;
	}

	synchronized public static final Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
