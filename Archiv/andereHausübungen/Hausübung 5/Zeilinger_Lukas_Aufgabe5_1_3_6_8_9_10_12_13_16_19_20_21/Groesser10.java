package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

public class Groesser10 {

	public static void main(String[] args) 
	{
		final int grenze = 10;
		double counter = 1;
		double zaehler = 1;
		double summe = 0;
		
		while (summe < grenze) 
		{
			summe = summe + (zaehler/counter);
			System.out.println(summe);
			counter ++;
		}
		System.out.println("Ab dem "+counter+" Durchlauf ist die Reihe größer als 10");

	}

}
