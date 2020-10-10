package _glProg_2018_BB_HT;

public class Eroberung 
{

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
