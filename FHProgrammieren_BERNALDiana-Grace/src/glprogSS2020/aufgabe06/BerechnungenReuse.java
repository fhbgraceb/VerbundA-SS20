package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Hier werden verschiedene Berechnungen durch ein Menügesteuertes Programm aufgerufen.
 * 
 * Dabei werden bereits implementierte Unterprogramme aus anderen Programmen aufgerufen.
 * 
 */
public class BerechnungenReuse 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n;
		int auswahl;
		boolean weitermachen;
		
		// Zahl einlesen
		System.out.print("Bitte eine Zahl (n) eingeben: ");
		n = s.nextInt();
		
		weitermachen = true;
		do {
			// Auswahl ausgeben
			System.out.println("Was wollen Sie tun?");
			System.out.println("  1) Neuen Wert für n eingeben");
			System.out.println("  2) Primzahltest für n");
			System.out.println("  3) Die Summe n hoch n berechnen");
			System.out.println("  0) Programm beenden");
			
			// Wahl einlesen
			System.out.print("Ihre Wahl: ");
			auswahl = s.nextInt();
			
			// Abhängig von der Auswahl
			switch (auswahl)
			{
				case 1 :System.out.print("Bitte eine Zahl (n) eingeben: ");
					 	n = s.nextInt();
					break;
				case 2 :if (PrimzahlUP.istPrimzahl(n))
						{
							System.out.printf("Ja! Die Zahl %d ist eine Primzahl.\n", n);
						}
						else
						{
							System.out.printf("Nein! Die Zahl %d ist keine Primzahl.\n", n);
						}
					break;
				case 3 :System.out.println("Die Summe n hoch n ist: " + NHochNUP.nHochN(n));
					break;	
				case 0: weitermachen = false;
					break;
				default : System.out.println("Sie haben leider eine ungültige Wahl getroffen.");
			}
		} while (weitermachen);
		
		System.out.println("Auf Wiedersehen!");

	}

}
