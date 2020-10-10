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
 * Die Lösung erfolgt durch ausprobieren ("Brute Force") aller Möglichkeiten
 * 
 */

public class HerrHuber 
{

	public static void main(String[] args) 
	{
		int summe = 43;
		int produkt = 6720;
		
		for (int jahr1 = 1; jahr1 <= summe; jahr1++) 
		{
			for (int jahr2 = 1; jahr2 <= summe; jahr2++) 
			{
				for (int jahr3 = 1; jahr3 <= summe; jahr3++) 
				{
					for (int jahr4 = 1; jahr4 <= summe; jahr4++) 
					{
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
	}

}
