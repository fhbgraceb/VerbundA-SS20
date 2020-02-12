package aufgabe06;

/*
 * Beispielgruppe 5 - eindimensionale Arrays
 * 
 * Zufallszahlen
 * 
 * Generieren Sie 1000000 Zufallszahlen von 123400 bis 123499.
 * Geben Sie danach aus, wie oft jede dieser Zahlen erzeugt wurde.
 * 
 * Anmerkung:
 * Um Platz zu sparen wird 
 * 		die Zahl 123400 im Array an der Stelle 0 gezählt
 * 		die Zahl 123401    ...   an der Stelle 1
 * 	      ...    123402         ...            2
 *                         ...
 */
public class Zufallszahlen 
{

	public static void main(String[] args) 
	{
		final int minZahl = 123400;
		final int maxZahl = 123499;
		final int anzahlZahlen = 1000000;
		int[] anzahl = new int[123499 - 123400 + 1];
		int zahl;
		
		for (int i = 1; i <= anzahlZahlen; i++)
		{
			zahl = (int)(Math.random() * (maxZahl - minZahl + 1) + minZahl);
			anzahl[zahl - minZahl]++;
		}
		
		System.out.println("So oft wurden die Zahlen erzeugt: ");
		for (int i = 0; i < anzahl.length; i++) 
		{
			System.out.printf("%8d : %9d\n", i + minZahl, anzahl[i]);
		}
	}

}
