package bernalPractice;

public class eineAndereReihe {

	public static void main(String[] args) {
			final int anzahlGlieder = 500;
			double summe = 0;
			double glied;
			
			for (double i = 1; i <= anzahlGlieder; i++) 
			{
				glied = i / (i + 1);
				if ((i % 5 == 1) || (i % 5 == 2)) 
				{
					summe += glied;
				} 
				else 
				{
					summe -= glied;
				}
			}
			
			System.out.println(summe);

	}

}
