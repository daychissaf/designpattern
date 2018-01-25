/**
 * 
 */
package ch.doc.pattern.behavioral.state;

/**
 * @author user
 *
 */
public class VertState extends State {

	/* (non-Javadoc)
	 * @see ch.doc.pattern.behavioral.state.State#changerfeu()
	 */
	@Override
	void changerfeu() {
		this.carrefour.setState(new RougeState());
	}

}
