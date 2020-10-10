package aufgabe08;

public class GunstDesKoenigs {

	public static void main(String[] args) {

		boolean tuer[] = new boolean[100];
		int i = 0; // Laufvariable f�r die T�ren, beginnt somit bei 0, da Array bei 0-ter Position
					// zum "z�hlen" beginnt
		int j = 1; // L�ufer f�r die Durchl�ufe, da bei 1 beginnt muss die Schleife/Grenze 101 sein

		while (i < 100) {
			tuer[i] = true;
			i = i + 1;
		} // alle t�ren aufmachen, auf = true

		// Zum Testen
		// aktuelleSituation(tuer);

		// Nun folgen die Durchg�nge

		while (j < 101) {

			// Alle T�ren durchgehn
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
			if (tuer[i]) { // tuer an i Position ist bereits ein boolean, und sofern T�r offen = true
				System.out.println("T�r an der Position  " + (i + 1) + " ist offen");
				counter++;
			} else { // false, somit geschlossen
				System.out.println("T�r an der Position  " + (i + 1) + " ist geschlossen");
			}

			i = i + 1;
		}

		System.out.println("Offen sind T�ren: " + counter);

	}

}
