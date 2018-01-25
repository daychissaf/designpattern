/**
 * 
 */
package ch.doc.pattern.behavioral.state;

/**
 * @author user
 *
 */
public class RougeState extends State {

	public RougeState(Carrefour carrefour) {
		super(carrefour);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.doc.pattern.behavioral.state.State#changerfeu()
	 */
	@Override
	void changerfeu() {
		this.carrefour.setState(new VertState());
	}

}
