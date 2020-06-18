package _glProg_2016_HT_VZ_GrA;

public class ReihenBerechnung 
{

	public static void main(String[] args) 
	{
		double summe;
		double glied;
		boolean addieren = false;
		
		summe = 0;
		for (double i = 1; i <= 12345; i++)
		{
			glied = (i + 2) / i;
			if (addieren)
			{
				summe += glied;
			}
			else
			{
				summe -= glied;
			}
			// Nach jedem 3. Glied ändert sich das Vorzeichen
			if (i % 3 == 0)
			{
				addieren = ! addieren;
			}
		}
		System.out.println(summe);
	}

}
