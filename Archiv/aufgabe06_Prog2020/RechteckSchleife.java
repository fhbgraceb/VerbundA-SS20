package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * RechteckSchleife:
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
 *   
 *   Erweiterung um Schleife, so dass mehrere Berechnungen durchgef�hrt werden k�nnen.
 */
public class RechteckSchleife 
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
		boolean weitermachen;
		
		// Seiten einlesen
		System.out.print("Bitte L�nge von a eingeben: ");
		a = s.nextDouble();
		System.out.print("Bitte L�nge von b eingeben: ");
		b = s.nextDouble();
		
		weitermachen = true;
		do {
			// Auswahl ausgeben
			System.out.println("Was wollen Sie tun?");
			System.out.println("  1) Umfang  berechnen");
			System.out.println("  2) Fl�che berechnen");
			System.out.println("  3) Diagonale berechnen");
			System.out.println("  4) Neue Werte eingeben");
			System.out.println("  0) Programm beenden");
			
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
				case 4: System.out.print("Bitte L�nge von a eingeben: ");
						a = s.nextDouble();
						System.out.print("Bitte L�nge von b eingeben: ");
						b = s.nextDouble();
					break;
				case 0: weitermachen = false;
					break;
				default : System.out.println("Ung�ltige Auswahl.");
			}
		} while (weitermachen);
		
		System.out.println("Auf Wiedersehen!");
	}

}
