package _glProg_2016_HT_VZ_GrA;

public class Vorkommen 
{

	public static void main(String[] args) 
	{
		String string1 = "";
		String string2 = "";
		int laenge1 = 555;
		int laenge2 = 11;
		int anzahl;
		
		for (int i = 1; i <= laenge1; i++)
		{
			string1 += (char)(int)(Math.random() * ((int)'Z' - (int)'A' +  1) + (int)'A');
		}
		for (int i = 1; i <= laenge2; i++)
		{
			string2 += (char)(int)(Math.random() * ((int)'Z' - (int)'A' +  1) + (int)'A');
		}
		
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
}
