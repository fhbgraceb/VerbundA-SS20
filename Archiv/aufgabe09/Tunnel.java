package aufgabe09;

public class Tunnel 
{

	public static void main(String[] args) 
	{
		int tunnelLaenge = 8040;	// GesamtLaenge am Ende
		int tag = 0;
		int tunnelKleinstadt = 0;	// Lanege von Kleinstadt aus
		int tunnelSmalltown = 0;	// analog
		int proTagKleinstadt = 70;	// Grabungen pro jeweiligem Tag
		int wochentagSmalltown = 80;
		int samstagSmalltown = 40;
		
		/*
		 *  Es wird so lange gegraben, bis die beiden Tunnel in Summe
		 *  die geforderte Gesamtlänge haben.
		 */
		while (tunnelKleinstadt + tunnelSmalltown < tunnelLaenge)
		{
			// Tag mitzählen
			tag++;
			// Grabung Kleinstadt (an jdem Tag dieselbe)
			tunnelKleinstadt += proTagKleinstadt;
			
			// Grabung Smalltown: an jedem Tag eine andere
			// 7 Tage in der Woche - Samstag ist der 6. Sonntag der 7. Tag
			// Feststellen welcher Tag mittels Modulo
			if (tag % 7 == 0) // Sonntag
			{
				// es wird nicht gegraben
			}
			else if (tag % 7 == 6)	// Samstag
			{
				tunnelSmalltown += samstagSmalltown;
			}
			else
			{
				tunnelSmalltown += wochentagSmalltown;
			}
		}
		
		System.out.println("Der Tunnel ist nach " + tag + " Tagen fertig.");
		System.out.println("Grableistung Kleinstadt: " + tunnelKleinstadt);
		System.out.println("Grableistung Smalltown: " + tunnelSmalltown);
	}

}
