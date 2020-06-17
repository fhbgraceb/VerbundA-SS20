package aufgabe06;

/*
 * Beispielgruppe 5 - eindimensionale Arrays
 * 
 * WuerfelStatistikArray
 * 
 * Führen Sie zuerst mit Hilfe eines Zufallszahlengenerators 100 Würfe
 * mit einem Würfel durch und speichern Sie die Ergebnisse in einem Array. 
 * 
 * Geben Sie danach aus, wie oft jede mögliche Augenzahl geworfen wurde.
 */

public class WuerfelStatistikArray 
{

	public static void main(String[] args) 
	{
		final int anzahlWurfe = 100;
		int augenzahl;
		int[] augenzahlen = new int[anzahlWurfe];
		int[] statistik = new int[6];
		
		for (int i = 0; i < augenzahlen.length; i++)
		{
			augenzahl = (int)(Math.random() * (6 - 1 + 1) + 1);
			statistik[augenzahl - 1]++;
		}
		
		for (int i = 0; i < statistik.length; i++)
		{
			System.out.printf("Anazhl der %d: %d\n", i + 1, statistik[i]);
		}
	}

}
