package schleifen;

public class While_Schleife {
	
	public static void main(String[] args) {
		
	// WHILE Schleifen sind sowie FOR Schleifen sogenannte
	// kopfgesteuerte Scheifen, dass heisst, die Bedingung wann die
	// Schleife abbrechen soll, steht am Beginn (Kopf) der Schleife.
	// Dies bedeutet, dass die Schleife nicht unbedingt durchlaufen werden muss!
	// While Schleifen eignen sich unter anderem vor allen dann, wenn man
	// nicht genau weis, wie oft die Schleife durchlaufen wird, um zum gewünschten 
	// Ergebnis zu kommen!
	// Wenn in der Schleife mehr als eine Anweisung erfolgt, muss
	// das {} gesetzt werden!

	
		//Einfache Ausgabe der Zahlen 1-10 und deren Quadrate
		int i = 1;
		while(i <= 10) {
			System.out.println("Zahl " + i + " deren Quadrat: " + i*i);
			i++;
		}
		
		//Wie oft muss gewürfelt werden, bis eine 6 kommt?
		int z = 1;
		while ((int)(Math.random()*6)+1 != 6)	// Wenn Abbruchbedingung gleich
							// beim ersten Mal erfüllt ist (Zufallszahl = 6), dann
							// wird die Schleife niemals durchlaufen!
			z++;
		
		System.out.print("es wurden " + z + " Würfe benötigt");
		//
	}
}