package ch.doc.pattern.creational.factory;

public interface Vehicule {
	String roule();

    public class Ferrari implements Vehicule {

        public static final String BRUIT = "Vrooooooooum";

        @Override
        public String roule() {
            return BRUIT;
        }

    }

    public class Renault implements Vehicule {

        public static final String BRUIT = "Vr...oum";

        @Override
        public String roule() {
            return BRUIT;
        }

    }

    public class SousMarin implements Vehicule {

        @Override
        public String roule() {
            return "blup";
        }

    }

    public class Velo implements Vehicule {

        public static final String BRUIT = "Pouet";

        @Override
        public String roule() {
            return BRUIT;
        }

    }

}
