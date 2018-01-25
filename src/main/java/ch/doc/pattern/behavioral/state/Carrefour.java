package ch.doc.pattern.behavioral.state;

import org.hamcrest.core.IsInstanceOf;

public class Carrefour {

	private State state;
	private State originState;

	public Carrefour() {
		originState=new OrangeState(this);
	}

	public String changerFeu() {
		
	}

	public void setState(State state) {
		this.state = state;
	}
}
