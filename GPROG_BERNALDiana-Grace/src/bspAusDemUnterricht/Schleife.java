package bspAusDemUnterricht;

public class Schleife {

	public static void main(String[] args) {

		int anzahl = 0;
		int min = 333, max = 789;

		for (int i = 333; i <= 789; i++) {

			if (i % 2 == 0) {
				anzahl++;
			}
		}

		System.out.println(anzahl + " (gerade) Zahlen gibt  es zwischen " + min + " und " + max);

	}

}
