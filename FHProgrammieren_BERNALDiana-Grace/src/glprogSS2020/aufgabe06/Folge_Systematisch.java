package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Folge: 
 * 
 * �berpr�fen Sie, ob die Folge
 * 
 * 		ni+1 = ni / 2 f�r gerade ni
 * 		ni+1 = 3 * ni + 1 f�r ungerade ni
 * 
 * f�r unterschiedliche (beliebige) positive Startwerte n1
 * immer den Wert 1 erreicht.
 * 
 * L�sung: 
 * einfach alle m�glichen Zahlen als Startwert (n1) verwenden und sehen,
 * ob die saraus entsehende Folge einmal 1 wird.
 * 
 * Anmerkung:
 * Man k�nnte auch alle Zahlen in einem bestimmten Bereich testen,
 * also z.B. zwischen 1234567 und 2345678,
 * dazu m�sste man auch nMin definieren und die �u�ere Schleife 
 * statt bei 1 bei nMin starten lassen.
 */
public class Folge_Systematisch 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long nMax;	// Bis zu dieser Zahl soll getestet werden.
		long ni;	// damit der Startwert nicht �berschrieben wird.
		int i;		// Zum Mitz�hlen der Schritte (war nicht verlangt)
		
		System.out.println("                    *** Folge ***");
		System.out.println("                   !!! ACHTUNG !!!");
		System.out.println("Dieses Programm kann in einer Endlosschleife enden.");
		System.out.println("Dr�cken Sie nach einiger Zeit den Stop-Knopf.");
		System.out.println();
		System.out.print("Bis zu welcher Zahl soll getestet werden? ");
		nMax = s.nextLong();
		
		for (long n = 1; n <= nMax; n++)
		{
			System.out.println("n1 = " + n);
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
			System.out.printf("F�r n1 = %d endet die Folge nach %d Schritten bei 1.\n", n, i);
		}
	}

}
