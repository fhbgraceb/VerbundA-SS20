package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * GGT: 
 * 
 * Lesen Sie zwei Zahlen ein und berechnen Sie den 
 * größten gemeinsamen Teiler (ggT) dieser Zahlen.
 * 
 * Lösung:
 * Der Algorithmus zur Bestimmung des ggT stammt aus den Unterlagen,
 * Kapitel 2 - Algorithmen.
 */
public class GGT 
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

	public static int ggT(int zahl1, int zahl2)
	{
		int ggT;
		int rest;
		
		rest = zahl1 % zahl2;
		while (rest > 0)
		{
			zahl1 = zahl2;
			zahl2 = rest;
			rest = zahl1 % zahl2;
		}
		ggT = zahl2;
		
		return ggT;
	}
}
