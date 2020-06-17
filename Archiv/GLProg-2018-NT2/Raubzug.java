package _glProg_2018_nt2_WORK;

public class Raubzug 
{

	/*
	Sie öffnen die Tür zu der von Ihnen lange gesuchten verborgenen Schatzkammer,
	soweit das Auge reicht finden Sie 5 verschiedene Arten von Schätzen, von denen jeweils 4 Stück vorhanden sind.
	Die Schatzarten haben einen Wert von 500, 300, 110, 50 und 1, wobei der Wert der Schätze auch ihrem Gewicht entspricht.
In welchem maximalen Gesamtwert können Sie Schätze abtransportieren, wenn Sie nur ein Gesamtgewicht von 487 tragen können?
Entwickeln Sie hierzu das entsprechende Programm.

	* */

	public static void main(String[] args) 
	{
		int[] schaetze = new int[]{500, 300, 110, 50, 1};
		final int maxAnzahl = 4;
		final int maxGewicht = 487;
		int wert;
		int bestWert = 0;
		int[] bestAnzahl = new int[schaetze.length];
		
		
		for (int i0 = 0; i0 <= maxAnzahl; i0++)
		{
			for (int i1 = 0; i1 <= maxAnzahl; i1++)
			{
				for (int i2 = 0; i2 <= maxAnzahl; i2++)
				{
					for (int i3 = 0; i3 <= maxAnzahl; i3++)
					{
						for (int i4 = 0; i4 <= maxAnzahl; i4++)
						{
							wert = i0 * schaetze[0] + i1 * schaetze[1] + i2 * schaetze[2] + i3 * schaetze[3] + i4 * schaetze[4];
							if ((wert < maxGewicht) && (wert > bestWert))
							{
								bestWert = wert;
								bestAnzahl[0] = i0;
								bestAnzahl[1] = i1;
								bestAnzahl[2] = i2;
								bestAnzahl[3] = i3;
								bestAnzahl[4] = i4;
							}
						}
					}
				}
			}
		}
		System.out.println("Sie k�nnen Sch�tze im Wert (und Gewicht) von " + bestWert + " nach Hause tragen:");
		// Nicht verlangt, nur zur Kontrolle
		for (int i = 0; i < schaetze.length; i++)
		{
			System.out.println(bestAnzahl[i] + " Mal: " + schaetze[i]);
		}
	}

}
