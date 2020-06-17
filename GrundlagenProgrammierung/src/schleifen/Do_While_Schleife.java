package schleifen;


public class Do_While_Schleife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// DO WHILE Schleifen sind sogenannte
		// fußgesteuerte Scheifen, dass heisst, die Bedingung wann die
		// Schleife abbrechen soll, steht am Ende (Fuß) der Schleife.
		// Dies bedeutet, dass die Schleife immer zumindest 1x durchlaufen wird! 
		// DO While Schleifen eignen sich unter anderem vor allen dann, wenn man
		// nicht genau weis, wie oft die Schleife durchlaufen wird, um zum gewünschten 
		// Ergebnis zu kommen!
		// Wenn in der Schleife mehr als eine Anweisung erfolgt, muss
		// das {} gesetzt werden!
		
		//Wie oft muss gewürfelt werden, bis eine 6 kommt?
		int z = 0;
		do {
			z++;
		} while ((int) (Math.random()*6+1) !=6);
		System.out.print("es wurden " + z + " Würfe benötigt");
		
	}

}
