package aufgabe08;

public class BubbleSortString 
{

	public static void main(String[] args) 
	{
		String wort;
		boolean vertauscht;
		int sortierteBuchstaben;
			// Nach dem ersten Durchlauf steht der grösste Buchstabe 
			// an der letzten Stelle.
			// Nach dem zweiten Durchlauf steht der zweitgrösste
			// Buchstabe an der vorletzten Stelle, etc.
			// Diese muss man nicht mehr vergleichen.
		int vergleichsCounter = 0;		// Zur Kontrolle des Aufwandes
		
		wort = "FASCHINGSANFANG";
		// wort = "ABCDEFGHIJ";

		sortierteBuchstaben = 0;
		
		System.out.println(wort);
		System.out.println("-------------------------");
		// Sobald man in einem Durchlauf keine Vertauschungen mehr 
		// durchführen muss, ist das Wort sortiert.
		// D.h. muss man vertauschen, so muss man noch einmal 
		// alle Buchstaben durchgehen.
		do
		{
			vertauscht = false;
			for (int i = 0; i < wort.length() - 1 - sortierteBuchstaben; i++)
			{
				vergleichsCounter++;
				if (wort.charAt(i) > wort.charAt(i + 1))
				{
					// Buchstaben vertauschen
					wort = wort.substring(0, i) +		// VOR dem ersten Buchstaben
							wort.charAt(i + 1) +		// 2. Buchstabe
							wort.charAt(i) +			// 1. Buchstabe
							wort.substring(i + 2);		// NACH dem zwieten Buchstaben
					System.out.println(wort);
					vertauscht = true;
				}
			}
			sortierteBuchstaben++;
		} while (vertauscht);
		System.out.println("-------------------------");
		System.out.println(wort);
		System.out.println("Vergleiche: " + vergleichsCounter);
	}

}
