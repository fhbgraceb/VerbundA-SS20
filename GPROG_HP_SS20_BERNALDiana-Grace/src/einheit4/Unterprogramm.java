package einheit4;

public class Unterprogramm {

	public static void main(String[] args) {

		addieren(4, 6);

		multiplizieren(10, 2);

		multiplizieren(33, 2);

		int userEingaben = 34;
		int nochEineZahl = 50;

		multiplizieren(userEingaben, nochEineZahl);

		anreden(true, "Deutsch");

		anreden(false, "Deutsch");

	}

	static void anreden(boolean isMann, String name) {

		if (isMann) {
			System.out.println("Sehr geehrte Herr " + name);
		} else {

			System.out.println("Sehr geehrte Frau " + name);
		}

	}

	private static void multiplizieren(int i, int j) {

		int erg = 0;

		erg = i * j;

		System.out.println("Ergebnis: " + erg);

	}

	static void addieren(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		System.out.println("Das Ergebnis lautet: " + ergebnis);

	}

}
