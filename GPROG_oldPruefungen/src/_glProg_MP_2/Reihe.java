package _glProg_MP_2;

public class Reihe 
{

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
