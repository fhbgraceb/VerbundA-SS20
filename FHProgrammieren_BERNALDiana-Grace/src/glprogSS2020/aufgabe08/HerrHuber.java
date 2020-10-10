package aufgabe08;

public class HerrHuber 
{

/*
 * 
 * HerrHuber:
 * Herr Huber las in den letzten 4 Jahren 43 B�cher.
 * Das Produkt seiner in diesen 4 Jahren pro Jahr gelesenen B�cher betr�gt 6720.
 * Er ist stolz darauf, dass er seinen B�cherkonsum von Jahr zu Jahr gesteigert hat,
 * und dass er im 4. Jahr 5 mal so viele B�cher las wie im ersten Jahr.
 * Berechnen Sie die Anzahl der von Herrn Huber pro Jahr gelesenen B�cher.
 *
 * Die L�sung erfolgt durch ausprobieren ("Brute Force") aller M�glichkeiten
 * Es lassen sich dabei viele Einschr�nkungen finden, daruf wird jedoch (bis auf eine) verzichtet.
 *
 * 
 */

	public static void main(String[] args) 
	{
		int jahr1, jahr2, jahr3, jahr4;
		
		for (jahr1 = 1; jahr1 <= 43; jahr1++)
		{
			// im 4. Jahr liest er 5 mal so viele B�cher wie im 1.
			jahr4 = jahr1 * 5;
			
			// im 2. jahr liest er mehr B�cher als im 1., aber weniger als im 4.
			for (jahr2 = jahr1 + 1; jahr2 <= jahr4; jahr2++)
			{
				// im 3. jahr liest er mehr B�cher als im 2., aber weniger als im 4.
				for (jahr3 = jahr2 + 1; jahr3 < jahr4; jahr3++)
				{
	                if ((jahr1 + jahr2 + jahr3 + jahr4 == 43) && (jahr1 * jahr2 * jahr3 * jahr4 == 6720))
	                {
	                	// L�sung gefunden
	                	System.out.println("Er hat in den 4 Jahren " + jahr1 + ", " + jahr2 + ", " + jahr3 + " und " + jahr4 + " B�cher gelesen.");
                    	// Programm weitermnachen lassen, falls es mehrere L�sungen gibt
	                }
				}
			}
		}
	}
}
