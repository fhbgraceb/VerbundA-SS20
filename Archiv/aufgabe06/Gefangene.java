package aufgabe06;

public class Gefangene 
{

	public static void main(String[] args) 
	{
		final int anzahlZellen = 111;
		final int anzahlDurchgaenge = 66;
		/*
		 * Um sich die Umrechnung zwischen Java-Nummerierung (ab 0) 
		 * und menschlicher Nummerierung (ab 1)
		 * zu ersparen wird im Programm eine 0-te Zelle erstellt,
		 * die aber sonst ignoriert wird.
		 * 
		 * Bitte beachten Sie, dass es jetzt 112 Zellen gibt,
		 * die Nummer der letzten Zelle aber 111 ist,
		 * also kleiner als die Anzahl der Zellen (zellenOffen.length).
		 */
		boolean[] zellenOffen = new boolean[anzahlZellen + 1];
		int anzahlFrei;
		
		for (int nummer = 1; nummer < zellenOffen.length; nummer++)
		{
			zellenOffen[nummer] = false;
		}
		
		for (int durchgang = 1; durchgang <= anzahlDurchgaenge; durchgang++)
		{
			for (int nummer = 1; nummer < zellenOffen.length; nummer++)
			{
				if (nummer % durchgang == 0)
				{
					zellenOffen[nummer] = ! zellenOffen[nummer];
				}
			}
		}
		
		anzahlFrei = 0;
		for (int nummer = 1; nummer < zellenOffen.length; nummer++)
		{
			if (zellenOffen[nummer])
			{
				anzahlFrei++;
				System.out.println("Freigelassen wird Zelle Nummer " + nummer);
			}
		}
		System.out.println("Es wurden " + anzahlFrei + " Gefangene freigelassen.");
	}

}
