/**
 * 
 */
package ch.doc.pattern.behavioral.state;

/**
 * @author user
 *
 */
public abstract class State {

	Carrefour carrefour;

	public State(Carrefour carrefour) {
		this.carrefour = carrefour;
	}

	abstract void changerfeu();
}
