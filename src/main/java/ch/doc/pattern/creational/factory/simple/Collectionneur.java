package ch.doc.pattern.creational.factory.simple;

import ch.doc.pattern.creational.factory.Vehicule;

public class Collectionneur {

    public Vehicule acheterVoiture() {
        return SeatFactory.generate();
    }
}
