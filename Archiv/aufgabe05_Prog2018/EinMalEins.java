package aufgabe05;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * EinMalEins:
 * 
 * Geben Sie das kleine 1 mal 1 aus.
 *  
 */

public class EinMalEins {

	public static void main(String[] args) 
	{
		for (int zahl1 =1; zahl1 <= 10; zahl1++) 
		{
			for (int zahl2 = 1; zahl2 <= 10; zahl2++) 
			{
				System.out.println(zahl1 + " * " + zahl2 + " = " + (zahl1 * zahl2));
			}
		}
	}

}
