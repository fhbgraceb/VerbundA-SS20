package BernalHausuebung6;

public class f_WuerfelStatistikArray {
	
	/* Führen Sie zuerst mit Hilfe eines Zufallszahlengenerators 100 Würfe 
	 * mit einem Würfel durch und speichern Sie die Ergebnisse in einem Array. 
	 * Geben Sie danach aus, wie oft jede mögliche Augenzahl geworfen wurde.
	*/

	public static void main(String[] args) {
		final int anzahlWurfe = 100;
		int[] stat = new int[6];
		int wurf;
		int[] augenzahlen = new int[anzahlWurfe];

		
		for (int i = 0; i < augenzahlen.length; i++){
			wurf = (int)(Math.random() * (6 - 1 + 1) + 1);
			stat[wurf - 1]++;
		}
		
		for (int i = 0; i < stat.length; i++)
		{
			System.out.printf("Anzahl der %d: %d\n", i + 1, stat[i]);
		}
	}

}
