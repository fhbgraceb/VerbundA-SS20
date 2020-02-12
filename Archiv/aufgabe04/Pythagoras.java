package aufgabe04;

/*
 * Beispielgruppe 3 - Bedingungen
 * 
 * Pythagoras: 
 * Lesen Sie die 3 Seiten eines Dreiecks ein und 
 * stellen Sie fest ob es sich um ein rechtwinkeliges Dreieck handelt. 
 */
import java.util.Scanner;

public class Pythagoras 
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
		
		if ((a + b > c) && (a + c > b) && (b + c > a) &&
			(a > 0) && (b > 0) && (c > 0))
		{
			ahoch2 = a * a;
			bhoch2 = b * b;
			choch2 = c * c;
			if ((ahoch2 + bhoch2 == choch2) 
				|| (ahoch2 + choch2 == bhoch2)
				|| (bhoch2 + choch2 == ahoch2))
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
