package aufgabe09;

import java.util.Scanner;

public class Verteilung 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		int anzahl;
		int varianten = 0;
		
		System.out.print("Geben Sie die Anzahl der Äpfel ein: ");
		anzahl = s.nextInt();
//		anzahl = 6;
		for (int anz1 = 1; anz1 < anzahl; anz1++)
		{
			for (int anz2 = 1; anz2 < anzahl; anz2++)
			{
				for (int anz3 = 1; anz3 < anzahl; anz3++)
				{
					if (anz1 != anz2 && anz2 != anz3 && anz1 != anz3 &&
						anz1 + anz2 + anz3 == anzahl)
					{
						System.out.println("Person 1 : " + anz1 + " Äpfel, Person 2: " + anz2 + " Äpfel, Person 3: " + anz3 + " Äpfel");
						varianten++;
					}
				}
			}
		}
		
		System.out.println();
		System.out.println("Es gibt " + varianten + " Varianten.");

	}

}
