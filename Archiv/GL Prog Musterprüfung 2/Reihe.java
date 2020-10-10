package _glProg_MP_2;

public class Reihe 
{
	/*Berechnen Sie die ersten 500 Glieder folgender Reihe und geben Sie das Ergebnis aus.
((1+7-5)/(2+4+6))*1-((2+8-6)/(3+5+7))*2+((3+9-7)/(4+6+8))*3-…
	* */

	public static void main(String[] args) 
	{
		double summe = 0;
		double glied;
		
		for (double i = 1; i <= 500; i++)
		{
			glied = ((i + (i + 6) - (i + 4)) / ((i + 1) + (i + 3) + (i + 5))) * i;
			if (i % 2 == 0)
			{
				summe -= glied;
			}
			else
			{
				summe += glied;
			}
			System.out.printf("%4.0f %7.2f -> %7.2f\n", i, glied, summe);
		}

		System.out.println(summe);
	}

}
