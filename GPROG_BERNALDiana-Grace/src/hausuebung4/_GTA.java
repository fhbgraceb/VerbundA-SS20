package hausuebung4;

import java.util.Scanner;

public class _GTA {

	public static void main(String[] args) {

		while (Leuft) {

			if (Treibstoff == 0) {

				System.out.println("Kein Treibstoff mehr, wollen sie tanken oder das Spiel beenden?(Tanken, Ende)");

				String Tanken = scan.nextLine();

				if (Tanken.equalsIgnoreCase("Tanken")) {

					Tanken();

				} else if (Tanken.equalsIgnoreCase("Ende")) {

					Ende();

				} else {

					System.out.println("Ungeltige Eingabe.");
				}

			} else {

				Fahren();

			}

		}

	}

	static Scanner scan = new Scanner(System.in);

	static int Treibstoff = 1;

	static boolean Leuft = true;

	static void Tanken() {

		System.out.println("Wieviel Liter mechten Sie tanken?(max 10)");

		Treibstoff = scan.nextInt();

		if (Treibstoff > 0 && Treibstoff <= 10) {

			//Treibstoff = Liter;
			Abfangen();
			Fahren();

		} else {

			System.out.println("Ungeltige Literanzahl gewehlt.");

		}

	}

	static void Fahren() {

		System.out.println("In welche Richtung mechten Sie fahren?(Norden, Osten, Seden, Westen, Ende)");
		System.out.println("Treibstoffstand: " + Treibstoff);
		String Richtung = scan.nextLine();

		if (Richtung.equalsIgnoreCase("Norden")) {

			System.out.println("Sie fahren nach Norden.");
			Treibstoff--;

		} else if (Richtung.equalsIgnoreCase("Seden")) {

			System.out.println("Sie fahren nach Seden.");
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

			System.out.println("Ungeltige Eingabe");

		}

	}

	static void Ende() {

		System.out.println("Sind Sie sicher, dass Sie das Spiel beenden wollen?(Ja, Nein)");

		String Antwort = scan.nextLine();

		if (Antwort.equalsIgnoreCase("Ja")) {

			System.out.println("Spiel beendet.");
			Leuft = false;

		} else if (Antwort.equalsIgnoreCase("Nein")) {

		} else {

			System.out.println("Ungeltige Eingabe.");

		}

	}

	static void Abfangen() {

		// Nach der Treibstoff Eingabe bekomme ich immer einer automatische Eingabe
		// ohne die tastatur zu werwenden welche in die Fahren Methode eingeht
		// und "ungeltige Eingabe." auslest Ich habe Abfangen eingebaut um diese
		// abzufangen

		String Abfangen = scan.nextLine();

		//System.out.println(Abfangen);
	}

}
