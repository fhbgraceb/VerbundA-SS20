package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * GGTEuklid: 
 * 
 * Lesen Sie zwei Zahlen ein und berechnen Sie den 
 * größten gemeinsamen Teiler (ggT) dieser Zahlen
 * mit dem klassischen Algorithmus von Euklid.
 * 
 * Lösung:
 * Der Algorithmus zur Bestimmung des ggT stammt aus den Unterlagen der LV Algorithmen.
 * Die eigentliche Berechnung wurde in ein Unterprogramm gepackt.
 * 
 */
public class GGTEuklid 
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
		int rest;
		
		rest = a % b;
		while (rest > 0)
		{
			a = b;
			b = rest;
			rest = a % b;
		}
		ggT = b;
		
		return ggT;
	}
}
