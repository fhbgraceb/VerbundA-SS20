package aufgabe09;

import java.util.Scanner;

public class Zucker 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double[] mengen = new double[]{100, 20, 5, 1, 0.5, 0.1, 0.01};
		double menge, restmenge;
		int anzahl;
		
		System.out.print("Welche Menge wollen Sie haben?");
		menge = s.nextDouble();
		
		restmenge = menge;
		for (int i = 0; i < mengen.length; i++)
		{
			anzahl = (int)(restmenge / mengen[i]);
			System.out.printf("%6.2f kg %-11s %3d\n", mengen[i], (mengen[i] >= 1 ? "Säcke:" : "Schachteln:"), anzahl);
			restmenge -= anzahl * mengen[i];
		}
	}
}
