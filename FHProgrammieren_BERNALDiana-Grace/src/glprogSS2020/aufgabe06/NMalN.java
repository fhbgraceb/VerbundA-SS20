package aufgabe06;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * NMalN
 * 
 * Lesen Sie eine Zahl (n) ein und berechnen Sie mit einer Schleife:
 * 
 * 		1 * n + 2 * n + 3 * n + ... + n * n
 *
 */
public class NMalN 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long n;
		
		System.out.println(" *** n mal n ***");
		System.out.print("Bitte n eingeben: ");
		n = s.nextLong();
				
		System.out.println("Die Summe n mal n beträgt: " + nMalN(n));
	}
	
	public static long nMalN(long n)
	{
		long summe = 0;
		
		for (long i = 1; i <= n; i++)
		{
			summe += i * n;
		}
		
		return summe;
	}

}
