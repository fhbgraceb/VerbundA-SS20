package einheit4;

import java.util.concurrent.ThreadLocalRandom;

public class WuerfelMitDoWhile {

	public static void main(String[] args) {
		
		int versuche = 0;
		boolean nichtGefunden = false;
		
		int zufallszahl = 0;
		
		do {
			zufallszahl = ThreadLocalRandom.current().nextInt(1, 6 + 1);
			versuche++;
		} while(zufallszahl != 6);


		System.out.println("Sie haben ben�tigt " + versuche + " Versuche");

	}

}
