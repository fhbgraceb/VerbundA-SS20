package aufgabe04;

import java.util.Scanner;

public class Dreieck 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.println("*** Dreieckskategorisierung ***");
		System.out.println("Bitte die Seitenlängen eingeben.");
		System.out.print("Seite a: ");
		a = s.nextDouble();
		System.out.print("Seite b: ");
		b = s.nextDouble();
		System.out.print("Seite c: ");
		c = s.nextDouble();
		
		if ((a > 0) && (b > 0) && (c > 0) 
			&& (a + b > c) && (a + c > b) && (b + c > a))
		{
			if ((a == b) && (b == c))
			{
				System.out.println("Gleichseitig");
			}
			else
			{
				if ((a == b) || (b == c) || (a == c))
				{
					if ((a * a + b * b == c * c)
						|| (a * a + c * c == b * b)
						|| (b * b + c * c == a * a))
					{
						System.out.println("Gleichschenkelig und Rechtwinkelig.");
					}
					else
					{
						System.out.println("Gleichschenkelig.");
					}
				}
				else
				{
					if ((a * a + b * b == c * c)
						|| (a * a + c * c == b * b)
						|| (b * b + c * c == a * a))
					{
						System.out.println("Rechtwinkelig.");
					}
					else
					{
						System.out.println("Normal.");
					}
				}
			}
		}
		else
		{
			System.out.println("Kein Dreieck!");
		}
		s.close();
	}
}
