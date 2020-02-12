package aufgabe05;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * alternierendeReihe: 
 * 
 * Berechnen Sie die Reihe
 * 
 * 1 – ½ + 1/3 – ¼ + 1/5 - ...
 *
 * Bis zum 100. Glied (1 - ... - 1/100) und geben Sie dieses aus.
 *
 */
public class AlternierendeReihe 
{

	public static void main(String[] args) 
	{
		final int glieder = 100;		// Erleichert die Änderung der Berechnung
		double reihe;
		
		reihe = 0;
		for (double i = 1; i <= glieder; i++)	// ohne double wären die Divisionen alle 0
		{
			if (i % 2 == 0)		// Bei geraden Gliedern (2, 4, ...) wird subtrahiert
			{	
				reihe -= 1 / i; 
			}
			else				// Sonst addiert
			{
				reihe += 1 / i;
			}
		}
		
		System.out.println("Die Summe der Reihe bis zum " + glieder + ". Glied ist: " + reihe);
	}
}
