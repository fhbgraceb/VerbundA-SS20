package BernalHausuebung8;

import java.util.Scanner;

/*
 * SeltsameFolge: Schreiben Sie ein Programm, das eine Folge, die mit einer einstelligen Zahl 
 * beginnt und nach untenstehendem Muster aufgebaut ist, ermittelt und ausgibt.
Beispiel: Es wurde 1 eingegeben. Untenstehende Folge ist das Ergebnis.
1,11,21,1211,111221,312211,13112221,1113213211,31131211131221, …
Die Folge entsteht durch die „Dokumentation“ der vorhergehenden Zahl:
1 = ein Einser => 11
11 = zwei Einser => 21
21 = ein Zweier ein Einser => 1211
1211 = ein Einser ein Zweier zwei Einser => 111221 usw.
Beispiel: Es wurde 3 eingegeben. Ergebnis ist
3,13,1113,3113,132113,1113122113,311311222113,….
3 = ein Dreier => 13 13 = ein Einser, ein Dreier => 1113 ...



....MOTIVATION WEG NICHT FERTIG
 * */

public class bspGruppe8_SeltsameFolge {

	public static String convert(String eingabe) {
		String ausgabe = "";
		int anzahl;
		char ziffer1;
		char ziffer2;

		if ((eingabe == null) || (eingabe.length() == 0)) {
			return eingabe;
		} else {
			ziffer1 = eingabe.charAt(0);
			anzahl = 1;
			for (int i = 1; i < eingabe.length(); i++) {
				ziffer2 = eingabe.charAt(i);
				if (ziffer1 == ziffer2) {
					anzahl++;
				} else {
					ausgabe = ausgabe + anzahl + ziffer1;
					ziffer1 = ziffer2;
					anzahl = 1;
				}
			}
			ausgabe = ausgabe + anzahl + ziffer1;

			return ausgabe;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl;
		String zahlString;

		do {
			System.out.print("Bitte Ziffer eingeben: ");
			zahl = s.nextInt();
		} while (!((zahl >= 1) && (zahl <= 9)));
		zahlString = "" + zahl;

		System.out.println(zahlString);
		for (int i = 1; i <= 10; i++) {
			zahlString = convert(zahlString);
			System.out.println(zahlString);
			
		s.close();
		}
	}
}
