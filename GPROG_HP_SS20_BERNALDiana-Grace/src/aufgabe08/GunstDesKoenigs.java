package aufgabe08;

public class GunstDesKoenigs {

	public static void main(String[] args) {

		boolean tuer[] = new boolean[100];
		int i = 0; // Laufvariable für die Türen, beginnt somit bei 0, da Array bei 0-ter Position
					// zum "zählen" beginnt
		int j = 1; // Läufer für die Durchläufe, da bei 1 beginnt muss die Schleife/Grenze 101 sein

		while (i < 100) {
			tuer[i] = true;
			i = i + 1;
		} // alle türen aufmachen, auf = true

		// Zum Testen
		// aktuelleSituation(tuer);

		// Nun folgen die Durchgänge

		while (j < 101) {

			// Alle Türen durchgehn
			i = 0;

			while (i < 100) {
				if ((i + 1) % j == 0) {
					tuer[i] = !tuer[i];
				}
				i = i + 1;
			}

			aktuelleSituation(tuer);
			j = j + 1;
		}

	}

	private static void aktuelleSituation(boolean[] tuer) {

		int i = 0;
		int counter = 0;
		while (i < 100) {
			if (tuer[i]) { // tuer an i Position ist bereits ein boolean, und sofern Tür offen = true
				System.out.println("Tür an der Position  " + (i + 1) + " ist offen");
				counter++;
			} else { // false, somit geschlossen
				System.out.println("Tür an der Position  " + (i + 1) + " ist geschlossen");
			}

			i = i + 1;
		}

		System.out.println("Offen sind Türen: " + counter);

	}

}
