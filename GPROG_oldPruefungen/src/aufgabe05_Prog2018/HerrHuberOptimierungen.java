package aufgabe05_Prog2018;
/*
 * Beispielgruppe 4 - Schleifen
 * 
 * HerrHuber:
 * 
 * Herr Huber las in den letzten 4 Jahren 43 Bücher.
 * Das Produkt seiner in diesen 4 Jahren pro Jahr gelesenen Bücher beträgt 6720.
 * Er ist stolz darauf, dass er seinen Bücherkonsum von Jahr zu Jahr gesteigert hat,
 * und dass er im 4. Jahr 5 mal so viele Bücher las wie im ersten Jahr.
 * Berechnen Sie die Anzahl der von Herrn Huber pro Jahr gelesenen Bücher.
 *
 * Die Lösung erfolgt durch ausprobieren ("Brute Force") aller Möglichkeiten.
 * Hier werden der Reihe nach verschiedene Optimierungen in die Berechnung eingebaut,
 * wodurch die Berechnung beschleunigt wird.
 * 
 */

public class HerrHuberOptimierungen 
{

	public static void main(String[] args) 
	{
		int summe = 43;
		int produkt = 6720;
		int versuche;
		
		// Reines Brute Force
		versuche = 0;
		for (int jahr1 = 1; jahr1 <= summe; jahr1++) 
		{
			for (int jahr2 = 1; jahr2 <= summe; jahr2++) 
			{
				for (int jahr3 = 1; jahr3 <= summe; jahr3++) 
				{
					for (int jahr4 = 1; jahr4 <= summe; jahr4++) 
					{
						versuche++;
						if ((jahr1 + jahr2 + jahr3 + jahr4 == summe) 
								&& (jahr1 * jahr2 * jahr3 * jahr4 == produkt) 
								&& (jahr2 > jahr1) 
								&& (jahr3 > jahr2) 
								&& (jahr4 > jahr3) 
								&& (jahr4 == jahr1 * 5)) 
						{
							System.out.println("Von Herrn Huber gelesene Bücher:" 
									 + "\n1. Jahr: " + jahr1 
									 + "\n2. Jahr: " + jahr2 
									 + "\n3. Jahr: " + jahr3 
									 + "\n4. Jahr: " + jahr4);
						}
					}
				}
			}
		}
		System.out.println(" *** Versuche ohne Optimierungen: " + versuche);
		
		// Die Anmerkung, dass jedes Jahr mehr Bücher gelesen wurden, ist in die Schleifen eingebaut.
		versuche = 0;
		for (int jahr1 = 1; jahr1 <= summe; jahr1++) 
		{
			for (int jahr2 = (jahr1 + 1); jahr2 <= summe; jahr2++)
			{
				for (int jahr3 = (jahr2 + 1); jahr3 <= summe; jahr3++)
				{
					for (int jahr4 = (jahr3 + 1); jahr4 <= summe; jahr4++) 
					{
						versuche++;
						if ((jahr1 + jahr2 + jahr3 + jahr4 == summe) 
								&& (jahr1 * jahr2 * jahr3 * jahr4 == produkt) 
								&& (jahr4 == jahr1 * 5)) 
						{
							System.out.println("Von Herrn Huber gelesene Bücher:" 
									 + "\n1. Jahr: " + jahr1 
									 + "\n2. Jahr: " + jahr2 
									 + "\n3. Jahr: " + jahr3 
									 + "\n4. Jahr: " + jahr4);
						}
					}
				}
			}
		}
		System.out.println(" *** Versuche mit 1. Optimierung: " + versuche);
		
		// Hier wird auch die Obergrenze eingeschränkt.
		// Bücher, die in den Vorjahren gelesen wurden, sind von der Summe abgezogen.
		versuche = 0;
		for (int jahr1 = 1; jahr1 <= summe; jahr1++) 
		{
			for (int jahr2 = (jahr1 + 1); jahr2 <= (summe - jahr1); jahr2++) 
			{
				for (int jahr3 = (jahr2 + 1); jahr3 <= (summe - (jahr1 + jahr2)); jahr3++) 
				{
					for (int jahr4 = (jahr3 + 1); jahr4 <= (summe - (jahr1 + jahr2 + jahr3)); jahr4++) 
					{
						versuche++;
						if ((jahr1 + jahr2 + jahr3 + jahr4 == summe) 
								&& (jahr1 * jahr2 * jahr3 * jahr4 == produkt) 
								&& (jahr4 == jahr1 * 5)) 
						{
							System.out.println("Von Herrn Huber gelesene Bücher:" 
									 + "\n1. Jahr: " + jahr1 
									 + "\n2. Jahr: " + jahr2 
									 + "\n3. Jahr: " + jahr3 
									 + "\n4. Jahr: " + jahr4);
						}
					}
				}
			}
		}
		System.out.println(" *** Versuche mit 2. Optimierung: " + versuche);
		
		// Zwischen den Büchern des ersten und den Büchern des vierten Jahres besteht eine fixe Beziehung,
		// die nicht mehr gesucht werden muss.
		versuche = 0;
		for (int jahr1 = 1; jahr1 <= summe; jahr1++) 
		{
			for (int jahr2 = (jahr1 + 1); jahr2 <= (summe - jahr1); jahr2++) 
			{
				for (int jahr3 = (jahr2 + 1); jahr3 <= (summe - (jahr1 + jahr2)); jahr3++)
				{
					int jahr4 = jahr1 * 5;
					versuche++;
					if ((jahr1 + jahr2 + jahr3 + jahr4 == summe) 
							&& (jahr1 * jahr2 * jahr3 * jahr4 == produkt)) 
					{
						System.out.println("Von Herrn Huber gelesene Bücher:" 
								 + "\n1. Jahr: " + jahr1 
								 + "\n2. Jahr: " + jahr2 
								 + "\n3. Jahr: " + jahr3 
								 + "\n4. Jahr: " + jahr4);
					}
				}
			}
		}
		System.out.println(" *** Versuche mit 3. Optimierung: " + versuche);
		
		/*
		 * TODO
		 * Es sind noch weitere Optimierungen denkbar.
		 * So können im ersten Jahr keine 43 Bücher gelesen werden, da
		 * im zweiten Jahr zumindest jahr1 + 1
		 * im dritten Jahr jahr1 + 1 + 1
		 * und im 4. Jahr jahr1 * 5
		 * Bücher gelesen werden müssen, also maximal:
		 * 43 - (jahr1 + 1) - (jahr1 + 2) - (jahr1 * 5)
		 * obiges könnte man auch noch vereinfachen.
		 * 
		 *  Ähnliche Überlegungen kann man auch für die anderen Jahre anstellen,
		 *  wobei man da das Beispiel möglicherweise schon mathematisch gelöst hätte.
		 *  
		 *  Bei sehr komplexen Problemen, die auch sehr rechenintensiv sind und 
		 *  oft mit unterschiedlichen Eingangsdaten gelöst werden müssen 
		 *  (d.h. bei denen die Werte nicht fix vorgegeben sind)
		 *  kann es aber durchaus Sinn machen, einen gewissen Aufwand in die Programmierung zu stecken,
		 *  weil man sonst unter Umständen zu lange auf die Lösung warten muss.
		 */
	}
}
