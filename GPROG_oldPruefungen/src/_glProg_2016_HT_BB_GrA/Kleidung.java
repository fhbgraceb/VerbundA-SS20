package _glProg_2016_HT_BB_GrA;

public class Kleidung 
{

	public static void main(String[] args) 
	{
		String[] jacken = new String[]{"rot", "grün", "gelb"};
		String[] hosen = new String[]{"rot", "blau", "violett", "grün", "schwarz"};
		String[] schuhe = new String[]{"schwarz", "weiß", "rot", "braun"};
		int anzahl = 0;
		
		for (int j = 0; j < jacken.length; j++ )
		{
			for (int h = 0; h < hosen.length; h++)
			{
				for (int s = 0; s < schuhe.length; s++)
				{
					if ((! jacken[j].equals(hosen[h])) 
						&& (! hosen[h].equals(schuhe[s])) 
						&& (! jacken[j].equals(schuhe[s])))
						{
							System.out.println("Jacke: " + jacken[j] + " - Hose: " + hosen[h] + " - Schuhe: " + schuhe[s]);
							anzahl++;
						}
				}
			}
		}
		System.out.println("Anzahl der Kombinationen: " + anzahl);
	}

}
