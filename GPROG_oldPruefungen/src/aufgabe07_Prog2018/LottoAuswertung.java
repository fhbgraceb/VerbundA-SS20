package aufgabe07_Prog2018;

import java.util.Scanner;

/*
 * LottoAuswertung
 * 
 * Lesen Sie bis zu 50 Lottotipps ein, stellen Sie dabei sicher,
 * dass in keinem Tipp doppelte Zahlen vorkommen 
 * und nur solche von 1 bis 45 eingegeben werden. 
 * 
 * Simulieren Sie dann mittels Zufallszahlen die Ziehung 
 * (auch hier dürfen keine doppelten vorkommen). 
 * 
 * Geben Sie abschließend für jeden Tipp die Anzahl 
 * der richtigen Zahlen aus und ob er gewonnen hat 
 * (3, 4, 5 oder 6 Richtige; die Zusatzzahl zählt nicht) 
 * oder nicht.
 */
public class LottoAuswertung 
{
	/*
	 * Überprüft, ob eine Zahl in einem Array vorkommmt.
	 * Dabei wird jedoch nicht das ganze Array untersucht,
	 * sondern nur die ersten anzahl Zahlen.
	 */
	public static boolean kommtVor(int[] zahlen, int anzahl, int zahl)
	{
		boolean kommtVor = false;
		
		/*
		 * Falls anzahl größer als die Zahlen im Array 
		 * wird das ganze Array untersucht.
		 */
		if (anzahl > zahlen.length)
		{
			anzahl = zahlen.length;
		}
			
		for (int i = 0; i < anzahl; i++)
		{
			if (zahlen[i] == zahl)
			{
				kommtVor = true;
			}
		}
		return kommtVor;
	}
	
	/*
	 * Gibt ein eindimensionales Array mit zaheln in einer Zeile aus,
	 * wobei die zahlen durch Beistriche getrennt sind.
	 */
	public static void ausgabe(int[] zahlen)
	{
		for (int zahlNr = 0; zahlNr < zahlen.length; zahlNr++)
		{
			if (zahlNr > 0)
			{
				System.out.print(", ");
			}
			System.out.printf("%2d", zahlen[zahlNr]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		final int maxAnzahlTipps = 50;
		final int anzahlZahlen = 6;
		final int minZahl = 1;
		final int maxZahl = 45;
		final int minRichtige = 3;
		
		int tipps[][] = new int[maxAnzahlTipps][anzahlZahlen];
		int ziehung[] = new int[anzahlZahlen];
		
		int anzahlTipps = 0;
		boolean weiterEinlesen = true;
		int zahl = 0;
		int anzahlRichtige;

		// Tipps einlesen
		/*
		 *  Für Testzwecke beim Programmieren wurde die do-while-Schleife auskommentiert
		 *  und die folgenden fixen Werte im Programm verwendet.
		 */
//		tipps = new int[][]{{ 1,  2,  3,  4,  5,  6},
//							{ 7,  8,  9, 10, 11, 12},
//							{13, 14, 15, 16, 17, 18},
//							{19, 20, 21, 22, 23, 24},
//							{25, 26, 27, 28, 29, 30},
//							{31, 32, 33, 34, 35, 36},
//							{37, 38, 39, 40, 41, 42},
//							{43, 44, 45,  1,  2,  3}};
//		anzahlTipps = 8;
		System.out.println();
		System.out.println("Die Tipp-Abgabe:");
		do
		{
			for (int zahlNr = 0; zahlNr < anzahlZahlen; zahlNr++) 
			{
				System.out.printf("Bitte die %d. Zahl von Tipp %2d eingeben: ", zahlNr + 1, anzahlTipps + 1);
				zahl = s.nextInt();
				if (zahl < minZahl || zahl > maxZahl || kommtVor(tipps[anzahlTipps], anzahlZahlen, zahl))
				{
					System.out.println("Falsche Eingabe!");
					zahlNr--;
				}
				else
				{
					tipps[anzahlTipps][zahlNr] = zahl;
				}
			}
			anzahlTipps++;
			if (anzahlTipps >= maxAnzahlTipps)
			{
				weiterEinlesen = false;
			} 
			else
			{
				System.out.print("Wollen Sie noch einen weiteren Tipp abgeben (\"J\" für JA)? ");
				if (! s.next().equalsIgnoreCase("J"))
				{
					weiterEinlesen = false;
				}
			}
		} while (weiterEinlesen);
		
		// abgegebene Tipps ausgeben
		System.out.println();
		System.out.println("Die Auswertung:");
		for (int tippNr = 0; tippNr < anzahlTipps; tippNr++)
		{
			System.out.printf("Tipp Nr. %2d: ", tippNr + 1);
			ausgabe(tipps[tippNr]);
		}
		
		// Ziehung simulieren
		for (int zahlNr = 0; zahlNr < anzahlZahlen; zahlNr++)
		{
			zahl = (int)(Math.random() * (maxZahl - minZahl + 1) + minZahl);
			if (kommtVor(ziehung, zahlNr, zahl))
			{
				zahlNr--;
			}
			else
			{
				ziehung[zahlNr] = zahl;
			}
		}
		
		System.out.println();
		System.out.println("Die Ziehung:");
		ausgabe(ziehung);
 
		
		// Auswerten
		System.out.println();
		System.out.println("Die Auswertung:");
		for (int tippNr = 0; tippNr < anzahlTipps; tippNr++)
		{
			/*
			 *  Wie viele der Tippzahlen kommen bei der Ziehung vor?
			 *  [Es wurde oben sichergestellt, dass weder im Tipp,
			 *   noch in der Ziehung doppelte vorkommen].
			 *  Es wird jede Zahl des Tipps mit allen zahlen der Ziehung verglichen.
			 */
			anzahlRichtige = 0;
			for (int tippZahlNr = 0; tippZahlNr < anzahlZahlen; tippZahlNr++)
			{
				for (int ziehungZahlNr = 0; ziehungZahlNr < anzahlZahlen; ziehungZahlNr++)
				{
					if (tipps[tippNr][tippZahlNr] == ziehung[ziehungZahlNr])
					{
						anzahlRichtige++;
					}
				}
			}
			System.out.printf("Tipp Nr. %2d: %1d Richtige", tippNr, anzahlRichtige);
			// Zum Tester Ausgabe kann man minRichtige auf 2 setzen, 2 richtige kommen relativ oft vor!
			if (anzahlRichtige >= minRichtige)
			{
				System.out.print(" - GEWONNEN!!!");
			}
			System.out.println();
		}
	}

}
