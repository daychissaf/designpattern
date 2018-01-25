/**
 * 
 */
package ch.doc.pattern.behavioral.state;

/**
 * @author user
 *
 */
public class OrangeState extends State {

	public OrangeState(Carrefour carrefour) {
		super(carrefour);
	}

	@Override
	void changerfeu() {
		this.carrefour.setState(new VertState());
	}

}
