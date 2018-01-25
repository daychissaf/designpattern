package ch.doc.pattern.behavioral.observer;

public class Chauffage {

	public static enum Etat{allume, eteint}

	private static final int LIMIT = 20;

	private Etat etat = Etat.eteint;
    private Statut statut = new Eteint();

	public Chauffage(Thermometre thermometre) {
		reglerChauffage(thermometre.getTemperature());
	}

	public void reglerChauffage(int temperature) {
		if (temperature < LIMIT) {
			etat = Etat.allume;
            statut = statut.allumer();
		} else {
			etat = Etat.eteint;
            statut = statut.eteindre();
		}
	}

	public Etat getEtat() {
		return etat;
	}

    public Statut getStatut() {
        return statut;
    }

    public static interface Statut {
        public Statut allumer();
        public Statut eteindre();
    }

    public static class Allume implements Statut {

        @Override
        public Statut allumer() {
            return this;
        }

        @Override
        public Statut eteindre() {
            return new Eteint();
        }

    }

    public static class Eteint implements Statut {

        @Override
        public Statut allumer() {
            return new Allume();
        }

        @Override
        public Statut eteindre() {
            return this;
        }

    }
}
