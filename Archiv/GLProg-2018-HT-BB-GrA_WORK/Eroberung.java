package _glProg_2018_BB_HT_WORK;

public class Eroberung 
{

	/*
	* Beim Spiel Eroberung geht es darum auf einem quadratischen Spielfeld, das aus 12 Zeilen mit jeweils 12 Spalten besteht,
	* entweder 4 Felder in einer Zeile oder 4 Felder in einer Spalte zu „erobern“.
Dabei kommt jedeR der MitspielerInnen reihum zum Zug. Durch Zufall wird ermittelt, welches Feld die Person in Besitz nehmen kann.
Ist das gewählte Feld bereits im Besitz einer anderen Person, so gibt es zwei Möglichkeiten:
•	Stimmt der Zeilenindex mit dem Spaltenindex überein, so wechselt das Feld den Besitzer/die Besitzerin.
•	Andernfalls ändert sich der Besitzstand des Feldes nicht.
SiegerIn des Spieles ist, wer zuerst in einer Reihe oder in einer Spalte 4 Felder in „erobert“ hat.
* Dabei müssen diese Felder nicht nebeneinander liegen.
Simulieren Sie obiges Spiel für Peter, Maria, Angelika und Mario und geben Sie den Sieger/die Siegerin aus.
#2darray
	* */

	public static void main(String[] args) 
	{
		final int groesse = 12;
		String[][] spielfeld = new String[groesse][groesse];
		String[] spielerInnen = new String[]{"Peter", "Maria", "Angelika", "Mario"};
		boolean siegerIn;
		int dran;
		int zeile;
		int spalte;
		int anzZeile;
		int anzSpalte;
		
		siegerIn = false;
		dran = 0;
		do
		{
			zeile = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
			spalte = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
			if ((spielfeld[zeile][spalte] == null) || (zeile == spalte))
			{
				spielfeld[zeile][spalte] = spielerInnen[dran];
				anzZeile = 0;
				anzSpalte = 0;
				for (int i = 0; i < groesse; i++)
				{
					if (spielerInnen[dran]. equals(spielfeld[zeile][i]))
					{
						anzZeile++;
					}
					if (spielerInnen[dran]. equals(spielfeld[i][spalte]))
					{
						anzSpalte++;
					}
				}
				if ((anzZeile >= 4) || (anzSpalte >= 4))
				{
					siegerIn = true;
				}
			}
			if (! siegerIn)
			{
				dran++;
				if (dran >= spielerInnen.length)
				{
					dran = 0;
				}
			}
		} while (! siegerIn);
		
		System.out.println("SiegerIn ist: " + spielerInnen[dran]);

	}

}
