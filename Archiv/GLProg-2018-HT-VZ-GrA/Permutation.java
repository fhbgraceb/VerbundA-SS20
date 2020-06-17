package _glProg_2018_VZ_HT;

public class Permutation 
{

	/*
	Erstellen Sie solange 2 Arrays mit jeweils 5 Zufallszahlen von 1 bis 9, bis ein Array eine Permutation des anderen ist.
Eine Permutation liegt dann vor, wenn in beiden Arrays die gleichen Zahlen stehen, nicht aber unbedingt an derselben Position.
Geben Sie die beiden Arrays aus und auch die Anzahl der Versuche, bis eine solche Permutation erreicht wurde.
Führen Sie die Überprüfung, ob die beiden Arrays Permutationen voneinander sind, in einem Unterprogramm durch.
Beispiele zu Permutationen:
zahlen1: 	1, 4, 9, 9, 3
zahlen2: 	9, 3, 4, 1, 9
Die beiden obigen Arrays sind Permutationen voneinander.
zahlen1: 	1, 3, 1, 3, 1
zahlen2: 	3, 1, 3, 1, 3
Die beiden obigen Arrays sind keine Permutationen voneinander.

	* */
	public static void main(String[] args) 
	{
		final int anzahl = 5;
		int[] zahlen1 = new int[anzahl];
		int[] zahlen2 = new int[anzahl];
		int versuche = 0;
		
		do
		{
			versuche++;
			for (int i = 0; i < zahlen1.length; i++)
			{
				zahlen1[i] = (int)(Math.random() * (9 - 1 + 1) + 1);
			}
			for (int i = 0; i < zahlen1.length; i++)
			{
				zahlen2[i] = (int)(Math.random() * (9 - 1 + 1) + 1);
			}
		}
		while (! permutation(zahlen1, zahlen2));
		
		System.out.println("Nach " + versuche + " Versuchen wurden Permutationen erzeugt.");
		for (int i = 0; i < zahlen1.length; i++)
		{
			System.out.print(zahlen1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < zahlen1.length; i++)
		{
			System.out.print(zahlen2[i] + " ");
		}
	}

	public static boolean permutation(int[] zahlen1, int[] zahlen2) 
	{
		boolean permutation = true;
		int anzahl1;
		int anzahl2; 
		
		for (int i = 0; i < zahlen1.length; i++) 
		{
			anzahl1 = 0;
			anzahl2 = 0;
			for (int j = 0; j < zahlen1.length; j++) 
			{
				if (zahlen1[i] == zahlen1[j]) 
				{
					anzahl1++;
				}
				if (zahlen1[i] == zahlen2[j]) 
				{
					anzahl2++;
				}
			}
			if (! (anzahl1 ==anzahl2)) 
			{
				permutation = false;
			}
		}
		return permutation;
	}
}
