package hausuebung4;

import java.util.Scanner;

public class _GTA {

	public static void main(String[] args) {
		while (Laeuft) {

			if (Treibstoff == 0) {

				System.out.println("Kein Treibstoff mehr, wollen sie tanken oder das Spiel beenden?(Tanken, Ende)");

				String Tanken = scan.nextLine();

				if (Tanken.equalsIgnoreCase("Tanken")) {

					Tanken();

				} else if (Tanken.equalsIgnoreCase("Ende")) {

					Ende();

				} else {

					System.out.println("Ung�ltige Eingabe.");
				}

			} else {

				Fahren();

			}

		}

	}

	static Scanner scan = new Scanner(System.in);

	static int Treibstoff = 1;

	static boolean Laeuft = true;

	static void Tanken() {

		System.out.println("Wieviel Liter m�chten Sie tanken?(max 10)");

		int Liter = scan.nextInt();

		if (Liter > 0 && Liter <= 10) {

			Treibstoff = Liter;
			Abfangen();
			Fahren();

		} else {

			System.out.println("Ung�ltige Literanzahl gew�hlt.");

		}

	}

	static void Fahren() {

		System.out.println("In welche Richtung m�chten Sie fahren?(Norden, Osten, S�den, Westen, Ende)");
		System.out.println("Treibstoffstand: " + Treibstoff);
		String Richtung = scan.nextLine();

		if (Richtung.equalsIgnoreCase("Norden")) {

			System.out.println("Sie fahren nach Norden.");
			Treibstoff--;

		} else if (Richtung.equalsIgnoreCase("S�den")) {

			System.out.println("Sie fahren nach S�den.");
			Treibstoff--;

		} else if (Richtung.equalsIgnoreCase("Westen")) {

			System.out.println("Sie fahren nach Westen.");
			Treibstoff--;

		} else if (Richtung.equalsIgnoreCase("Osten")) {

			System.out.println("Sie fahren nach Osten.");
			Treibstoff--;

		} else if (Richtung.equalsIgnoreCase("Ende")) {

			Ende();

		} else {

			System.out.println("Ung�ltige Eingabe");

		}

	}

	static void Ende() {

		System.out.println("Sind Sie sicher, dass Sie das Spiel beenden wollen?(Ja, Nein)");

		String Antwort = scan.nextLine();

		if (Antwort.equalsIgnoreCase("Ja")) {

			System.out.println("Spiel beendet.");
			Laeuft = false;

		} else if (Antwort.equalsIgnoreCase("Nein")) {

		} else {

			System.out.println("Ung�ltige Eingabe.");

		}

	}

	static void Abfangen() {

		// Nach der Treibstoff Eingabe bekomme ich immer einer automatische Eingabe
		// ohne die tastatur zu werwenden welche in die Fahren Methode eingeht
		// und "ung�ltige Eingabe." ausl�st Ich habe Abfangen eingebaut um diese
		// abzufangen

		String Abfangen = scan.nextLine();

		//System.out.println(Abfangen);
	}

}
