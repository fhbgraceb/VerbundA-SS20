package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * GGTBruteForce: 
 * 
 * Lesen Sie zwei Zahlen ein und berechnen Sie den 
 * größten gemeinsamen Teiler (ggT) dieser Zahlen
 * mit der Brute Force Methode.
 * 
 * Lösung:
 * Der Algorithmus zur Bestimmung des ggT stammt aus den Unterlagen der LV Algorithmen.
 * Die eigentliche Berechnung wurde in ein Unterprogramm gepackt.
 * 
 */
public class GGTBruteForce 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl1;
		int zahl2;
		int ggT;
		
		System.out.println(" *** ggT ***");
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		zahl1 = s.nextInt();
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		zahl2 = s.nextInt();
		
		ggT = ggT(zahl1, zahl2);
		
		System.out.printf("Der größte gemeinsame Teiler von %d ud %d ist: %d\n", zahl1, zahl2, ggT);
	}

	public static int ggT(int a, int b)
	{
		int ggT;
		
		if (a <= b)
		{
			ggT = a;
		}
		else
		{
			ggT = b;
		}
		while ((ggT >= 1) && ((a % ggT != 0) || (b % ggT != 0)))
		{
			ggT--;
		}
		
		return ggT;
	}
}
