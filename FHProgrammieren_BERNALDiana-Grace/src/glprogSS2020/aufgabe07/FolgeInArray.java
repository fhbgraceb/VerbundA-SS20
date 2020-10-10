package aufgabe07;

/*
 * FolgeInArray: 
 * 
 * Berechnen Sie die Folge
 * 
 * 	1 ; ½ ; 1/3 ; ¼ ; 1/5 ; ...
 * 
 * bis zum 100. Glied (1/100) und speichern Sie alle Glieder in einem Array.
 * Geben Sie danach nur die geraden Elemente des Arrays 
 * (das 2., 4., 6., ... ) aus.
 * 
 *  Anmerkung:
 *  Um die Umrechnung zwischen der Nummer des Gliedes (1., 2. ...)
 *  und der Position im Array (0, 1, ...) zu erleichtern, wird das Array 
 *  "eine Nummer größer" gewählt und die erste Stelle im Array (0)
 *  ignoriert. 
 */
public class FolgeInArray 
{

	public static void main(String[] args) 
	{
		double[] glieder = new double[101];	// Da 0 frei bleibt, ein Platz mehr 
		
		/*
		 * Berechnen der Glieder
		 */
		for (int i = 1; i <= 100; i++)
		{
			/*
			 * Damit Java die Brüche richtig rechnet muss man i
			 * in double umwandeln.
			 */
			glieder[i] = 1 / (double)i;
		}
		
		/* 
		 * Ausgabe der Glieder:
		 * Es soll nur jedes 2. ausgegeben werden, beginnend mit dem 2.
		 * 
		 * Deshalb beginnt i bei 2 und wird immer um 2 erhöht.
		 */
		for (int i = 2; i <= 100; i += 2)
		{
			System.out.println(glieder[i]);
		}
	}

}
