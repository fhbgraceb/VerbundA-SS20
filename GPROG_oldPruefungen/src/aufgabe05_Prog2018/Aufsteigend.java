package aufgabe05_Prog2018;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 *
 * Aufsteigend: 
 * Lesen Sie beliebig viele Zahlen ein 
 * (Abschluss mit 0, Sie brauchen diese nicht zu speichern). 
 * 
 * Geben Sie an, ob die Zahlen aufsteigend sortiert sind.		[5]
 * 
 * Beispiele:
 * 
 * 1, 3, 6, 8, 13, 0 – aufsteigend sortiert
 * 2, 5, 7, 5, 8, 9, 0 – nicht aufsteigend sortiert (5 kommt nach 7, ist aber kleiner als 7)
 */
/*
 * Nachdem die Anzahl der Zahlen nicht bekannt ist
 * lässt sich dieses Beispiel (ohne Arrays) nicht mit Unterprogrammen lösen.
 */
public class Aufsteigend 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int vorigeZahl;
		int neueZahl;
		boolean aufsteigend;
		
		aufsteigend = true;
		System.out.print("Bitte geben Sie eine Zahl ein (Abschluss mit 0): ");
		neueZahl = s.nextInt();
		while (neueZahl != 0)
		{
			vorigeZahl = neueZahl;
			System.out.print("Bitte geben Sie eine Zahl ein (Abschluss mit 0): ");
			neueZahl = s.nextInt();
			if (neueZahl != 0)
			{
				if (! (vorigeZahl < neueZahl))
				{
					aufsteigend = false;
				}
			}
		}
		
		if (aufsteigend)
		{
			System.out.println("Die Zahlen sind aufsteigend sortiert.");
		}
		else
		{
			System.out.println("Die Zahlen sind nicht aufsteigend sortiert.");
		}
	}

}
