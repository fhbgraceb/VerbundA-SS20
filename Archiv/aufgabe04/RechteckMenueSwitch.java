package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingugen
 * 
 * RechteckMenue:
 * 
 * Lesen Sie die L�nge und Breite eines Rechtecks ein.
 * Fragen Sie danach den Benutzer, was berechnet werden soll. 
 * Durch die Eingabe von 
 * 		1	soll der Umfang
 * 		2 	soll die Fl�che
 * 		3 	soll die L�nge der Diagonale
 * des Rechtecks berechnet werden.
 * (Bei einer anderen Eingabe soll eine entsprechende
 *  Meldung ausgegeben werden).
 *  
 *   L�sung mit switch und mit Unterprogrammen
 */
public class RechteckMenueSwitch 
{
	
	public static double rechteckUmfang(double a, double b)
	{
		return (2 * a) + (2 * b);
	}
	
	public static double rechteckFlaeche(double a, double b)
	{
		return a * b;
	}
	
	public static double rechteckDiagonale(double a, double b)
	{
		return Math.sqrt((a * a) + (b * b));
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		// Variable definieren
		double a;
		double b;
		double umfang;
		double flaeche;
		double diagonale;
		short auswahl;
		
		// Seiten einlesen
		System.out.print("Bitte L�nge von a eingeben: ");
		a = s.nextDouble();
		System.out.print("Bitte L�nge von b eingeben: ");
		b = s.nextDouble();
		
		// Auswahl ausgeben
		System.out.println("Was wollen Sie berechnen?");
		System.out.println("  1) Umfang");
		System.out.println("  2) Fl�che");
		System.out.println("  3) Diagonale");
		
		// Wahl einlesen
		System.out.print("Ihre Wahl: ");
		auswahl = s.nextShort();
		
		// Abh�ngig von der Auswahl
		switch (auswahl)
		{
		case 1 : umfang = rechteckUmfang(a, b);
				System.out.println("Umfang: " + umfang);
			break;
		case 2 :flaeche = rechteckFlaeche(a, b);
				System.out.println("Fl�che: " + flaeche);
			break;
		case 3 :diagonale = rechteckDiagonale(a, b);
				System.out.println("Diagonale: " + diagonale);
			break;
		default : System.out.println("Ung�ltige Auswahl.");
		}
		
		System.out.println("Auf Wiedersehen!");
	}

}
