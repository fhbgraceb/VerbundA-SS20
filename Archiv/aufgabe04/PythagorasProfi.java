package aufgabe04;

/*
 * Beispielgruppe 3 - Bedingungen
 * 
 * Pythagoras: 
 * Lesen Sie die 3 Seiten eines Dreiecks ein und 
 * stellen Sie fest ob es sich um ein rechtwinkeliges Dreieck handelt. 
 */
import java.util.Scanner;

public class PythagorasProfi 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double a, b, c;
		double ahoch2;
		double bhoch2;
		double choch2;
		
		System.out.print("a: ");
		a = s.nextDouble();
		System.out.print("b: ");
		b = s.nextDouble();
		System.out.print("c: ");
		c = s.nextDouble();
		
		/*
		 * Damit es ein Dreieck ist müssen die Seiten größer 0 sein.
		 * 
		 * Zwei Seiten zusammen müssen länger als die dritte Seite sein.
		 * (Sonst "kommen diese nicht zusammen").
		 */
		if ((a + b > c) && (a + c > b) && (b + c > a) &&
			(a > 0) && (b > 0) && (c > 0))
		{
			ahoch2 = a * a;
			bhoch2 = b * b;
			choch2 = c * c;
			/*
			 * Da Computer sehr genau rechnen, 
			 * die Eingabe der Seitenlängen aber nur auf ein paar Stellen
			 * genau erfolgt, muss beim Vergleich nach Pythogoras eine Toleranz erlaubt werden.
			 * 
			 * Beispiel:
			 * rechtwinkeliges Dreieck mit den Seiten
			 *  a und b gleich 1
			 *  c gleich Wurzel aus 2 (1^2 + 1^2 = 2)
			 *  
			 *  Wurzel aus 2 = 1.4142135623730951
			 *  
			 *  Durch untere Toleranz wird bei
			 *   c = 1,4142	- das Dreieck als rechtwinkelig akzeptiert
			 *   c = 1,4144 oder
			 *   c = 1,4141 - das Dreick nicht mehr als rechtwikelig gesehen 
			 *
			 * 
			 * Es müssen auch alle Kombinationen der Seiten getestet werden.
			 * 
			 * c muss nicht die Hypothenuse sein!
			 */
			if (((ahoch2 + bhoch2 >= choch2 * 0.9999) && (ahoch2 + bhoch2 <= choch2 * 1.0001)) ||
				((ahoch2 + choch2 >= bhoch2 * 0.9999) && (ahoch2 + choch2 <= bhoch2 * 1.0001)) ||
				((bhoch2 + choch2 >= ahoch2 * 0.9999) && (bhoch2 + choch2 <= ahoch2 * 1.0001)))
			{
				System.out.println("Das Dreieck ist rechtwinkelig.");
			}
			else
			{
				System.out.println("Das Dreick ist nicht rechtwinkelig.");
			}
		}
		else
		{
			System.out.println("Das ist kein Dreieck!");
		}
	}

}
