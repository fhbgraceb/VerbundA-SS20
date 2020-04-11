package mathematik;

import java.util.Scanner;

/*
 * Die double-Variable in Java arbeiten mit einer bestimmten Genauigkeit.
 * 
 * Bei Vergleichen von double-Werten kann es zu Problemen kommen,
 * wenn die beiden Zahlen nicht bis zur letzten Nachkommastelle übereinstimmen.
 * Dies kann bei Berechnungen oder der Eingabe von Werten leicht vorkommen.
 * 
 * Abhilfe: Vergleich mit Toleranz.
 * 
 * Anmerkung: Geben Sie verschiedene Näherungswerte (d.h. verschieden viel
 * Stellen nach dem Komma des genauen Wertes ein) und sehen Sie welche Vergleiche
 * passen und welche nicht. 
 */
public class Rundungsfehler 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double x;
		
		System.out.println("Wurzel aus 2: " + Math.sqrt(2));
		System.out.print("Wurzel aus 2 eingeben: ");
		x = s.nextDouble();
		
		System.out.println("Genauer Vergleich:");
		if (x == Math.sqrt(2))
		{
			System.out.println(" + Zahlen sind gleich.");
		}
		else
		{
			System.out.println(" - Zahlen sind verschieden.");
		}
		
		System.out.println("Toleranz von 1%:");
		if ((x >= Math.sqrt(2) * 0.99) && (x <= Math.sqrt(2) * 1.01))
		{
			System.out.println(" + Zahlen sind gleich.");
		}
		else
		{
			System.out.println(" - Zahlen sind verschieden.");
		}

		System.out.println("Toleranz von 0,01%:");
		if ((x >= Math.sqrt(2) * 0.9999) && (x <= Math.sqrt(2) * 1.0001))
		{
			System.out.println(" + Zahlen sind gleich.");
		}
		else
		{
			System.out.println(" - Zahlen sind verschieden.");
		}

		System.out.println("Toleranz von 0,0001%:");
		if ((x >= Math.sqrt(2) * 0.999999) && (x <= Math.sqrt(2) * 1.000001))
		{
			System.out.println(" + Zahlen sind gleich.");
		}
		else
		{
			System.out.println(" - Zahlen sind verschieden.");
		}
	}

}
