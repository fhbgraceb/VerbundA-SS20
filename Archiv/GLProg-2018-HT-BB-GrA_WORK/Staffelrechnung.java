package _glProg_2018_BB_HT_WORK;

import java.util.Scanner;

public class Staffelrechnung {

	/*
	Erstellen Sie ein Programm das die folgende Aufgabenstellung löst.
Nachdem der Benutzer eine Zahl eingegeben hat, wird eine Staffelrechnung ausgegeben,
d.h. die eingegebene Zahl wird zunächst mit 2 multipliziert, das Ergebnis dann mit 3, dieses Ergebnis wiederum mit 4,
… zuletzt wird mit 9 multipliziert.
Dieses Ergebnis wird nun durch 2 dividiert, das Ergebnis der Division durch 3, … zuletzt wird durch 9 dividiert.
Dabei sollte wieder die eingegebene Zahl herauskommen.
Geben Sie abschließend aus, ob dies der Fall ist oder nicht.
Die Ausgabe soll in folgender Form erfolgen – hier am Beispiel der Eingabe von 3:
3 * 2 = 6
6 * 3 = 18
18 * 4 = 72
72 * 5 = 360
360 * 6 = 2160
2160 * 7 = 15120
15120 * 8 = 120960
120960 * 9 = 1088640
1088640 / 2 = 544320
544320 / 3 = 181440
181440 / 4 = 45360
45360 / 5 = 9072
9072 / 6 = 1512
1512 / 7 = 216
216 / 8 = 27
27 / 9 = 3
Die Staffelrechnung wurde korrekt durchgeführt.

	* */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int eingabe;
		int ergebnis;
		
		System.out.println(" *** Staffelrechnung ***");
		System.out.print("Bitte eine Zahl eingeben: ");
		eingabe = s.nextInt();
		
		ergebnis = eingabe;
		for (int i = 2; i <= 9; i++) {
			System.out.print(ergebnis + " * " + i + " = ");
			ergebnis *= i;
			System.out.println(ergebnis);
		}
		for (int i = 2; i <= 9; i++) {
			System.out.print(ergebnis + " / " + i + " = ");
			ergebnis /= i;
			System.out.println(ergebnis);
		}
		
		if (ergebnis == eingabe) {
			System.out.println("Die Staffelrechnung wurde korrekt durchgef�hrt.");
		} else {
			System.out.println("Bei der Staffelrechnung ist ein Fehler passiert.");
		}
		
		s.close();
	}

}
