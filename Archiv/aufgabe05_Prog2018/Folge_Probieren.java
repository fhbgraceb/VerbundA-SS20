package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Folge: 
 * 
 * Überprüfen Sie, ob die Folge
 * 
 * 		ni+1 = ni / 2 für gerade ni
 * 		ni+1 = 3 * ni + 1 für ungerade ni
 * 
 * für unterschiedliche (beliebige) positive Startwerte n1
 * immer den Wert 1 erreicht.
 * 
 * Lösung: 
 * einfach verschiedene Werte für n1 eingeben und nachsehen,
 * ob die Folge mit diesem Wert 1 wird.
 */
public class Folge_Probieren 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long n;
		long ni;	// damit der Startwert nicht überschrieben wird.
		int i;		// Zum Mitzählen der Schritte (war nicht verlangt)
		
		System.out.println("                    *** Folge ***");
		System.out.println("                   !!! ACHTUNG !!!");
		System.out.println("Dieses Programm kann in einer Endlosschleife enden.");
		System.out.println("Drücken Sie nach einiger Zeit den Stop-Knopf.");
		System.out.println();
		System.out.print("Bitte geben Sie n ein: ");
		n = s.nextLong();
		
		i = 1;
		ni = n;
		while (ni != 1)
		{
			if (ni % 2 == 0)
			{		// ni ist gerade
				ni = ni / 2;
			}
			else
			{		// ni ist ungerade
				ni = 3 * ni + 1;
			}
			i++;
			System.out.printf("n(%d) = %d\n", i, ni);
		}
	}

}
