package _glProg_2018_VZ_HT;

public class Beschuss 
{

	/*
	* Sie schießen 100 Mal auf ein quadratisches Brett, dass in 100 Felder (10 mal 10) eingeteilt ist.
	* Sie treffen zwar immer eines der Felder, aber durch diverse Einflüsse entscheidet jedes Mal der Zufall,
	* welches Feld sie getroffen haben.
Nach dieser Schussserie erzeugen Sie ein farbliches Muster, welches ein Feld des Brettes
-	in grüner Farbe darstellt, wenn es nie getroffen wurde
-	in blauer Farbe darstellt, wenn es maximal 2 Mal getroffen wurde
-	in roter Farbe darstellt, wenn es mehr als 2 Mal getroffen wurde.
Geben Sie abschließend sowohl das Brett aus, als auch wie viele grüne, blaue und rote Felder ihr Schussergebnis hervorbrachte.
Beispielausgabe:
 grün  blau  blau  grün  blau  blau  grün  blau  grün  blau
 grün  blau  grün  blau  grün  grün  blau  blau  blau  blau
 grün  blau  rot   rot   blau  grün  grün  grün  blau  blau
 grün  blau  rot   blau  blau  blau  blau  blau  grün  blau
 blau  grün  blau  rot   grün  grün  rot   grün  blau  grün
 blau  grün  blau  grün  grün  grün  grün  grün  grün  blau
 grün  blau  grün  blau  grün  blau  blau  blau  rot   blau
 blau  blau  blau  blau  grün  blau  blau  blau  blau  blau
 grün  blau  blau  blau  blau  grün  blau  rot   grün  blau
 blau  rot   blau  blau  blau  blau  rot   blau  blau  blau

Grüne Felder: 33
Blaue Felder: 58
Rote Felder: 9

	* */

	public static void main(String[] args) 
	{
		final int groesse = 10;
		final int versuche = 100;
		int[][] anzahl = new int[groesse][groesse];
		int gruen = 0;
		int blau = 0;
		int rot = 0;
		
		for (int i = 1; i <= versuche; i++)
		{
			int x = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
			int y = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
			anzahl[x][y]++;
		}
		
		for (int i = 0; i < anzahl.length; i++)
		{
			for (int j = 0; j < anzahl[i].length; j++)
			{
				if (anzahl[i][j] == 0)
				{
					System.out.printf(" %-4s ", "gr�n");
					gruen++;
				}
				else if (anzahl[i][j] <= 2)
				{
					System.out.printf(" %-4s ", "blau");
					blau++;
				}
				else
				{
					System.out.printf(" %-4s ", "rot");
					rot++;
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Gr�ne Felder: " + gruen);
		System.out.println("Blaue Felder: " + blau);
		System.out.println("Rote Felder: " + rot);
	}

}
