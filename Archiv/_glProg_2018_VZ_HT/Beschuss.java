package _glProg_2018_VZ_HT;

public class Beschuss 
{

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
					System.out.printf(" %-4s ", "grün");
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
		System.out.println("Grüne Felder: " + gruen);
		System.out.println("Blaue Felder: " + blau);
		System.out.println("Rote Felder: " + rot);
	}

}
