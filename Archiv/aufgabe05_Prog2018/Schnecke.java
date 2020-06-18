package aufgabe05;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Schnecke:
 * Eine Schnecke sitzt vor einer 4,5 Meter hohen Mauer.
 * Jeden Tag klettert sie 50 cm nach oben,
 * in jeder Nacht rutscht sie 10% ihrer Gesamthöhe nach unten.
 * 
 * An welchem Tag ist sie oben?
 */
public class Schnecke 
{

	public static void main(String[] args) 
	{
		final double mauerhoehe = 4.5;		// Meter
		final double hinauf = 0.5;			// Meter
		final double hinunter = 0.1;		// Prozent!
		double schneckenhoehe;				// derzeitige Höhe der Schnecke (Meter)
		int tage;
		    
		schneckenhoehe = 0;
		tage = 0;
		    
		// Schleife: bis die Schnecke oben ist
		while (schneckenhoehe < mauerhoehe)
		{
			// was an einem Tag passiert:
			schneckenhoehe = schneckenhoehe + hinauf;
			tage = tage + 1;
			// was in der Nacht passiert:
			// ist die Schnecke am Abend AUF der Mauer,
			// rutscht sie nicht mehr nach unten
			if (schneckenhoehe < mauerhoehe)
			{
				schneckenhoehe -= (schneckenhoehe * hinunter);
			}
		}

		System.out.println("Die Schnecke ist am " + tage + ". Tag auf der Mauer.");
	}

}
