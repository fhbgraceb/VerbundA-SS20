package BernalHausuebung6;

public class i_ZahlenMix {
	
	/* Generieren Sie ein Array mit 10 verschiedenen Zufallszahlen von 65 bis 90. 
	 * Stellen Sie dabei sicher, dass keine der Zahlen doppeltvorkommt
	*/

	public static void main(String[] args) {
		final int anzahlZahlen = 10;
		int[] zahlen = new int[anzahlZahlen];
		final int min = 65;
		final int max = 90;
		boolean newZahl;
		int zahl;

		for (int vacant = 0; vacant < zahlen.length; vacant++){
			do{
				zahl = (int)(Math.random() * (max - min + 1) + min);
				newZahl = true;

				for (int occupied = 0; occupied < vacant; occupied++){
					if (zahl == zahlen[occupied])	{
						newZahl = false;					
					}
				}
			} while (! newZahl);				
			zahlen[vacant] = zahl;			
		}
		
		for (int i = 0; i < zahlen.length; i++){
			System.out.println(zahlen[i]);
		}
	}

}
