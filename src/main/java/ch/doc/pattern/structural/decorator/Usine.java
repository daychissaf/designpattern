package ch.doc.pattern.structural.decorator;

public class Usine {

	// ______________________________________________________________________
	// Déclarations
	static interface Voiture {
		public double getPrix();
	}
	 
	static class AstonMartin implements Voiture {
		@Override
		public double getPrix() {
			return 999.99;
		}
	}
	 
	// ______________________________________________________________________
	// Décorateurs
	static abstract class Option implements Voiture {
		protected Voiture _originale;
		protected double _tarifOption;
	 
		public Option(Voiture originale, double tarif) {
			_originale = originale;
			_tarifOption += tarif;
		}
	 
		@Override
		public double getPrix() {
			return _originale.getPrix() + _tarifOption;
		}
	}
	 
	static class VoitureAvecClimatisation extends Option {
		public VoitureAvecClimatisation(Voiture originale) {
			super(originale, 1.0);
		}
	}
	 
	static class VoitureAvecParachute extends Option {
		public VoitureAvecParachute(Voiture originale) {
			super(originale, 10.0);
		}
	}
	 
	static class VoitureAmphibie extends Option {
		public VoitureAmphibie(Voiture originale) {
			super(originale, 100.0);
		}
	}
	
	public static void main(String[] args) {
		Voiture astonMartin = 
                new VoitureAvecClimatisation(new AstonMartin()); // Climatisation de série
		astonMartin = 
                new VoitureAvecParachute(astonMartin); // Ajout d'une option (décorateur)
		astonMartin = new VoitureAmphibie(astonMartin);
 
		System.out.println(String.format("Prix = %.2f€", astonMartin.getPrix())); 
                // affiche "Prix = 1110,99€"
	}
}
