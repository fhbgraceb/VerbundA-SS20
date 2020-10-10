package aufgabe05;

/*
 * Beispielgruppe 3 - Bedingugen
 * 
 * Dreieck: 
 * Lesen Sie die 3 Seiten eines Dreiecks ein
 * und geben Sie aus, ob es sich um ein
 *  * rechtwinkeliges, 
 *  * gleichseitiges und/oder 
 *  * gleichschenkeliges
 * Dreieck handelt.
 * Beachten Sie, dass manche dieser Eigenschaften auch
 * kombiniert werden können. 
 * 
 * Geben Sie auch aus, 
 * wenn es kein Dreieck mit diesen Seitenlängen geben kann. 
 */
import java.util.Scanner;

public class Dreieck 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double a, b, c;
		boolean istSpeziellesDreieck; 		// true, false
		
		System.out.print("a: ");
		a = s.nextDouble();
		System.out.print("b: ");
		b = s.nextDouble();
		System.out.print("c: ");
		c = s.nextDouble();
		
		istSpeziellesDreieck = false;
		/*
		 * Damit es ein Dreieck ist müssen die Seiten größer 0 sein.
		 * 
		 * Zwei Seiten zusammen müssen länger als die dritte Seite sein.
		 * (Sonst "kommen diese nicht zusammen").
		 */
		if ((a + b > c) && (a + c > b) && (b + c > a) &&
			(a > 0) && (b > 0) && (c > 0))
		{
			/*
			 * gleichseitiges Dreieck
			 * (kann nicht auch rechtwinkelig oder glechseitig sein)
			 */
			if ((a == b) && (b == c))
			{
				System.out.println("Das ist ein gleichseitiges Dreieck.");
				istSpeziellesDreieck = true;
			}
			else	// rechtwinkelig und hgelichseitig kann kombiniert sein.
			{
				// _Alle 3_ Seiten sind nicht gleich lang.
				// rechtwinkelige Dreieck *
				double ahoch2 = a * a;
				double bhoch2 = b * b;
				double choch2 = c * c;
				/*
				 * Die Erklärung des folgenden Test befindet 
				 * sich im Programm Pythagoras.
				 */
				if (((ahoch2 + bhoch2 >= choch2 * 0.9999) && (ahoch2 + bhoch2 <= choch2 * 1.0001)) ||
					((ahoch2 + choch2 >= bhoch2 * 0.9999) && (ahoch2 + choch2 <= bhoch2 * 1.0001)) ||
					((bhoch2 + choch2 >= ahoch2 * 0.9999) && (bhoch2 + choch2 <= ahoch2 * 1.0001)))
				{
					System.out.println("Das Dreieck ist rechtwinkelig.");
					istSpeziellesDreieck = true;
				}
				// gleichschenkelige Dreieck *
				if ((a == b) || (b == c) || (a == c))
				{
					System.out.println("Das Dreieck ist gleichschenkelig.");
					istSpeziellesDreieck = true;
				}
			}
			if (! istSpeziellesDreieck)
			{
				System.out.println("Es handelt sich um ein ganz normales Dreieck.");
			}
		}
		else
		{
			System.out.println("Das ist kein Dreieck!");
		}
	}

}
