package _glProg_2016_HT_VZ_GrA;

public class Zufallszahlen 
{
	public static void main(String[] args) 
	{
		final int grenze = 38;
		final int wiederholungen = 1221;
		int zufallszahl1;
		int zufallszahl2;
		int rest1;
		int rest2;
		int hunderter;
		int zehner;
		int einer;
		int summe;
		int anzahl = 0;
		
		for (int i = 1; i <= wiederholungen; i++)
		{
			zufallszahl1 = zufallszahl();
			zufallszahl2 = zufallszahl();
			einer = (zufallszahl1 % 10) + (zufallszahl2 % 10);
			rest1 = (zufallszahl1 - (zufallszahl1 % 10)) /10;
			rest2 = (zufallszahl2 - (zufallszahl2 % 10)) /10;
			zehner = (rest1 % 10) + (rest2 % 10);
			rest1 = (rest1 - (rest1 % 10)) /10;
			rest2 = (rest2 - (rest2 % 10)) /10;
			hunderter = rest1 + rest2;
			summe = einer + zehner + hunderter;
			if ((zufallszahl1 > zufallszahl2)
				&& (summe > grenze)
				&& (hunderter % einer == 0))
			{
				System.out.println("Zahl1: " + zufallszahl1 + " Zahl2: " + zufallszahl2);
				anzahl++;
			}
		}
		System.out.println("Anzahl der Zahlenpaare: " + anzahl);
	}

	// Nachdem man die Zufallszahl öfters braucht, wurde gleich ein UP programmiert
	public static int zufallszahl()
	{
		return (int)(Math.random() * (999 - 100 + 1) + 100);
	}
}
