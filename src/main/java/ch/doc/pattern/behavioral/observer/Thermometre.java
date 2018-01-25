package ch.doc.pattern.behavioral.observer;

public class Thermometre {

	private int temperature;
	
	public Thermometre(int temperature) {
		this.temperature = temperature;
	}
	
	public void setTemperature(int temperature) {
		if (this.temperature != temperature) {
			this.temperature = temperature;
		}
	}
	
	public int getTemperature() {
		return temperature;
	}
	
}
