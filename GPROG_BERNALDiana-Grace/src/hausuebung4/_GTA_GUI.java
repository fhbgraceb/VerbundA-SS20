package hausuebung4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.text.DecimalFormat;

public class _GTA_GUI {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "WILLKOMMEN BEI GTA SAN AUTOBUS.");

		Spielen();

		while (Läuft) {

			if (Count >= 15) {

				Gewinn();

			} else {

				if (Treibstoff == 0) {

					String Tanken = JOptionPane.showInputDialog(
							"Kein Treibstoff mehr, wollen sie tanken oder das Spiel beenden?(Tanken, Ende)");

					if (Tanken.equalsIgnoreCase("Tanken")) {

						Tanken();

					} else if (Tanken.equalsIgnoreCase("Ende")) {

						Ende();

					} else {

						JOptionPane.showMessageDialog(null, "Ungültige Eingabe.");

					}

				} else {

					Fahren();

				}
			}

		}

	}

	static Scanner scan = new Scanner(System.in);

	static int Treibstoff = 5;

	static boolean Läuft = false;

	static DecimalFormat f = new DecimalFormat("#0.00");

	static int Ocount = 0;
	static int Wcount = 0;
	static int Scount = 0;
	static int Ncount = 0;
	static int Tcount = 0;
	static int Count = 0;

	static int Wahrscheinlichkeit;

	static int Oben = 25;
	static int Unten = 1;

	static Double Doben = Double.valueOf(Oben);
	static Double Dunten = Double.valueOf(Unten);
	static Double Wskt = Dunten / Doben * 100;

	static String LRichtung = "";

	static void Spielen() {

		String Spielen = JOptionPane.showInputDialog("Möchten Sie spielen?(Ja, Nein)");

		if (Spielen.equalsIgnoreCase("Ja")) {

			JOptionPane.showMessageDialog(null,
					"Sie flüchten vor der Polizei und müssen einen Weg finden sie abzuhängen.");

			JOptionPane.showMessageDialog(null, "Wahrscheinlichkeit erwischt zu werden: " + f.format(Wskt) + "%");

			Läuft = true;

		} else if (Spielen.equalsIgnoreCase("Nein")) {

		} else {

			JOptionPane.showMessageDialog(null, "Ungültige Eingabe.");
			Spielen();
		}

	}

	static void Polizei() {

		Oben--;
		Doben = Double.valueOf(Oben);
		Wskt = Dunten / Doben * 100;

		if (Oben <= 1) {

			JOptionPane.showMessageDialog(null, "Die Polizei hat dich erwischt.");

			JOptionPane.showMessageDialog(null,
					"Sie sind gefahren:" + "\n" + "Insgesamt: " + Count + " mal \n" + "Nach Norden: " + Ncount
							+ " mal \n" + "Nach Osten: " + Ocount + " mal \n" + "Nach Süden: " + Scount + " mal \n"
							+ "Nach Westen: " + Wcount + " mal \n" + "Tankungen: " + Tcount);

			JOptionPane.showMessageDialog(null, "Spiel beendet.");

			Läuft = false;

		} else {

			JOptionPane.showMessageDialog(null, "Wahrscheinlichkeit erwischt zu werden: " + f.format(Wskt) + "%");

			Wahrscheinlichkeit = ThreadLocalRandom.current().nextInt(Unten, Oben);
		}

		if (Wahrscheinlichkeit <= 1) {

			JOptionPane.showMessageDialog(null, "Die Polizei hat dich erwischt.");

			JOptionPane.showMessageDialog(null,
					"Sie sind gefahren:" + "\n" + "Insgesamt: " + Count + " mal \n" + "Nach Norden: " + Ncount
							+ " mal \n" + "Nach Osten: " + Ocount + " mal \n" + "Nach Süden: " + Scount + " mal \n"
							+ "Nach Westen: " + Wcount + " mal \n" + "Tankungen: " + Tcount);

			JOptionPane.showMessageDialog(null, "Spiel beendet.");

			Läuft = false;

		} else {

		}

	}

	static void Gewinn() {

		JOptionPane.showMessageDialog(null, "Sie haben die Polizei abgehängt.");

		JOptionPane.showMessageDialog(null,
				"Sie sind gefahren:" + "\n" + "Insgesamt: " + Count + " mal \n" + "Nach Norden: " + Ncount + " mal \n"
						+ "Nach Osten: " + Ocount + " mal \n" + "Nach Süden: " + Scount + " mal \n" + "Nach Westen: "
						+ Wcount + " mal \n" + "Tankungen: " + Tcount);

		JOptionPane.showMessageDialog(null, "Spiel beendet.");

		Läuft = false;
	}

	static void Tanken() {

		String SLiter = JOptionPane.showInputDialog("Wieviel Liter möchten Sie tanken?(max 10)");

		int Liter = Integer.valueOf(SLiter);

		if (Liter > 0 && Liter <= 10) {

			Treibstoff = Liter;
			Tcount++;

			if (Liter <= 2) {

			} else if (Liter <= 4) {

				Oben--;
				
				Doben = Double.valueOf(Oben);
				Wskt = Dunten / Doben * 100;
				
				JOptionPane.showMessageDialog(null, "Wahrscheinlichkeit erwischt zu werden: " + f.format(Wskt) + "%");

			} else if (Liter <= 6) {

				Oben = Oben - 2;
				
				Doben = Double.valueOf(Oben);
				Wskt = Dunten / Doben * 100;
				
				JOptionPane.showMessageDialog(null, "Wahrscheinlichkeit erwischt zu werden: " + f.format(Wskt) + "%");

			} else if (Liter <= 8) {

				Oben = Oben - 3;
				
				Doben = Double.valueOf(Oben);
				Wskt = Dunten / Doben * 100;
				
				JOptionPane.showMessageDialog(null, "Wahrscheinlichkeit erwischt zu werden: " + f.format(Wskt) + "%");

			} else {

				Oben = Oben - 4;
				
				Doben = Double.valueOf(Oben);
				Wskt = Dunten / Doben * 100;
				
				JOptionPane.showMessageDialog(null, "Wahrscheinlichkeit erwischt zu werden: " + f.format(Wskt) + "%");

			}

			Fahren();

		} else {

			JOptionPane.showMessageDialog(null, "Ungültige Literanzahl gewählt.");
			Tanken();

		}

	}

	static void Fahren() {

		String Richtung = JOptionPane
				.showInputDialog("In welche Richtung möchten Sie fahren?(Norden, Osten, Süden, Westen, Ende)" + "\n"
						+ "Treibstoffstand: " + Treibstoff);

		if (Richtung.equalsIgnoreCase("Norden")) {

			JOptionPane.showMessageDialog(null, "Sie fahren nach Norden.");

			if (Richtung.equalsIgnoreCase(LRichtung)) {

				Oben = Oben - 3;

			} else {

				LRichtung = Richtung;

			}

			Treibstoff--;
			Ncount++;
			Count++;
			Polizei();

		} else if (Richtung.equalsIgnoreCase("Süden")) {

			JOptionPane.showMessageDialog(null, "Sie fahren nach Süden.");

			if (Richtung.equalsIgnoreCase(LRichtung)) {

				Oben = Oben - 3;

			} else {

				LRichtung = Richtung;

			}

			Treibstoff--;
			Scount++;
			Count++;
			Polizei();

		} else if (Richtung.equalsIgnoreCase("Westen")) {

			JOptionPane.showMessageDialog(null, "Sie fahren nach Westen.");

			if (Richtung.equalsIgnoreCase(LRichtung)) {

				Oben = Oben - 3;

			} else {

				LRichtung = Richtung;

			}

			Treibstoff--;
			Wcount++;
			Count++;
			Polizei();

		} else if (Richtung.equalsIgnoreCase("Osten")) {

			JOptionPane.showMessageDialog(null, "Sie fahren nach Osten.");

			if (Richtung.equalsIgnoreCase(LRichtung)) {

				Oben = Oben - 3;

			} else {

				LRichtung = Richtung;

			}

			Treibstoff--;
			Ocount++;
			Count++;
			Polizei();

		} else if (Richtung.equalsIgnoreCase("Ende")) {

			Ende();

		} else {

			JOptionPane.showMessageDialog(null, "Ungültige Eingabe.");

		}

	}

	static void Ende() {

		String Antwort = JOptionPane.showInputDialog("Sind Sie sicher, dass Sie das Spiel beenden wollen?(Ja, Nein)");

		if (Antwort.equalsIgnoreCase("Ja")) {

			JOptionPane.showMessageDialog(null,
					"Sie sind gefahren:" + "\n" + "Insgesamt: " + Count + "\n" + "Nach Norden: " + Ncount + "\n"
							+ "Nach Osten: " + Ocount + "\n" + "Nach Süden: " + Scount + "\n" + "Nach Westen: " + Wcount
							+ "\n" + "Tankungen: " + Tcount);

			JOptionPane.showMessageDialog(null, "Spiel beendet.");

			Läuft = false;

		} else if (Antwort.equalsIgnoreCase("Nein")) {

		} else {

			JOptionPane.showMessageDialog(null, "Ungültige Eingabe.");

		}

	}

}
