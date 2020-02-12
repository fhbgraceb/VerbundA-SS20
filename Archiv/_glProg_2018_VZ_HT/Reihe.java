package _glProg_2018_VZ_HT;

public class Reihe 
{

	public static void main(String[] args) 
	{
		double summe = 0;
		double glied;
		int anzahlGlieder = 1000;
		
		for (int i = 1; i <= anzahlGlieder; i++)
		{
			glied = (double)i / ((i + 1.0) * (i - 0.5));
			if ((i % 4 == 1) || (i % 4 == 0))
			{
				summe += glied;
			}
			else
			{
				summe -= glied;
			}
		}
		
		System.out.println("Das " + anzahlGlieder + ". Glied der Reihe lautet: " + summe);
	}

}
