package aufgabe06;

/*
 * ReiheInArray: 
 * 
 * Berechnen Sie die Reihe
 * 
 * 1 + ½ + 1/3 + ¼ + 1/5 + ...
 * 
 * also
 * 
 * 1 ; 1 + ½ ; 1 + ½ + 1/3 ; ...
 * 
 * bis zum 100. Glied (1 + ... + 1/100) und speichern Sie diese in einem Array. 
 * 
 * Geben Sie danach nur die ungeraden Elemente des Arrays 
 * (das 1., 3., 5., ... ) aus. 	
 * 
 *  Anmerkung:
 *  Um die Umrechnung zwischen der Nummer des Gliedes (1., 2. ...)
 *  und der Position im Array (0, 1, ...) zu erleichtern, wird das Array 
 *  "eine Nummer größer" gewählt und die erste Stelle im Array (0)
 *  ignoriert. 
 */
public class ReiheInArray 
{

	public static void main(String[] args) 
	{
		double[] glieder = new double[101];	// Da 0 frei bleibt, ein Platz mehr 
		double glied;
		double summe;
		
		summe = 0;
		/*
		 * Berechnen der Glieder
		 */
		for (int i = 1; i <= 100; i++)
		{
			/*
			 * Damit Java die Brüche richtig rechnet muss man i
			 * in double umwandeln.
			 */
			glied = 1.0 / (double)i;
			summe += glied;
			glieder[i] = summe;
		}
		
		/* 
		 * Ausgabe der Glieder:
		 * Es soll nur jedes 2. ausgegeben werden, beginnend mit dem 1.
		 * 
		 * Deshalb beginnt i bei 1 und wird immer um 2 erhöht.
		 */
		for (int i = 1; i <= 100; i += 2)
		{
			System.out.println(glieder[i]);
		}
	}

}
