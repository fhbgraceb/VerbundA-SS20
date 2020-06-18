package _glProg_2016_HT_BB_GrA;

public class Zufallszahlen 
{

	public static void main(String[] args) 
	{
		System.out.println(statistic(100, 2));
		System.out.println(statistic(1234, 3));
		System.out.println(statistic(12345, 4));
	}
	
	public static int statistic(int anzahl, int stellen)
	{
		int bester = 0;
		int besteZahl = -1;
		int min = (int)(Math.pow(10, stellen - 1));
		int max = (int)(Math.pow(10, stellen)) - 1;
		int[] zaehler = new int[max - min + 1];
		int zahl;
		
		for (int i = 1; i <= anzahl; i++)
		{
			zahl = (int)(Math.random() * (max - min + 1) + min);
			zaehler[zahl - min]++;
		}
		
		for (int i = 0; i < zaehler.length; i++)
		{
			if (zaehler[i] > bester)
			{
				bester = zaehler[i];
				besteZahl = i + min;
//				System.out.println(besteZahl + " - " + bester);
			}
		}
		return besteZahl;
	}

}
