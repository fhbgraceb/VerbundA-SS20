package _glProg_2018_nt1_WORK;

public class Satz {
	
	public static void main(String[] args) {
		String worte [] = {"Tag", "ein", "schöner", "Heute", "ist"};
		String satz;
		int counter = 0;
		final int anzahlWorte = 5;
		
		for (int i = 1; i < 100000; i++) 
		{
			satz = "";
			for (int j = 1; j <= anzahlWorte; j++) 
			{
				if (j > 1) 
				{
					satz += " ";
				}
				satz += worte[(int)(Math.random()*(5))];
			}
			//System.out.println(satz);
			if (checksatz(satz)) {
				counter++;
			}
		}
		System.out.printf("Der Satz \"Heute ist ein schöner Tag\" wurde %d mal zufällig erzeugt.", counter);
	}

	public static boolean checksatz(String satz) 
	{
		return satz.equals("Heute ist ein schöner Tag"); 
	}
}
