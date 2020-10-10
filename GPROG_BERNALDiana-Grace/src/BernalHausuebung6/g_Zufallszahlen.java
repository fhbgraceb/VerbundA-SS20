package BernalHausuebung6;

public class g_Zufallszahlen {
	
	/* Generieren Sie 1000000 Zufallszahlen von 123400 bis 123499. 
	 * Geben Sie danach aus, wie oft jede dieser Zahlen erzeugt wurde.
	*/

	public static void main(String[] args) {
		final int min = 123400;
		final int max = 123499;
		final int anzahlZahlen = 1000000;
		int[] anzahl = new int[123499 - 123400 + 1];
		int zahl;
		
		for (int i = 1; i <= anzahlZahlen; i++)
		{
			zahl = (int)(Math.random() * (max - min + 1) + min);
			anzahl[zahl - min]++;
		}
		
		System.out.println("Die Zahlen wurden so oft erzeugt:  ");
		for (int i = 0; i < anzahl.length; i++) 
		{
			System.out.printf("%8d : %9d\n", i + min, anzahl[i]);
		}
	}

}
