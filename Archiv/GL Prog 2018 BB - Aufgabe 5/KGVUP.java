package aufgabe05;

import java.util.Scanner;

/*
 * kgVUP: 
 * 
 * Schreiben Sie ein Unterprogramm, 
 * das als Parameter zwei ganze Zahlen erhält und das kgV 
 * (kleinstes gemeinsames Vielfaches) 
 * dieser Zahlen als Ergebnis zurückliefert.
 */
public class KGVUP 
{

	public static int kgV(int n1, int n2)
	{
		int max;		// Die grössere der beiden Zahlen
		int min;		// Die kleinere der beiden Zahlen
		int vielfaches;	// Speichert vielfache der grösseren Zahl
						// Ist dieses auch ein Vielfaches der kleineren,
						// so ist das kgV gefunden
						// min und max dienen nur der Beschleunigung,
						// man kann das Vielfache von einer beliebigen der
						// beiden Zahlen berechnen und mit der anderen testen
		
		if (n1 > n2)
		{
			max = n1;
			min = n2;
		}
		else
		{
			max = n2;
			min = n1;
		}
		vielfaches = max;
		
		while (! (vielfaches % min == 0))	// solange kein Vielfaches der Kleineren
		{
			vielfaches += max;				// Das nächste Vielfache der Grösseren nehmen
		}
		
		return vielfaches;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int zahl1;
		int zahl2;
		
		System.out.print("Bitte die erste Zahl eingeben: ");
		zahl1 = s.nextInt();
		System.out.print("Bitte die zweite Zahl eingeben: ");
		zahl2 = s.nextInt();
		
		System.out.println("Das kgV von " + zahl1 + " und " + zahl2 + " ist: " + kgV(zahl1, zahl2));
		
	}
}
