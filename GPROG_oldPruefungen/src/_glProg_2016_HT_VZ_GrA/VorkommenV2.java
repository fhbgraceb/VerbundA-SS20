package _glProg_2016_HT_VZ_GrA;

/*
 * Eine etwas schönere Variante, bei der auch das Erzeugen der Zufallsstrings in einem
 * Unterprogramm durchgeführt wird.
 */
public class VorkommenV2 
{

	public static void main(String[] args) 
	{
		String string1 = "";
		String string2 = "";
		int laenge1 = 555;
		int laenge2 = 11;
		int anzahl;
		
		string1 = zufallsString(laenge1);
		string2 = zufallsString(laenge2);
		
		anzahl = vorkommen(string1, string2);
		
		System.out.println(anzahl);
	}
	
	public static int vorkommen(String suchString, String gesucht)
	{
		int anzahl = 0;
		
		for (int i = 0; i < gesucht.length(); i++)
		{
			for (int j = 0; j < suchString.length(); j++)
			{
				if (suchString.charAt(j) == gesucht.charAt(i))
				{
					anzahl++;
				}
			}
		}
		
		return anzahl;
	}
	
	public static String zufallsString(int n)
	{
		String text = "";
		for (int i = 1; i <= n; i++)
		{
			text += (char)(int)(Math.random() * ((int)'Z' - (int)'A' +  1) + (int)'A');
		}
		return text;
	}
}
