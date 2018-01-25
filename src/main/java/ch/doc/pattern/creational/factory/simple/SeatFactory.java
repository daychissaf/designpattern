/**
 * 
 */
package ch.doc.pattern.creational.factory.simple;

import ch.doc.pattern.creational.factory.Vehicule;
import ch.doc.pattern.creational.factory.simple.Seat.Moteur;
import ch.doc.pattern.creational.factory.simple.Seat.Roue;

/**
 * @author user
 *
 */
public class SeatFactory {
	
	public static Vehicule generate(){
		Seat v=new Seat();
		v.addRoue(new Roue());
		v.addRoue(new Roue());
		v.addRoue(new Roue());
		v.addRoue(new Roue());
		v.setMoteur(new Moteur());
		return v;
		
	}

}
