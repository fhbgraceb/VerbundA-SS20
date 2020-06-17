package _glProg_2016_HT_BB_GrA;

public class Zufallszahlen 
{

	/*
	* Erstellen Sie ein Unterprogramm statistik an das zwei ganze Zahlen (anzahl und stellen) übergeben werden.
Im Unterprogramm erzeugen Sie dann anzahl zufällige Zahlen mit stellen Stellen.
* (Werden an das Unterprogramm die Zahlen 1000 und 3 übergeben, so werden von ihm 1000 3-stellige Zahlen erzeugt).
Als Ergebnis liefert das Unterprogramm, welche der Zahlen am häufigsten erzeugt wurde.
Sollten mehrere Zahlen gleich oft erzeugt worden sein, kann das Unterprogramm eine beliebige davon liefern.

	* */

	public static void main(String[] args) 
	{
		System.out.println(statistic(100, 2));
		System.out.println(statistic(1234, 3));
		System.out.println(statistic(12345, 4));
	}
	
	public static int statistic(int anzahl, int stellen)
	{
		int bester = 0;
		int besteZahl = -1;
		int min = (int)(Math.pow(10, stellen - 1));
		int max = (int)(Math.pow(10, stellen)) - 1;
		int[] zaehler = new int[max - min + 1];
		int zahl;
		
		for (int i = 1; i <= anzahl; i++)
		{
			zahl = (int)(Math.random() * (max - min + 1) + min);
			zaehler[zahl - min]++;
		}
		
		for (int i = 0; i < zaehler.length; i++)
		{
			if (zaehler[i] > bester)
			{
				bester = zaehler[i];
				besteZahl = i + min;
//				System.out.println(besteZahl + " - " + bester);
			}
		}
		return besteZahl;
	}

}
