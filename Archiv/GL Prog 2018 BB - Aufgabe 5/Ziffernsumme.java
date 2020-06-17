package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Ziffernsumme:
 * 
 * Schreiben Sie ein Programm, 
 * das eine ganze Zahl einliest 
 * und mit Hilfe der Ziffernsumme überprüft, 
 * ob die eingegebene Zahl durch 3 teilbar ist. 
 */
public class Ziffernsumme 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int zahl;
		int ziffer;
		int restZahl;
		int ziffernsumme;
		
		System.out.print("Bitte eine Zahl eingeben: ");
		zahl = s.nextInt();
		/*
		 * Damit das Programm auch für negative Zahlen geht,
		 * wird mit dem Absolutbetrag ("schneidet" das negative
		 * Vorzeichen ab) gerechnet.
		 */
		restZahl = Math.abs(zahl);

		/*
		 * Von der Zahl wird immer die letzte Ziffer "abgeschnitten"
		 * und zur Ziffernsumme addiert, bis die Restzahl "weg" (also 0) ist.
		 */
		ziffernsumme = 0;
		while (restZahl > 0)
		{
			ziffer = restZahl % 10;				// letzte Ziffer holen
			ziffernsumme += ziffer;				// zur Ziffernsumme addieren
			restZahl = (restZahl - ziffer) / 10;	// letzte Ziffer abschneiden

			// Kontrollausgabe
//			System.out.println("Ziffer: " + ziffer + " Summe: " + ziffernsumme + " Restzahl: " + restZahl);
		}
		
		if (ziffernsumme % 3 == 0)
		{
			System.out.println(zahl + " ist durch 3 teilbar.");
		}
		else
		{
			System.out.println(zahl + " ist nicht durch 3 teilbar.");
		}
	}

}
