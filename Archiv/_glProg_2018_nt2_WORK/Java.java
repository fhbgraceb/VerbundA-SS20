package _glProg_2018_nt2_WORK;

public class Java
{

	public static void main(String[] args) 
	{
		final int versuche = 100000;
		final int anzahl = 4;
		char[] buchstaben = new char[] {'A', 'E', 'J', 'V', 'Z'};
		String wort;
		int zufall;
		int treffer;
		
		treffer = 0;
		for (int versuch = 1; versuch <= versuche; versuch++)
		{
			wort = "";
			for (int i = 1; i <= anzahl; i++)
			{
				zufall = (int)(Math.random() * ((buchstaben.length - 1) - 0 + 1) + 0);
				wort += buchstaben[zufall];
				if (wortCheck(wort))
				{
					treffer++;
				}
			}
		}
		System.out.println("So oft wurde \"JAVA\" erzeugt: " + treffer);
	}
	
	public static boolean wortCheck(String wort)
	{
		final String testWort = "JAVA";
		return testWort.equals(wort);
	}

}
