package BernalHausuebung4;

public class e_alternierendeReihe {
	/*
	 5. AlternierendeReihe: Berechnen Sie die Reihe
		1 – ½ + 1/3 – ¼ + 1/5 - ...
		Bis zum 100. Glied (1 - ... - 1/100) und geben Sie dieses aus
	 */

	public static void main(String[] args) {
		System.out.print("e_alternierendeReihe_____________________\n");
		
		final int sum = 100;
		double reihe;
		
		reihe = 0;
		for (double i = 1; i <= sum; i++)
		{
			if (i % 2 == 0){	
				reihe -= 1 / i; 
			}
			else{
				reihe += 1 / i;
			}
		}
		
		System.out.println("Summe der Reihe bis zum " + sum + ". Glied ist " + reihe);
	}

}
