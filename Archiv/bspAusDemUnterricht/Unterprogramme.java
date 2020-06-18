package bspAusDemUnterricht;

public class Unterprogramme {

	public static void main(String[] args) {

		// "Klassischer" Ansatz zur z.B.: Addition
		int zahl1 = 5;
		int zahl2 = 10;
		int ergebnis = zahl1 + zahl2;

		System.out.println(ergebnis);

		// oder gelöst mit einer Methode

		addieren(234, 1);

		addieren(34, 45);

		// gleiches Prinzip, anderer Inhalt
		rechteck(10, 20);

	}

	private static void rechteck(int laengeA, int laengeB) {

		int flaeche = laengeB * laengeA;

		System.out.println("Die Fläche beläuft sich auf: " + flaeche);
		
		// Methode mit Ausgabe, aber ohne Rückgabewert an den Aufrufer,
		// hier gilt grundsätzlich entweder/oder

	}

	private static void addieren(int ersteZahl, int zweiteZahl) {

		int sum = ersteZahl + zweiteZahl;

		System.out.println("Das Ergebnis lautet: " + sum);

	}

}
