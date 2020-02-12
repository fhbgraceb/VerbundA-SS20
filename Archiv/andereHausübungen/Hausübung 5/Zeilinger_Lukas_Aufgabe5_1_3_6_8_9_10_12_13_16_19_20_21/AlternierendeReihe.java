package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

public class AlternierendeReihe {

	public static void main(String[] args) 
	{
		final double zaehler = 1;
		double summe = 0;
		
		for (int i = 1; i <= 100; i++) 
		{
			if(i % 2 == 0)
			{
				summe = summe - (zaehler/i);
			}
			else if(i % 2 != 0)
			{
				summe = summe + (zaehler/i);
			}
			System.out.println(summe);
		}
		System.out.println("Ergebnis der Reihe = " +summe);

	}

}
